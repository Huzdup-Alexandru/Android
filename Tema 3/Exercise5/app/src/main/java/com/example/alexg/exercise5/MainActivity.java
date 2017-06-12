package com.example.alexg.exercise5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void itemClicked(View v){
        ToggleButton toggleButton = (ToggleButton)v;
        if(toggleButton.isChecked()){
            toggleButton.setText(R.string.on);
        } else {
            toggleButton.setText(R.string.off);
        }
    }
}
