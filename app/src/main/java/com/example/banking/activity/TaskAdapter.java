package com.example.banking.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Dips25 on 2/3/2017.
 */

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.ViewHolder> {

    public static Context mcontext;
    

    private static String[] Banks = new String[]{
            "SBI",
            "UBI",
            "HDFC",
            "ICICI",
            "ALAHAABAD",
            "PNB",

    };
    private  final ArrayList<BankImg> mbankImgs;

    public TaskAdapter(Context context, ArrayList<BankImg> bankImgs){
        this.mcontext=context;
        this.mbankImgs=bankImgs;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        CardView v = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card_task, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        BankImg bankimg=mbankImgs.get(position);

        holder.imgv.setImageResource(bankimg.getImgId());



    }

    @Override
    public int getItemCount() {
        return Banks.length;
    }

    static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        CardView cardView;

        ImageView imgv;


        ViewHolder(CardView card) {
            super(card);
            cardView = card;
            cardView.setOnClickListener(this);

            imgv=(ImageView) card.findViewById(R.id.image);

            mcontext=cardView.getContext();
        }
        public void onClick(View view){

           final Intent intent;

            if (getAdapterPosition()==0){
               intent= new Intent(mcontext,Sbi.class);
            }else if (getAdapterPosition()==1){
                intent=new Intent(mcontext,Ubi.class);
            }else if (getAdapterPosition()==2){
                intent=new Intent(mcontext,Hdfc.class);
            }else if (getAdapterPosition()==3){
                intent=new Intent(mcontext,Icici.class);
            }else if (getAdapterPosition()==4){
                intent=new Intent(mcontext,Allah.class);
            }else if (getAdapterPosition()==5){
                intent=new Intent(mcontext,Gremeen.class);
            }else if(getAdapterPosition()==6){
                intent=new Intent(mcontext,Ing.class);
            }else{
                intent=new Intent(mcontext,BoB.class);
            }
            mcontext.startActivity(intent);
        }


    }
}
