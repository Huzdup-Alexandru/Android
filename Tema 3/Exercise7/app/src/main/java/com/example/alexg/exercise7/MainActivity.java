package com.example.alexg.exercise7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    RadioButton radioButton;
    RadioGroup radioGroup;
    Button button;

    public void itemClicked(View v){
        radioGroup = (RadioGroup) findViewById(R.id.grup);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selected_id = radioGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(selected_id);
                Toast.makeText(MainActivity.this, radioButton.getText().toString() , Toast.LENGTH_SHORT).show();
                
            }
        });
    }
}
