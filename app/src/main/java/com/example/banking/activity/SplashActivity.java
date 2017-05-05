package com.example.banking.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by biswa on 4/20/2017.
 */

public class SplashActivity extends Activity {

       private static boolean splashloaded=false;

    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

        if(!splashloaded){

            setContentView(R.layout.splash_scr);
            int secondsDelayed=1;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(SplashActivity.this,TaskListActivity.class));
                    finish();
                }
            }, secondsDelayed * 2000);
            splashloaded=true;
        }else{

            Intent intent=new Intent(SplashActivity.this,TaskListActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            startActivity(intent);
            finish();
        }
    }
}
