package com.udacity.gradle.builditbigger;

import android.os.AsyncTask;
import android.util.Log;

import com.example.Joker;

import java.io.IOException;

/**
 * Created by kchandra on 16/10/16.
 */

public class JokeAsyncTask extends AsyncTask<Void, Void, String> {

    @Override
    protected String doInBackground(Void... voids) {
        Joker joker = new Joker();
        return joker.tellJoke();
    }

}
