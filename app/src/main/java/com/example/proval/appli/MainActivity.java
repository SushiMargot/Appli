package com.example.proval.appli;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t=new TextView(this);
        t = (TextView)findViewById(R.id.print);
        String hello = "it works";
        t.setText( hello);
    }
}
