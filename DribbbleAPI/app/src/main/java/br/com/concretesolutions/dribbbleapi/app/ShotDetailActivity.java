package br.com.concretesolutions.dribbbleapi.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.siyamed.shapeimageview.CircularImageView;
import com.squareup.picasso.Picasso;

import br.com.concretesolutions.dribbbleapi.R;
import br.com.concretesolutions.dribbbleapi.model.Shot;
import br.com.concretesolutions.dribbbleapi.util.HtmlToStringUtil;

/**
 * Created by kamilabrito on 8/29/15.
 */
public class ShotDetailActivity extends Activity {

    private static final String CURRENT_SHOT = "current_shot";
    private CircularImageView userImage;
    private ImageView shotImage;
    private TextView shotViewCount;
    private TextView shotDescription;
    private TextView shotName;
    private TextView userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shot_detail_activity);

        Shot shot = new Shot();
        userImage = (CircularImageView) findViewById(R.id.user_detail_image);
        shotImage = (ImageView) findViewById(R.id.shot_detail_photo);
        shotViewCount = (TextView) findViewById(R.id.view_detail_count);
        shotDescription = (TextView) findViewById(R.id.shot_detail_description);
        userName = (TextView) findViewById(R.id.user_detail_name);
        shotName = (TextView) findViewById(R.id.shot_detail_name);

        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();

        if (bundle != null) {
            shot = (Shot) bundle.getSerializable(CURRENT_SHOT);
        }

        loadDetailsInfo(shot);

    }

    private void loadDetailsInfo(Shot shot) {
        Picasso.with(getApplicationContext())
                .load(shot.getImage_url())
                .placeholder(getApplicationContext().getResources().getDrawable(android.R.drawable.btn_star))
                .into(shotImage);

        Picasso.with(getApplicationContext())
                .load(shot.getPlayer().getAvatar_url())
                .placeholder(getApplicationContext().getResources().getDrawable(android.R.drawable.btn_star))
                .into(userImage);

        shotViewCount.setText(shot.getViews_count());
        userName.setText(HtmlToStringUtil.stripHtml(shot.getPlayer().getName()));
        shotDescription.setText(HtmlToStringUtil.stripHtml(shot.getDescription()));
        shotName.setText(HtmlToStringUtil.stripHtml(shot.getTitle()));


    }

}
