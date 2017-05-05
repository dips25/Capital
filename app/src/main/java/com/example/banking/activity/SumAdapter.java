package com.example.banking.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.banking.activity.fragment.Home_frag;

import java.util.List;

/**
 * Created by biswa on 3/21/2017.
 */

public class SumAdapter extends ArrayAdapter<Id>  {

    private List<Id> idList;
    private Context context;
    double aDouble;

    int n1;


    public SumAdapter(Context context, List<Id> idList) {

        super(context, R.layout.list_result, idList);
        this.context = context;
        this.idList = idList;
    }

    public View getView(final int position, View convertview, ViewGroup group) {

        View view = convertview;

        if (view == null) {

            LayoutInflater v1 = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = v1.inflate(R.layout.list_result, null);
        }









        final Id id = idList.get(position);


            TextView month;
            TextView amount;
            TextView emi;
            TextView interest;
            TextView principal;
            TextView due;






            month=(TextView) view.findViewById(R.id.index);

            emi=(TextView) view.findViewById(R.id.emii);
            interest=(TextView) view.findViewById(R.id.intrest);
            principal=(TextView) view.findViewById(R.id.prncpl);
            due=(TextView) view.findViewById(R.id.de);












            month.setText((position+1)+"");

            emi.setText(String.valueOf(id.getEmi()));
            interest.setText(String.valueOf(id.getInterest()));
            principal.setText(String.valueOf(id.getPrincipal()));
            due.setText(String.valueOf(id.getDue()));



        Intent intent=new Intent(getContext(),Lists.class);
        Bundle bundle=new Bundle();
        bundle.putDouble("id",n1);
        intent.putExtras(bundle);









        return view;
    }




}
