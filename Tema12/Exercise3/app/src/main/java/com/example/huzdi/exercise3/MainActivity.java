package com.example.huzdi.exercise3;


import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.util.Calendar;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button date_button,hour_button;
    EditText date_edit,hour_edit;
    int day,month,year,hour,minutue;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        date_button = (Button) findViewById(R.id.date);
        hour_button = (Button) findViewById(R.id.hour);
        date_edit = (EditText) findViewById(R.id.edit_date);
        hour_edit = (EditText) findViewById(R.id.edit_hour);

        date_button.setOnClickListener(this);
        hour_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view==date_button){
            final Calendar calendar = Calendar.getInstance();
            day = calendar.get(Calendar.DAY_OF_MONTH);
            month = calendar.get(Calendar.MONTH);
            year = calendar.get(Calendar.YEAR);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this,new DatePickerDialog.OnDateSetListener(){
                @Override
                public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                    date_edit.setText(i2+"/"+(i1+1)+"/"+i);
                }
            }
            ,day,month,year);
            datePickerDialog.show();

        }
        if(view==hour_button){
            final Calendar calendar = Calendar.getInstance();
            hour= calendar.get(Calendar.HOUR_OF_DAY);
            minutue = calendar.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker timePicker, int i, int i1) {
                    hour_edit.setText(i+":"+ i1);
                }
            },hour,minutue,false);

            timePickerDialog.show();
        }
    }
}
