package com.example.banking.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import static java.security.AccessController.getContext;

/**
 * Created by biswa on 4/19/2017.
 */

public class Calc extends Activity implements View.OnClickListener {

    String s1 = "";
    String s2 = "";
    String s3 = "";
    String s4 = "";
    String s5 = "";
    String s6 = "";
    String s7 = "";
    String s8 = "";
    String s9 = "";
    String s10 = "";
    String s11 = "";
    String s12 = "";
    String s13 = "";
    String s14 = "";


    double p = 1;
    double q;

    double f1 = 0;
    double f2 = 0;
    double f3 = 0;
    double f4 = 0;
    double f5 = 0;
    double f6 = 0;
    double f7 = 0;
    double f8 = 0;
    double f9 = 0;
    double f10 = 0;
    double f11 = 0;
    double f12 = 0;

    double fp;

    double em = 0;

    double d1;
    double d2;
    double d3;
    double d4;
    double d5;
    double d6;
    double d7;


    EditText et1;
    EditText et2;
    EditText et3;

    TextView tvv1;

    Button but1;
    Button but2;

    ImageView clear1;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc_lay);

        setActionBar((Toolbar) findViewById(R.id.tool));
        getActionBar().setTitle("EMI Calculator");

        et1 = (EditText) findViewById(R.id.textView5);
        et2 = (EditText) findViewById(R.id.edt1);
        et3 = (EditText) findViewById(R.id.ten1);

        but1 = (Button) findViewById(R.id.button);
        but2 = (Button) findViewById(R.id.button1);

        tvv1 = (TextView) findViewById(R.id.ect1);

        clear1=(ImageView) findViewById(R.id.clear1);

        clear1.setOnClickListener(new Button.OnClickListener() {

                                      public void onClick(View view) {

                                          f1 = 0;
                                          f2 = 0;
                                          f3 = 0;
                                          f4 = 0;
                                          f5 = 0;
                                          f6 = 0;
                                          f7 = 0;
                                          f8 = 0;
                                          f9 = 0;
                                          f10 = 0;

                                          et1.setText("");
                                          et2.setText("");
                                          et3.setText("");

                                          tvv1.setText("");
                                      }
                                  });
        but2.setOnClickListener(this);


        but1.setOnClickListener(new Button.OnClickListener() {

            public void onClick(View v) {

                s1 = et1.getText().toString();
                s2 = et2.getText().toString();
                s3 = et3.getText().toString();

                if (!isValidButton()){
                    return;
                }else {



                    f1 = Double.valueOf(s1);
                    f2 = Double.valueOf(s2);
                    f3 = Double.parseDouble(s3);

                    f4 = f2 / 1200;
                    f5 = 1 + f4;

                    for (fp = 1; fp <= f3; fp++) {

                        p = p * f5;


                    }

                    f6 = p;
                    f7 = p - 1;


                    em = f1 * f4 * (f6 / f7);
                    f8 = f1 * f4;
                    f9 = em - f8;
                    f10 = f1 - f9;


                    s4 = String.valueOf(em);


                    tvv1.setText("Rs. " + s4);
                }

            }


        });
    }

    private boolean isValidButton() {
        if (s1.isEmpty() && s2.isEmpty() && s3.isEmpty()) {
            Toast.makeText(this, "Enter Principal,Rate and Tenure.", Toast.LENGTH_LONG).show();
            return false;

        }else if (s1.isEmpty() && s2.isEmpty()) {
            Toast.makeText(this, "Enter Principal and Rate.", Toast.LENGTH_LONG).show();
            return false;

        }else if(s2.isEmpty() && s3.isEmpty()) {
            Toast.makeText(this, "Enter Rate and Tenure.", Toast.LENGTH_LONG).show();
            return false;

        }else if (s3.isEmpty() && s1.isEmpty()){
            Toast.makeText(this,"Enter Principal and Tenure.",Toast.LENGTH_LONG).show();
            return false;

        }else if (s1.isEmpty()){
            Toast.makeText(this,"Enter Principal.",Toast.LENGTH_LONG).show();
            return false;

        }else if (s2.isEmpty()){
            Toast.makeText(this,"Enter Rate.",Toast.LENGTH_LONG).show();
            return false;

        }else if (s3.isEmpty()){
            Toast.makeText(this,"Enter Tenure.",Toast.LENGTH_LONG).show();
            return false;
        }

        return true;
    }





    public void onClick(View view){

        s5=et1.getText().toString();
        s6=et2.getText().toString();
        s7=et3.getText().toString();
        s8=s4;


        if (!isValidBut()){
            return;
        }else {


        d1=Double.valueOf(s5);
        d2=Double.valueOf(s6);
        d3=Double.valueOf(s7);
        d4=Double.valueOf(s8);

        Intent intent=new Intent(Calc.this,Lists.class);
        Bundle bundle=new Bundle();
        bundle.putDouble("amount",d1);
        bundle.putDouble("interest",d2);
        bundle.putDouble("tenure",d3);
        bundle.putDouble("emi",d4);
        bundle.putDouble("interst",f8);
        bundle.putDouble("principal",f9);
        bundle.putDouble("outstanding",f10);
        intent.putExtras(bundle);
        startActivity(intent);

    }
}

    private boolean isValidBut() {

        if (s5.isEmpty() && s6.isEmpty() && s7.isEmpty() && s8.isEmpty() && f8==0 && f9==0 && f10==0){
            Toast.makeText(this,"Enter Amount,Rate and Tenure",Toast.LENGTH_SHORT).show();
            return false;

        }else if (s5.isEmpty() && s6.isEmpty() && s8.isEmpty() && f8==0 && f9==0 && f10==0) {
            Toast.makeText(this, "Enter Amount and Rate", Toast.LENGTH_SHORT).show();
            return false;

        }else if (s6.isEmpty() && s7.isEmpty() && s8.isEmpty() && f8==0 && f9==0 && f10==0){
            Toast.makeText(this,"Enter Rate and Tenure",Toast.LENGTH_SHORT).show();
            return false;

        }else if (s5.isEmpty() && s7.isEmpty() && s8.isEmpty() && f8==0 && f9==0 && f10==0){
            Toast.makeText(this,"Enter Amount and Tenure",Toast.LENGTH_SHORT).show();
            return false;

        }else if (s5.isEmpty() && s8.isEmpty() && f8==0 && f9==0 && f10==0){
            Toast.makeText(this,"Enter Amount",Toast.LENGTH_SHORT).show();
            return false;

        }else if (s6.isEmpty() && s8.isEmpty() && f8==0 && f9==0 && f10==0){
            Toast.makeText(this,"Enter Rate",Toast.LENGTH_SHORT).show();
            return false;

        }else if (s7.isEmpty() && s8.isEmpty() && f8==0 && f9==0 && f10==0){
            Toast.makeText(this,"Enter Tenure",Toast.LENGTH_SHORT).show();
            return false;

        }else if (s8.isEmpty() && f8==0 && f9==0 && f10==0){
            Toast.makeText(this,"Hit Get Details",Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;

    }
    }
