package com.example.huzdi.exercise3;



import android.app.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager  = getFragmentManager();
    }

    public void add(View view){
        MyFragment1 myFragment1 = new MyFragment1();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.group,myFragment1,"1");
        transaction.commit();

    }






}
