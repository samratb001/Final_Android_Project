package com.example.guessgame;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    private String[] title={"Animals","Flowers"};
    int noOfTabs;

    public PagerAdapter(FragmentManager fm, int noOfTabs){
        super(fm);
        this.noOfTabs=noOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:Tab1 tab1=new Tab1();
                    return tab1;
            case 1:
                Tab2 tab2=new Tab2();
                    return tab2;
            default:return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }

    @Override
    public int getCount() {
        return noOfTabs;
    }
}
