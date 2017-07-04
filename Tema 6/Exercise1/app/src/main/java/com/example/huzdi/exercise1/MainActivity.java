package com.example.huzdi.exercise1;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView) findViewById(R.id.list_item);
        list.setAdapter(new MyAdapter(this));
    }


    class SingleRow {
        String title;
        String description;
        int image;

        SingleRow(String title,String description, int image){
            this.title = title;
            this.description = description;
            this.image = image;
        }
    }
    private class MyAdapter extends BaseAdapter {

        ArrayList<SingleRow> list;
        Context context;

        MyAdapter(Context context){
            this.context = context;
            list = new ArrayList<>();
            Resources res = context.getResources();
            String [] titles =res.getStringArray(R.array.titles);
            String [] description = res.getStringArray(R.array.description);
            int[] images = {R.drawable.meme2, R.drawable.meme3, R.drawable.meme4, R.drawable.meme5, R.drawable.meme6, R.drawable.meme7, R.drawable.meme8, R.drawable.meme9, R.drawable.meme10};
            for(int i = 0;i<9;i++){
                list.add(new SingleRow(titles[i],description[i],images[i]));
            }
        }

        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int i) {
            return list.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            LayoutInflater inflater =(LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);
            View row = inflater.inflate(R.layout.single_row,viewGroup,false);

            TextView title  = row.findViewById(R.id.textView);
            TextView description = row.findViewById(R.id.text2);
            ImageView image = row.findViewById(R.id.action_image);

            SingleRow temp = list.get(i);
            title.setText(temp.title);
            description.setText(temp.description);
            image.setImageResource(temp.image);

            return row;
        }
    }


}
