package com.example.huzdi.exercise1;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    private String[] texts = {"Element 1","Element 2","Element 3","Element 4","Element 5","Element 6","Element 7","Element 8","Element 9","Element 10"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.list_item);
        listView.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,new ArrayList<String>()));
        new MyTask().execute();

    }
    class MyTask extends AsyncTask<Void, String, Void>{
        private int count = 0;
        private ArrayAdapter<String> adapter;
        @Override
        protected void onPreExecute() {
            adapter =(ArrayAdapter<String>) listView.getAdapter();

        }

        @Override
        protected Void doInBackground(Void... voids) {
            for(String item : texts){
                publishProgress(item);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            return null;

        }

        @Override
        protected void onProgressUpdate(String... values) {
            adapter.add(values[0]);
            count++;


        }

        @Override
        protected void onPostExecute(Void aVoid) {
            Toast.makeText(MainActivity.this,"All items were added successfully",Toast.LENGTH_LONG).show();

        }
    }
}
