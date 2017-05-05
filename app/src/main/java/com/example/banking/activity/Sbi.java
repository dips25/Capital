package com.example.banking.activity;

import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toolbar;

import com.example.banking.activity.fragment.Car_frag;
import com.example.banking.activity.fragment.Edu_frag;
import com.example.banking.activity.fragment.Home_frag;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by biswa on 2/12/2017.
 */
public  class Sbi extends FragmentActivity {


    private TabLayout tablayout;
    private ViewPager viewPager;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank);

        setActionBar((Toolbar) findViewById(R.id.toolbar));
        getActionBar().setTitle("SBI");


        viewPager=(ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tablayout=(TabLayout) findViewById(R.id.tab);
        tablayout.setupWithViewPager(viewPager);


    }

    private void setupViewPager(ViewPager viewPager) {

        ViewPagerAdapter adapter=new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Edu_frag(),"EducationLoan");
        adapter.addFragment(new Home_frag(),"HomeLoan");
        adapter.addFragment(new Car_frag(),"CarLoan");
        viewPager.setAdapter(adapter);
    }



    class ViewPagerAdapter extends FragmentPagerAdapter{
        private final List<Fragment> mFragmentList=new ArrayList<>();
        private final List<String> mTitleList=new ArrayList<>();

        public ViewPagerAdapter(FragmentManager fm){
            super(fm);
        }



        public Fragment getItem(int position){
            return mFragmentList.get(position);
        }

        public int getCount(){
           return mFragmentList.size();
        }

        public void addFragment(Fragment fragment,String title){
            mFragmentList.add(fragment);
            mTitleList.add(title);
        }
        public CharSequence getPageTitle(int position){
            return mTitleList.get(position);
        }

    }


}





















