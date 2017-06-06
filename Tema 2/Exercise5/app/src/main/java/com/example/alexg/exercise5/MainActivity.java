package com.example.alexg.exercise5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txt;
    Button btn;
    Button btn2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt=(EditText) findViewById(R.id.editText);
        btn=(Button)findViewById(R.id.button);
        btn2=(Button) findViewById(R.id.button2);

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txt.setHint(R.string.nu_apasa);

            }
        });
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txt.setHint(R.string.apasa_aici);
            }
        });
    }

}
