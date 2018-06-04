package com.example.mordy.tourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                ShulFragment tab1 = new ShulFragment();
                return tab1;
            case 1:
                RestaurantsFragment tab2 = new RestaurantsFragment();
                return tab2;
            case 2:
                SupermarketsFragment tab3 = new SupermarketsFragment();
                return tab3;
            case 3:
                HallsFragment tab4 = new HallsFragment();
                return tab4;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}