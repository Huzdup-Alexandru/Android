package com.example.huzdi.exercise3;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MyFragment3 extends Fragment {

    FragmentManager manager;


    Button button6;
    Button button7;
    TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_my_fragment3,container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        button6 = getActivity().findViewById(R.id.button6);
        button7 = getActivity().findViewById(R.id.button7);
        textView = getActivity().findViewById(R.id.textView3);
        manager = getFragmentManager();

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyFragment1 myFragment1 = new MyFragment1();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.group, myFragment1,"7");
                transaction.commit();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyFragment2 myFragment2 = new MyFragment2();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.group, myFragment2,"8");
                transaction.commit();
            }
        });

    }


}
