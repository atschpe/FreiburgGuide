package com.example.android.freiburgguide;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Enable user to swipe between fragments.
        ViewPager vp = (ViewPager) findViewById(R.id.viewpager);

        //Adapter to identify which fragment to show.
        FragmentAdapter fa = new FragmentAdapter(this, getSupportFragmentManager());

        //Set adapter to the viewpager.
        vp.setAdapter(fa);

        // The tabs holding the frames.
        TabLayout tl = (TabLayout) findViewById(R.id.tabs);

        /**
         * Connect the {@link TabLayout} with the {@link ViewPager}. {@link TabLayout} and
         * {@link ViewPager} will update the other respectively when swiping or clicking to a
         * fragment. This also supports the tab names by calling onPageTitle().
         **/
        tl.setupWithViewPager(vp);
    }
}
