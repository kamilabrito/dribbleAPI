package br.com.concretesolutions.dribbbleapi.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import br.com.concretesolutions.dribbbleapi.R;
import br.com.concretesolutions.dribbbleapi.model.Shot;
import br.com.concretesolutions.dribbbleapi.util.HtmlToStringUtil;

/**
 * Created by kamilabrito on 8/29/15.
 */
public class ShotsAdapter extends ArrayAdapter {

    Context context;
    List <Shot> shotsList = new ArrayList <Shot>();
    ImageView shotImage;
    TextView viewsCount;
    TextView shotTitle;

    public ShotsAdapter(Context context, int resource, List objects) {
        super(context, resource, objects);
        this.context = context;
        this.shotsList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null)
        {
            LayoutInflater vi;
            vi = LayoutInflater.from(context);
            convertView = vi.inflate(R.layout.shot_row, null);
        }

        shotImage = (ImageView)convertView.findViewById(R.id.shot_photo);
        viewsCount = (TextView)convertView.findViewById(R.id.view_count);
        shotTitle = (TextView)convertView.findViewById(R.id.shot_name);

        Shot shot = shotsList.get(position);

        viewsCount.setText(shot.getViews_count());
        shotTitle.setText(HtmlToStringUtil.stripHtml(shot.getTitle()));

        Picasso.with(context)
                .load(shot.getImage_url())
                .placeholder(context.getResources().getDrawable(android.R.drawable.btn_star))
                .into(shotImage);

        return convertView;
    }

    @Override
    public int getCount() {
        return shotsList.size();
    }

    @Override
    public Shot getItem(int arg0) {
        return shotsList.get(arg0);
    }
}
