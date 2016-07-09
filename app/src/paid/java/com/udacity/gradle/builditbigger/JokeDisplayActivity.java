package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {

    public static String INTENT_JOKE = "JOKE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);

        TextView jokeView = (TextView) findViewById(R.id.jokeView);
        Intent intent = new Intent();
        Bundle bundle = getIntent().getExtras();
        String message = bundle.getString(INTENT_JOKE);
        jokeView.setText(message);

    }
}
