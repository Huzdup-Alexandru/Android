package com.example.huzdi.exercise2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ActivityOne extends AppCompatActivity {
    Button button4;
    Button button5;
    Button button6;
    TextView textView;

    public static final String MESSAGE = "Am venit de pe activitatea : ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        textView = (TextView) findViewById(R.id.textView2);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.MESSAGE);
        textView.setText("Am venit de pe activitatea : " + message);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityOne.this, ActivityOne.class);
                intent.putExtra(MESSAGE, ActivityOne.class.getSimpleName());
                startActivity(intent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityOne.this,ActivityTwo.class);
                intent.putExtra(MESSAGE,ActivityOne.class.getSimpleName());
                startActivity(intent);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityOne.this, ActivityThree.class);
                intent.putExtra(MESSAGE,ActivityOne.class.getSimpleName());
                startActivity(intent);

            }
        });

    }
}
