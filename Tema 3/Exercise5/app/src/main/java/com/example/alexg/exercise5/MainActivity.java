package com.example.alexg.exercise5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleButton = (ToggleButton) findViewById(R.id.toggleButton);
        toggleButton.setOnCheckedChangeListener(this);

    }



    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if(b){
            toggleButton.setText(R.string.on);
        } else {
            toggleButton.setText(R.string.off);
        }
    }
}
