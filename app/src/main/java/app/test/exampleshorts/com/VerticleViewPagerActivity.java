package app.test.exampleshorts.com;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.FrameLayout;

/**
 * Created by User2 on 29-04-2017.
 */
public class VerticleViewPagerActivity extends AppCompatActivity {

    VerticalViewPager verticalViewPager;
    static FrameLayout toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        toolbar = (FrameLayout) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        hide();
        verticalViewPager = (VerticalViewPager) findViewById(R.id.verticleViewPager);
        verticalViewPager.setAdapter(new VerticlePagerAdapter(this));
    }

    public static void hide() {
        toolbar.setVisibility(View.GONE);
    }

    public static void show() {
        toolbar.setVisibility(View.VISIBLE);
    }
}