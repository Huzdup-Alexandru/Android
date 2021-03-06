package com.example.huzdi.exercise3;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by huzdi on 24.07.2017.
 */

public class EditDataActivity extends AppCompatActivity {

    private static final String TAG = "EditDataActivity";

    private Button buttonSave,buttonDelete;
    private EditText editable_item;

    DatabaseHelper mDatabaseHelper;

    private String selectedName;
    private int selectedID;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_data_layout);

        buttonSave = (Button) findViewById(R.id.button_save);
        buttonDelete = (Button) findViewById(R.id.button_delete);
        editable_item = (EditText) findViewById(R.id.editable_item);
        mDatabaseHelper = new DatabaseHelper(this);

        Intent recievedIntent = getIntent();

        selectedID = recievedIntent.getIntExtra("id",-1); // -1 is default value

        selectedName = recievedIntent.getStringExtra("name");

        editable_item.setText(selectedName);

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String item = editable_item.getText().toString();
                if(!item.equals("")){
                    mDatabaseHelper.updateName(item,selectedID,selectedName);
                } else {
                    Toast.makeText(EditDataActivity.this,"You must enter a name",Toast.LENGTH_SHORT).show();
                }
            }
        });
        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDatabaseHelper.deleteName(selectedID,selectedName);
                editable_item.setText("");
                Toast.makeText(EditDataActivity.this,"Removed from database", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
