package br.com.concretesolutions.dribbbleapi.app.test;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.siyamed.shapeimageview.CircularImageView;

import br.com.concretesolutions.dribbbleapi.R;
import br.com.concretesolutions.dribbbleapi.app.ShotDetailActivity;

/**
 * Created by kamilabrito on 8/30/15.
 */
public class ShotDetailActivityTest extends ActivityInstrumentationTestCase2<ShotDetailActivity> {

    private ShotDetailActivity shotDetailActivity;

    public ShotDetailActivityTest(Class<ShotDetailActivity> activityClass) {
        super(activityClass);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        shotDetailActivity = getActivity();
    }

    @SmallTest
      public void testVerifyINotNullShotDetailImage() {
        ImageView shotDetailImage = (ImageView) shotDetailActivity.findViewById(R.id.shot_detail_photo);
        assertNotNull("Shot detail image is not null", shotDetailImage);
    }

    @SmallTest
    public void testVerifyINotNullShotUserImage() {
        CircularImageView userImage = (CircularImageView) shotDetailActivity.findViewById(R.id.user_detail_image);
        assertNotNull("Shot user image is not null", userImage);
    }

    @SmallTest
    public void testVerifyINotNullShotDetailName() {
        TextView shotDetailName = (TextView) shotDetailActivity.findViewById(R.id.shot_detail_name);
        assertNotNull("Shot detail name is not null", shotDetailName);
    }

    @SmallTest
    public void testVerifyINotEmptyShotDetailName() {
        TextView shotDetailName = (TextView) shotDetailActivity.findViewById(R.id.shot_detail_name);
        final String expected = shotDetailName.getText().toString();
        assertNotNull("Shot detail name is not empty", !expected.isEmpty());
    }

    @SmallTest
     public void testVerifyINotNullShotViewCount() {
        TextView viewCount = (TextView) shotDetailActivity.findViewById(R.id.view_detail_count);
        assertNotNull("Shot view count is not null", viewCount);
    }

    @SmallTest
    public void testVerifyINotEmptyShotViewCount() {
        TextView viewCount = (TextView) shotDetailActivity.findViewById(R.id.view_detail_count);
        final String expected = viewCount.getText().toString();
        assertTrue("Shot view count is not empty", !expected.isEmpty());
    }

    @SmallTest
    public void testVerifyINotNullShotDescription() {
        TextView description = (TextView) shotDetailActivity.findViewById(R.id.shot_detail_description);
        assertNotNull("Shot description is not null", description);
    }

    @SmallTest
    public void testVerifyINotEmptyShotDescription() {
        TextView description = (TextView) shotDetailActivity.findViewById(R.id.shot_detail_description);
        final String expected = description.getText().toString();
        assertTrue("Shot description is not empty", !expected.isEmpty());
    }

    @SmallTest
    public void testVerifyINotNullShotUserName() {
        TextView userName = (TextView) shotDetailActivity.findViewById(R.id.user_detail_name);
        assertNotNull("Shot user name is not null", userName);
    }

    @SmallTest
    public void testVerifyINotEmptyShotUserName() {
        TextView userName = (TextView) shotDetailActivity.findViewById(R.id.user_detail_name);
        final String expected = userName.getText().toString();
        assertTrue("User name is not empty", !expected.isEmpty());
    }


}
