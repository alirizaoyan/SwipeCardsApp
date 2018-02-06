package com.example.ali.swipecardsapp.adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


import com.example.ali.swipecardsapp.fragment.SwipeCard;


public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    android.app.FragmentManager manager;


    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                SwipeCard swipeCard= new SwipeCard();
                return swipeCard;
            case 1:
                SwipeCard swipeCard2= new SwipeCard();
                return swipeCard2;
            default:
                SwipeCard swipeCard3= new SwipeCard();
                return swipeCard3;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
