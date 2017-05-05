package com.example.banking.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toolbar;

import com.example.banking.activity.fragment.grameen.Carg_frag;
import com.example.banking.activity.fragment.grameen.Edug_frag;
import com.example.banking.activity.fragment.grameen.Homeg_frag;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by biswa on 2/12/2017.
 */
public class Gremeen extends FragmentActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grameen);

        setActionBar((Toolbar) findViewById(R.id.toolbar));
        getActionBar().setTitle("PUNJAB NATIONAL BANK");


        viewPager=(ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout=(TabLayout) findViewById(R.id.tab);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {

        ViewPagerAdapter adapter=new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Edug_frag(),"EducationLoan");
        adapter.addFragment(new Homeg_frag(),"HomeLoan");
        adapter.addFragment(new Carg_frag(),"CarLoan");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter{

        private final List<Fragment> mfragmentlist=new ArrayList<>();
        private final List<String> mtitlelist=new ArrayList<>();

        public ViewPagerAdapter(FragmentManager fm){

            super(fm);
        }

        public Fragment getItem(int position){

            return mfragmentlist.get(position);
        }

        public int getCount(){

            return mfragmentlist.size();
        }

        public void addFragment(Fragment fragment,String string){

            mfragmentlist.add(fragment);
            mtitlelist.add(string);
        }

        public CharSequence getPageTitle(int position){

            return mtitlelist.get(position);
        }
    }

}
