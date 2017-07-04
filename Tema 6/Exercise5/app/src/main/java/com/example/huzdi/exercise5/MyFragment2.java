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

public class MyFragment2 extends Fragment {

    Button button3;
    Button button4;
    private String title;
    private int page;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.my_fragment2,container,false);
        button3 = view.findViewById(R.id.button3);
        button4 = view.findViewById(R.id.button4);


        return view;
    }

    public static MyFragment2 newInstance(int page, String title) {
        MyFragment2 fragment = new MyFragment2();
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
