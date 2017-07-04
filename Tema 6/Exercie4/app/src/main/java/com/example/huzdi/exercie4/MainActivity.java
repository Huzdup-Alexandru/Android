package com.example.huzdi.exercie4;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends FragmentActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.pager);
        FragmentManager fragmentManager = getSupportFragmentManager();
        viewPager.setAdapter(new MyAdapter(fragmentManager));



    }

    class MyAdapter extends FragmentStatePagerAdapter{
        private final int COUNT = 10;

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;
            if(position==0){
                fragment = new MyFragment1();
            }
            if(position==1){
                fragment = new MyFragment2();
            }
            if(position==2){
                fragment = new MyFragment3();
            }
            if(position==3){
                fragment = new MyFragment4();
            }
            if(position==4){
                fragment = new MyFragment5();
            }
            if(position==5){
                fragment = new MyFragment6();
            }
            if(position==6){
                fragment = new MyFragment7();
            }
            if(position==7){
                fragment = new MyFragment8();
            }
            if(position==8){
                fragment = new MyFragment9();
            }
            if(position==9){
                fragment = new MyFragment10();
            }

            return fragment;
        }

        @Override
        public int getCount() {
            return COUNT;
        }

        @Override
        public CharSequence getPageTitle(int position) {

            if(position==0){
                return "Framgent 1";
            }
            if(position==1){
                return "Framgent 2";
            }
            if(position==2){
                return "Framgent 3";
            }
            if(position==3){
                return "Framgent 4";
            }
            if(position==4){
                return "Framgent 5";
            }
            if(position==5){
                return "Framgent 6";
            }
            if(position==6){
                return "Framgent 7";
            }
            if(position==7){
                return "Framgent 8";
            }
            if(position==8){
                return "Framgent 9";
            }
            if(position==9){
                return "Framgent 10";
            }
            return null;
        }
    }
}
