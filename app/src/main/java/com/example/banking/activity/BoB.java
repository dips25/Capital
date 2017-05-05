package com.example.banking.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toolbar;

import com.example.banking.activity.fragment.bob.Carb_frag;
import com.example.banking.activity.fragment.bob.Edub_frag;
import com.example.banking.activity.fragment.bob.Homeb_frag;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by biswa on 2/12/2017.
 */
public class BoB extends FragmentActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bob);

        setActionBar((Toolbar) findViewById(R.id.toolbar));
        getActionBar().setTitle("BANK OF BARODA");
        getActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager=(ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout=(TabLayout) findViewById(R.id.tab);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {

        ViewPagerAdapter adapter=new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Edub_frag(),"EducationLoan");
        adapter.addFragment(new Carb_frag(),"CarLoan");
        adapter.addFragment(new Homeb_frag(),"HomeLoan");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter{

        private final List<Fragment> mfragmentList=new ArrayList<>();
        private final List<String> mtitleList=new ArrayList<>();

        ViewPagerAdapter(FragmentManager fm){
            super(fm);
        }

        public Fragment getItem(int position){

            return mfragmentList.get(position);
        }

        public int getCount(){

            return mfragmentList.size();
        }

        public void addFragment(Fragment fragment,String string){

            mfragmentList.add(fragment);
            mtitleList.add(string);
        }

        public CharSequence getPageTitle(int position){

            return mtitleList.get(position);
        }
    }
}
