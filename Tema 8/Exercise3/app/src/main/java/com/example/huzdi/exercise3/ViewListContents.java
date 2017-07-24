package com.example.huzdi.exercise3;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by huzdi on 24.07.2017.
 */

public class ViewListContents extends AppCompatActivity {

    private static final String TAG = "ViewListContents";
    ListView listView;
    DatabaseHelper myDB;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewcontents_layout);

        listView = (ListView) findViewById(R.id.list_view);
        myDB = new DatabaseHelper(this);

        populateListView();
    }

    private void populateListView(){
        Log.d(TAG,"populateListView : Displaying data in the ListView");

        Cursor data = myDB.getListContents();
        ArrayList<String> listData = new ArrayList<>();
        while (data.moveToNext()){
            listData.add(data.getString(1));
        }
        ListAdapter adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,listData);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String name = adapterView.getItemAtPosition(i).toString();
                Log.d(TAG,"onItemClick");

                Cursor data = myDB.getItemID(name);
                int itemID = -1;
                while(data.moveToNext()){
                    itemID = data.getInt(0);
                }
                if(itemID > -1){
                    Log.d(TAG,"onItemClick : The ID is:" + itemID );
                    Intent editScreenIntent = new Intent(ViewListContents.this, EditDataActivity.class);
                    editScreenIntent.putExtra("id",itemID);
                    editScreenIntent.putExtra("name",name);
                    startActivity(editScreenIntent);

                } else {
                    Toast.makeText(ViewListContents.this,"No ID associated with that name",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
