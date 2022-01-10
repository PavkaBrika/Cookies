package com.example.cookies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eatCookies(View view) {
        TextView cond = (TextView) findViewById(R.id.condition);
        ImageView andr = (ImageView) findViewById(R.id.android);
        cond.setText("I`m so full");
        cond.setAllCaps(true);
        andr.setImageResource(R.drawable.after_cookie);
    }

}