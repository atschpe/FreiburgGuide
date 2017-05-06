package com.example.android.freiburgguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * {@link FragmentAdapter} extends {@link FragmentPagerAdapter} providing the layout for each
 * item from the list of {@link Place} objects.
 */

public class FragmentAdapter extends FragmentPagerAdapter {

    //App ctxt
    private Context mContext;

    /**
     * Create a new {@link FragmentAdapter} object.
     *
     * @param context is the app ctxt.
     * @param fm      is the fragment manager keeping the state of each fragment in the adapter
     *                during swipes.
     */
    public FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Create the {@link Fragment} requested for a given page number.
     **/
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HistoryFragment();
        } else if (position == 1) {
            return new JewFragment();
        } else if (position == 2) {
            return new SchlossbergFragment();
        } else if (position == 3) {
            return new WarsFragment();
        } else {
            return new VicinityFragment();
        }
    }

    // Total number of pages.
    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.history_fragment);
        } else if (position == 1) {
            return mContext.getString(R.string.jew_fragment);
        } else if (position == 2) {
            return mContext.getString(R.string.schlossberg_fragment);
        } else if (position == 3) {
            return mContext.getString(R.string.wars_fragment);
        } else {
            return mContext.getString(R.string.vicinity_fragment);
        }
    }
}