package com.example.alexg.exercise8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private EditText editText1;
    private EditText editText2;
    private EditText editText3;
    private EditText editText4;
    private EditText editText5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        editText1 = (EditText) findViewById(R.id.editText3);
        editText2 = (EditText) findViewById(R.id.editText4);
        editText3 = (EditText) findViewById(R.id.editText5);
        editText4 = (EditText) findViewById(R.id.editText6);
        editText5 = (EditText) findViewById(R.id.editText7);

                button.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View view){
                        Toast.makeText(getApplicationContext(), editText1.getText().toString(), Toast.LENGTH_LONG ).show();
                        Toast.makeText(getApplicationContext(), editText2.getText().toString(), Toast.LENGTH_LONG ).show();
                        Toast.makeText(getApplicationContext(), editText3.getText().toString(), Toast.LENGTH_LONG ).show();
                        Toast.makeText(getApplicationContext(), editText4.getText().toString(), Toast.LENGTH_LONG ).show();
                        Toast.makeText(getApplicationContext(), editText5.getText().toString(), Toast.LENGTH_LONG ).show();



                    }
                });
            }
        }








