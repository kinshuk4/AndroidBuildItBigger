package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import android.util.Log;

import java.util.concurrent.ExecutionException;

/**
 * Created by kchandra on 16/10/16.
 */

public class JokeAsyncTaskTest extends AndroidTestCase {

    private static final String LOG_TAG = JokeAsyncTaskTest.class.getSimpleName();

    public void testFetchesNonEmptyString() {
        JokeAsyncTask jokeAsyncTask = new JokeAsyncTask();
        jokeAsyncTask.execute();
        try {
            String joke = jokeAsyncTask.get();
            Log.d(LOG_TAG, "Joke from task: " + joke);
            assertNotNull(joke);
            assertTrue(joke.length() > 0);
        } catch (InterruptedException | ExecutionException e) {
            Log.e(LOG_TAG, Log.getStackTraceString(e));
        }
    }
}

