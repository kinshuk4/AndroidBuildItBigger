package com.k2udacity.androidjokedisplayer;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import static com.k2udacity.androidjokedisplayer.Constants.EXTRAS_KEY_JOKE;


public class JokeDisplayer extends AppCompatActivity {
    private static String LOG_TAG = JokeDisplayer.class.getSimpleName();
    // factory static method
    public static void startActvity(Activity activity, String joke) {
        Bundle bundle = new Bundle();
        bundle.putString(EXTRAS_KEY_JOKE, joke);
        Intent intent = new Intent(activity, JokeDisplayer.class);
        intent.putExtras(bundle);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_displayer);
        init();
    }

    private void init() {
        Log.d(LOG_TAG,"init()");
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {

            String joke = bundle.getString(EXTRAS_KEY_JOKE);
            if (joke != null)
                populateView(joke);
        }
    }

    private void populateView(String joke) {
        Log.d(LOG_TAG,"populateView()");
        TextView tvJoke = (TextView) findViewById(R.id.tv_joke);
        tvJoke.setText(joke);
    }

    public void finishActivity(View v) {
        finish();
    }
}
