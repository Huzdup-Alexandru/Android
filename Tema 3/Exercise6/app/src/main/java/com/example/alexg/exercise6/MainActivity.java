package com.example.alexg.exercise6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void itemClicked(View v){
        if(((Switch)v).isChecked()){
            ((Switch) v).setText(R.string.on);
        } else{
            ((Switch) v).setText(R.string.off);
        }
    }
}
