package com.example.huzdi.exercise5;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MyFragment3 extends Fragment {

    Button button5;
    Button button6;

    private int page;
    private String title;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.my_fragment3,container,false);
        button5 = view.findViewById(R.id.button5);
        button6 = view.findViewById(R.id.button6);

        return view;

    }

    public static MyFragment3 newInstance(int page, String title) {
        MyFragment3 fragment = new MyFragment3();
        Bundle args = new Bundle();
        args.putInt("someInt",page);
        args.putString("someTitle",title);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("someInt",0);
        title = getArguments().getString("someTitle");
    }
}
