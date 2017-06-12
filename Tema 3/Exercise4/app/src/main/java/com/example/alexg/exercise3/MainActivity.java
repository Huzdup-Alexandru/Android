package com.example.alexg.exercise3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TableRow;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox = (CheckBox) findViewById(R.id.checkBox);


    }
    public void itemClicked(View v){
        if(((CheckBox)v).isChecked()){
            Toast.makeText(this, "Checked", Toast.LENGTH_LONG).show();
            checkBox.setText(R.string.checked);
        } else{
            Toast.makeText(this, "Unchecked", Toast.LENGTH_LONG).show();
            checkBox.setText(R.string.unchecked);
        }
    }
}
