package com.udacity.gradle.builditbigger;

import android.os.AsyncTask;
import android.util.Log;

import com.example.Joker;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;

import java.io.IOException;

import com.example.kchandra.myapplication.backend.jokerapi.Jokerapi;
import com.k2udacity.androidjokedisplayer.JokeDisplayer;

/**
 * Created by kchandra on 16/10/16.
 */

public class JokeAsyncTask extends AsyncTask<Void, Void, String> {
    private static String LOG_TAG = JokeAsyncTask.class.getSimpleName();
    private static Jokerapi myApiService = null;

    @Override
    protected String doInBackground(Void... voids) {
        Log.d(LOG_TAG, "JokeAsyncTask.doInBackground()");
        if (myApiService == null) {  // Only do this once
            Jokerapi.Builder builder = new Jokerapi.Builder(AndroidHttp.newCompatibleTransport(),
                    new AndroidJsonFactory(), null)
                    .setRootUrl("https://infinite-mantis-146619.appspot.com/_ah/api/");
            myApiService = builder.build();
        }

        try {
            return myApiService.tellJoke().execute().getData();
        } catch (IOException e) {
            Log.e(LOG_TAG, e.getMessage());
            return null;
        }

    }
}
