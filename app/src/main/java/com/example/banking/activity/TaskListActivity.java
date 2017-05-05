package com.example.banking.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.widget.Toolbar;

public class TaskListActivity extends Activity {

    private DrawerLayout mdr;
    private ActionBarDrawerToggle toggle;
    private NavigationView navigation;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_list);

        setActionBar((Toolbar) findViewById(R.id.toolbar));

        mdr=(DrawerLayout) findViewById(R.id.activity_task_list);
        mdr.setBackgroundColor(getResources().getColor(R.color.white));
        toggle=new ActionBarDrawerToggle(this,mdr,R.string.open,R.string.close);

        mdr.addDrawerListener(toggle);
        toggle.syncState();

        navigation=(NavigationView) findViewById(R.id.nav);
        navigation.setNavigationItemSelectedListener(new  NavigationView.OnNavigationItemSelectedListener() {

            public boolean onNavigationItemSelected(MenuItem item){

                int id=item.getItemId();
                switch (id){

                    case R.id.nav_first:
                        Intent intent=new Intent(TaskListActivity.this,Calc.class);
                        startActivity(intent);
                        break;

                    case R.id.nav_sec:
                        Intent i=new Intent(TaskListActivity.this,Sett.class);
                        startActivity(i);
                        break;


                }

                return false;
            }


                                                     });

        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setTitle("Select Your Bank");




    }

    public boolean onOptionsItemSelected(MenuItem item){
        if (toggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
