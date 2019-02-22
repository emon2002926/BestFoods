package com.pluto.bestfoods;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class A2 extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a2);

        textView = (TextView) findViewById(R.id.Grapefruit);

        textView.setMovementMethod(new ScrollingMovementMethod());

    }
}
