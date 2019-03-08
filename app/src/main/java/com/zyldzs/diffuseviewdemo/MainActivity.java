package com.zyldzs.diffuseviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private View button;
    private View button2;
    private DiffuseView  diffuseView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button =   findViewById(R.id.button);
        button2 =   findViewById(R.id.button2);
        diffuseView = findViewById(R.id.diffuseView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                diffuseView.start();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                diffuseView.stop();
            }
        });

    }
}
