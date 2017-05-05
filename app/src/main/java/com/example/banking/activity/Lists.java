package com.example.banking.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by biswa on 3/28/2017.
 */

public class Lists extends Activity {

    List<Id> idList;
    ListView idListView;
    public static SumAdapter adapter;

    double n;
    double n1;
    double n2;
    double n3;
    double n4;
    double n5;
    double n6;
    double n7;
    double n8;
    double n9;
    double n10;
    double n11;
    double n12;

    double i;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_chart);




        idList=getall();

        adapter = new SumAdapter(this, idList);

        idListView = (ListView) findViewById(R.id.chart);

        try {

            idListView.setAdapter(adapter);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

    }

    private List<Id> getall() {

        Bundle bundle=getIntent().getExtras();
        n=bundle.getDouble("amount");
        n1=bundle.getDouble("interest");
        n2=bundle.getDouble("tenure");
        n3=bundle.getDouble("emi");
        n4=bundle.getDouble("interst");
        n5=bundle.getDouble("principal");
        n6=bundle.getDouble("outstanding");

        List<Id>ids=new ArrayList<>();

        for(i=1;i<=n2;i++){

            Id id=new Id();


            id.setEmi(n3);
            id.setInterest(n4);
            id.setPrincipal(n5);
            id.setDue(n6);

            n4=n6*n1/1200;//interest
            n5=n3-n4;//principal
            n6=n6-n5;//leftover




            ids.add(id);

        }

        return ids;



    }
}