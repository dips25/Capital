package com.example.banking.activity.fragment.allah;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.banking.activity.Lists;
import com.example.banking.activity.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Homea_frag extends Fragment implements View.OnClickListener {

    String s1 = "";
    String s2 = "";
    String s3 = "";
    String s4 = "";
    String s5 = "";
    String s6 = "";
    String s7 = "";
    String s8 ="";
    String s9 ="";
    String s10 ="";
    String s11 ="";
    String s12="";
    String s13="";
    String s14="";


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

    double em = 0;

    double d1;
    double d2;
    double d3;
    double d4;
    double d5;
    double d6;
    double d7;


    double fp;

    EditText amount;
    EditText intr;
    EditText tenure;


    TextView emi;
    TextView interest;
    TextView principal;
    TextView outstanding;
    TextView details;

    ImageView sbi;
    ImageView clear;
    ImageView clkdtls;



    public Homea_frag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview= inflater.inflate(R.layout.fragment_homea_frag, container, false);
        amount = (EditText) rootview.findViewById(R.id.et1);
        intr = (EditText) rootview.findViewById(R.id.et2);
        tenure = (EditText) rootview.findViewById(R.id.et3);

        emi = (TextView) rootview.findViewById(R.id.tv5);
        interest = (TextView) rootview.findViewById(R.id.tv7);
        principal = (TextView) rootview.findViewById(R.id.tv9);
        outstanding = (TextView) rootview.findViewById(R.id.tv11);
        details=(TextView) rootview.findViewById(R.id.details);

        sbi = (ImageView) rootview.findViewById(R.id.img);
        clear = (ImageView) rootview.findViewById(R.id.clr);
        clkdtls=(ImageView) rootview.findViewById(R.id.clkdtls);


        sbi.setOnClickListener(this);

        clear.setOnClickListener(new Button.OnClickListener() {

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
                p = 1;
                em = 0;

                amount.setText("");
                intr.setText("");
                tenure.setText("");

                emi.setText("");
                interest.setText("");
                principal.setText("");
                outstanding.setText("");


            }
        });

        clkdtls.setOnClickListener(new Button.OnClickListener(){

            public void onClick(View view){

                s8=amount.getText().toString();
                s9=intr.getText().toString();
                s10=tenure.getText().toString();
                s11=emi.getText().toString();
                s12=interest.getText().toString();
                s13=principal.getText().toString();
                s14=outstanding.getText().toString();

                if(!isValidBut()){
                    return;
                }else {

                    d1 = Double.valueOf(s8);
                    d2 = Double.valueOf(s9);
                    d3 = Double.valueOf(s10);
                    d4 = Double.valueOf(s11);
                    d5 = Double.valueOf(s12);
                    d6 = Double.valueOf(s13);
                    d7 = Double.valueOf(s14);


                    Intent i = new Intent(getContext(), Lists.class);
                    Bundle bundle = new Bundle();
                    bundle.putDouble("amount", d1);
                    bundle.putDouble("interest", d2);
                    bundle.putDouble("tenure", d3);
                    bundle.putDouble("emi", d4);
                    bundle.putDouble("interst", d5);
                    bundle.putDouble("principal", d6);
                    bundle.putDouble("outstanding", d7);
                    i.putExtras(bundle);


                    startActivity(i);
                }
            }
        });


        return rootview;


    }

    private boolean isValidBut() {

        if (s8.isEmpty() && s9.isEmpty() && s10.isEmpty() && s11.isEmpty() && s12.isEmpty() && s13.isEmpty()){
            Toast.makeText(getContext(),"Enter Amount,Rate and Tenure",Toast.LENGTH_LONG).show();
            return false;

        }else if (s9.isEmpty() && s10.isEmpty() && s11.isEmpty() && s12.isEmpty() && s13.isEmpty() && s14.isEmpty()){
            Toast.makeText(getContext(),"Enter Rate and Tenure",Toast.LENGTH_LONG).show();
            return false;

        }else if (s9.isEmpty() && s8.isEmpty() && s11.isEmpty() && s12.isEmpty() && s13.isEmpty()  && s14.isEmpty()){
            Toast.makeText(getContext(),"Enter Amount and Rate",Toast.LENGTH_LONG).show();
            return false;

        }else if (s8.isEmpty() && s10.isEmpty() && s11.isEmpty() && s12.isEmpty() && s13.isEmpty() && s14.isEmpty()){
            Toast.makeText(getContext(),"Enter Amount and Tenure",Toast.LENGTH_LONG).show();
            return false;

        }else if (s8.isEmpty() && s11.isEmpty() && s12.isEmpty() && s13.isEmpty() && s14.isEmpty()){
            Toast.makeText(getContext(),"Enter Amount",Toast.LENGTH_LONG).show();
            return false;

        }else if (s9.isEmpty() && s11.isEmpty() && s12.isEmpty() && s13.isEmpty() && s14.isEmpty()) {
            Toast.makeText(getContext(), "Enter Rate", Toast.LENGTH_LONG).show();
            return false;

        }else if (s10.isEmpty() && s11.isEmpty() && s12.isEmpty() && s13.isEmpty() && s14.isEmpty()) {
            Toast.makeText(getContext(), "Enter Tenure", Toast.LENGTH_LONG).show();
            return false;
        }

        else if (s11.isEmpty() && s12.isEmpty() && s13.isEmpty() && s14.isEmpty()) {
            Toast.makeText(getContext(), "Press Logo", Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;
    }


    public void onClick(View v) {

        s1 = amount.getText().toString();
        s2 = intr.getText().toString();
        s3 = tenure.getText().toString();


        if (!isValidButton()) {

            return;

        } else {





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
            s5 = String.valueOf(f8);
            s6 = String.valueOf(f9);
            s7 = String.valueOf(f10);

            emi.setText(s4);
            interest.setText(s5);
            principal.setText(s6);
            outstanding.setText(s7);

        }


    }

    private Boolean isValidButton() {

        if (s1.isEmpty() && s2.isEmpty() && s3.isEmpty()) {
            Toast.makeText(getContext(), "Enter Amount,Rate and Tenure.", Toast.LENGTH_LONG).show();
            return false;

        }else if (s1.isEmpty() && s2.isEmpty()) {
            Toast.makeText(getContext(), "Enter Amount and Rate.", Toast.LENGTH_LONG).show();
            return false;

        }else if(s2.isEmpty() && s3.isEmpty()) {
            Toast.makeText(getContext(), "Enter Rate and Tenure.", Toast.LENGTH_LONG).show();
            return false;

        }else if (s3.isEmpty() && s1.isEmpty()){
            Toast.makeText(getContext(),"Enter Amount and Tenure.",Toast.LENGTH_LONG).show();
            return false;

        }else if (s1.isEmpty()){
            Toast.makeText(getContext(),"Enter Amount.",Toast.LENGTH_LONG).show();
            return false;

        }else if (s2.isEmpty()){
            Toast.makeText(getContext(),"Enter Rate.",Toast.LENGTH_LONG).show();
            return false;

        }else if (s3.isEmpty()){
            Toast.makeText(getContext(),"Enter Tenure.",Toast.LENGTH_LONG).show();
            return false;
        }

        return true;
    }

}




