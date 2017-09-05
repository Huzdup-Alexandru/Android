package com.example.huzdi.exercise4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDialog(View view){
        MyDialog dialog = new MyDialog();
        dialog.show(getSupportFragmentManager(),"my_dialog_tag");
    }
}
