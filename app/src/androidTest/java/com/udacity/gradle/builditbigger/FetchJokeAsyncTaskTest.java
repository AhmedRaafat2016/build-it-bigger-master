package com.udacity.gradle.builditbigger;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class FetchJokeAsyncTaskTest {

    @Test
    public void apiShouldNotReturnNullString() throws Exception {
        FetchJokeAsyncTask task = new FetchJokeAsyncTask(InstrumentationRegistry.getContext());
        task.execute();
        String result = task.get();
        //noinspection ObviousNullCheck
        assertNotNull(result, "API didn't return any joke!");
    }
}
