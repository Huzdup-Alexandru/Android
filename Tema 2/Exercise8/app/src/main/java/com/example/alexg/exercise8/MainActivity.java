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

        Button button = (Button) findViewById(R.id.button);

                button.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View view){
                        String date;
                        EditText editText1 = (EditText) findViewById(R.id.editText3);
                        EditText editText2 = (EditText) findViewById(R.id.editText4);
                        EditText editText3 = (EditText) findViewById(R.id.editText5);
                        EditText editText4 = (EditText) findViewById(R.id.editText6);
                        EditText editText5 = (EditText) findViewById(R.id.editText7);
                        date = " Nume : " + editText1.getText()+"\n " +" Prenume : "+ editText2.getText() +"\n " +" Varsta :"+ editText3.getText() +"\n "+" Sexul : "+
                                editText4.getText() +"\n "+" Ocupatia : "+ editText5.getText();


                        Toast.makeText(getApplicationContext(), date , Toast.LENGTH_LONG ).show();




                    }
                });
            }
        }








