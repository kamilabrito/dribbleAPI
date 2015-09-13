package br.com.concretesolutions.dribbbleapi.app;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.orangegangsters.github.swipyrefreshlayout.library.SwipyRefreshLayout;
import com.orangegangsters.github.swipyrefreshlayout.library.SwipyRefreshLayoutDirection;

import java.util.ArrayList;

import br.com.concretesolutions.dribbbleapi.R;
import br.com.concretesolutions.dribbbleapi.adapter.ShotsAdapter;
import br.com.concretesolutions.dribbbleapi.interfaces.IDribbbleAPI;
import br.com.concretesolutions.dribbbleapi.model.Page;
import br.com.concretesolutions.dribbbleapi.model.Shot;
import retrofit.RestAdapter;


public class MainActivity extends Activity {

    private static final String API_URL = "http://api.dribbble.com/";
    private static final String CURRENT_SHOT = "current_shot";

    ProgressDialog ringProgressDialog;
    ListView shotsListView;
    ShotsAdapter shotsAdapter;
    SwipyRefreshLayout swipyRefreshLayout;
    int currentPage = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shotsListView = (ListView) findViewById(R.id.shots_list);
        swipyRefreshLayout = (SwipyRefreshLayout) findViewById(R.id.swipyrefreshlayout);

        if (isNetworkAvailable()) {
            new GetShots().execute("1");
        }

        swipyRefreshLayout.setOnRefreshListener(new SwipyRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh(SwipyRefreshLayoutDirection direction) {
                if (isNetworkAvailable()) {

                    currentPage = currentPage + 1;
                    new GetShots().execute(currentPage+"");
                }
            }
        });
    }

    //check internet connection
    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager
                .getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    private class GetShots extends AsyncTask<String, Void, Page> {

        RestAdapter restAdapter;
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            ringProgressDialog = ProgressDialog.show(MainActivity.this,
                    "Please wait ...", "Downloading Data ...", true);
            ringProgressDialog.setCancelable(true);
            ringProgressDialog.show();

            restAdapter = new RestAdapter.Builder()
                    .setEndpoint(API_URL)
                    .build();

        }

        @Override
        protected Page doInBackground(String... params) {
            IDribbbleAPI methods = restAdapter.create(IDribbbleAPI.class);
            Page page = methods.getPage(params[0]);

            return page;
        }

        @Override
        protected void onPostExecute(Page result) {
            super.onPostExecute(result);
            if (result != null) {
                loadShotsInList(result.getShots());
            }
            if (ringProgressDialog.isShowing()) {
                ringProgressDialog.dismiss();
            }

            if(swipyRefreshLayout.isRefreshing()) {
                swipyRefreshLayout.setRefreshing(false);
            }

        }

    }

    private void loadShotsInList(final ArrayList<Shot> shots) {
        shotsAdapter = new ShotsAdapter(getApplicationContext(),R.layout.shot_row, shots);
        shotsAdapter.notifyDataSetChanged();
        shotsListView.setAdapter(shotsAdapter);

        shotsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Shot shot = shots.get(position);

                Bundle bundle = new Bundle();
                bundle.putSerializable(CURRENT_SHOT, shot);

                Intent intent = new Intent(getApplicationContext(),ShotDetailActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
    }

}
