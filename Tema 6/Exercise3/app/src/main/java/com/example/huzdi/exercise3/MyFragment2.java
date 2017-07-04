package com.example.huzdi.exercise3;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MyFragment2 extends Fragment {
    FragmentManager manager;


    Button button4;
    Button button5;
    TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_my_fragment2,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        button4 = getActivity().findViewById(R.id.button4);
        button5 = getActivity().findViewById(R.id.button5);
        textView = getActivity().findViewById(R.id.textView2);
        manager = getFragmentManager();
        Intent intent = new Intent();


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyFragment1 myFragment1 = new MyFragment1();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.group,myFragment1,"5");
                transaction.commit();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyFragment3 myFragment3 = new MyFragment3();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.group, myFragment3,"6");
                transaction.commit();
            }
        });
    }


}
