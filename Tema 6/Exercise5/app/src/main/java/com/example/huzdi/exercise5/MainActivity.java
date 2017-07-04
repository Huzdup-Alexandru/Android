package com.example.huzdi.exercise5;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.content.Context;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends FragmentActivity {

    FragmentPagerAdapter adapterViewPager;

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager =  findViewById(R.id.pager);
        adapterViewPager = new SampleAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapterViewPager);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                Toast.makeText(MainActivity.this,"Selected page position: " + position,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

        static class SampleAdapter extends FragmentPagerAdapter {
            private final static int NUM_ITEMS = 6;

            public SampleAdapter(FragmentManager fm) {
                super(fm);

            }

            public int getCount() {
                return NUM_ITEMS;
            }

            public Fragment getItem(int position) {
                switch (position){
                    case 0:
                        return MyFragment1.newInstance(0,"Page # 1");
                    case 1:
                        return MyFragment1.newInstance(1,"Page # 2");
                    case 2:
                        return MyFragment2.newInstance(2,"Page # 3");
                    case 3:
                        return MyFragment2.newInstance(3,"Page # 4");
                    case 4:
                        return MyFragment3.newInstance(4,"Page # 5");
                    case 5:
                        return MyFragment3.newInstance(5,"Page # 6");
                    default:
                        return null;
                }

            }

            public String getPageTitle(int position) {
                return "Page " + position;
            }
        }

}
