package com.example.banking.activity.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.banking.activity.BankImg;
import com.example.banking.activity.R;
import com.example.banking.activity.TaskAdapter;

import java.util.ArrayList;

import static com.example.banking.activity.TaskAdapter.mcontext;

/**
 * A simple {@link Fragment} subclass.
 */
public class TaskListFragment extends Fragment {

    RecyclerView recyclerView;
    TaskAdapter adapter;

    public TaskListFragment() {
        // Required empty public constructor
    }
    private ArrayList<BankImg> setImgData(){

        ArrayList<BankImg>projectList=new ArrayList<>();

        BankImg bankImg=new BankImg();
        bankImg.setImgId(R.drawable.sbii);

        projectList.add(bankImg);

        BankImg bankImg1=new BankImg();
        bankImg1.setImgId(R.drawable.axisbank);
        projectList.add(bankImg1);

        BankImg bankImg2=new BankImg();
        bankImg2.setImgId(R.drawable.hdfc);
        projectList.add(bankImg2);

        BankImg bankImg3=new BankImg();
        bankImg3.setImgId(R.drawable.icici);
        projectList.add(bankImg3);

        BankImg bankImg4=new BankImg();
        bankImg4.setImgId(R.drawable.allah);
        projectList.add(bankImg4);

        BankImg bankImg5=new BankImg();
        bankImg5.setImgId(R.drawable.pnb);
        projectList.add(bankImg5);





        return projectList;


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        adapter=new TaskAdapter(mcontext,setImgData());
        final View v= inflater.inflate(R.layout.fragment_task_list, container, false);
        recyclerView=(RecyclerView) v.findViewById(R.id.recycler);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return v;

    }




}
