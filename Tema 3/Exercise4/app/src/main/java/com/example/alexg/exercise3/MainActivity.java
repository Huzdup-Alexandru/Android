package com.example.alexg.exercise3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TableRow;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

        CheckBox checkBox;

        @Override
        protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox = (CheckBox) findViewById(R.id.checkBox);
            checkBox.setOnCheckedChangeListener(this);




    }
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
        if(isChecked){
            checkBox.setText(R.string.checked);
        }
        else {
            checkBox.setText(R.string.unchecked);
        }
    }

}

