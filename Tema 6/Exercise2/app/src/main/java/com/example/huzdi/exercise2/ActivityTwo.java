package com.example.huzdi.exercise2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    Button button7;
    Button button8;
    Button button9;
    TextView textView;

    public static final String MESSAGE = "Am venit de pe activitatea  : ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__two);

        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);

        textView = (TextView) findViewById(R.id.textView3);

        Intent intent = getIntent();
        String message = intent.getStringExtra(ActivityOne.MESSAGE);
        textView.setText("Am venit de pe activitatea : " + message);

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityTwo.this, ActivityOne.class);
                intent.putExtra(MESSAGE, ActivityTwo.class.getSimpleName());
                startActivity(intent);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityTwo.this,ActivityTwo.class);
                intent.putExtra(MESSAGE,ActivityTwo.class.getSimpleName());
                startActivity(intent);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityTwo.this, ActivityThree.class);
                intent.putExtra(MESSAGE,ActivityTwo.class.getSimpleName());
                startActivity(intent);

            }
        });
    }
}
