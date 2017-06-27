package com.example.huzdi.exercise1;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

    ListView listView;
    String[] titles;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_item);
        Resources res = getResources();
        titles = res.getStringArray(R.array.titles);
        MyAdaptor adaptor = new MyAdaptor(this,titles);
        listView.setAdapter(adaptor);
    }




    private class MyAdaptor extends ArrayAdapter<String>{
        Context context;
        String[] titleArray;
        MyAdaptor(Context context, String[] titles){
            super(context,R.layout.single_row,R.id.text,titles);
            this.context = context;
            this.titleArray = titles;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater inflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = inflater.inflate(R.layout.single_row,parent,false);
            ImageView myImage = row.findViewById(R.id.action_image);
            TextView textView =row.findViewById(R.id.text);

            if((position%2)==0){
                myImage.setImageResource(R.drawable.metro);
            } else {
                myImage.setImageResource(R.drawable.da);
            }
            textView.setText(titleArray[position]);



            return row;
        }
    }
}