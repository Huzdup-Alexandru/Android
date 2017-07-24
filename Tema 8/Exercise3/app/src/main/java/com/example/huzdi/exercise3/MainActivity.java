package com.example.huzdi.exercise3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper databaseHelper;
    Button buttonAdd,buttonView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        databaseHelper = new DatabaseHelper(this);


        editText = (EditText) findViewById(R.id.edit_text);
        buttonAdd = (Button) findViewById(R.id.button);
        buttonView = (Button) findViewById(R.id.button2);

        buttonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ViewListContents.class);
                startActivity(intent);
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editText.getText().toString();
                if(editText.length() != 0){
                    addData(name);
                    editText.setText("");
                } else {
                    Toast.makeText(MainActivity.this, "You must put something in the text field!",Toast.LENGTH_LONG).show();
                }
            }
        });


    }

        public void addData(String name){
            boolean insertData = databaseHelper.insertData(name);

            if(insertData == true){
                Toast.makeText(MainActivity.this,"Successfully Enetered Data",Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this,"Something went wrong :(", Toast.LENGTH_SHORT).show();
            }
        }
}
