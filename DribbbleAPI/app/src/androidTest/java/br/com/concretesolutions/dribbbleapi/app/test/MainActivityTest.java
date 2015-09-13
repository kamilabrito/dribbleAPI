package br.com.concretesolutions.dribbbleapi.app.test;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.ListView;

import com.orangegangsters.github.swipyrefreshlayout.library.SwipyRefreshLayout;

import br.com.concretesolutions.dribbbleapi.R;
import br.com.concretesolutions.dribbbleapi.app.MainActivity;

/**
 * Created by kamilabrito on 8/30/15.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity mainActivity;

    public MainActivityTest(Class<MainActivity> activityClass) {
        super(activityClass);
    }


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mainActivity = getActivity();
    }

    @SmallTest
    public void testVerifyINotNullList() {
        ListView listView = (ListView) mainActivity.findViewById(R.id.shots_list);
        assertNotNull("List is not null", listView);
    }

    @SmallTest
    public void testVerifyINotNullSwipeLayout() {
        SwipyRefreshLayout swipyRefreshLayout = (SwipyRefreshLayout) mainActivity.findViewById(R.id.swipyrefreshlayout);
        assertNotNull("Swipe Layout is not null", swipyRefreshLayout);
    }

}
