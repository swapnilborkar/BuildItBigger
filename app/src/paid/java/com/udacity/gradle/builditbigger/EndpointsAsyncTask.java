package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v4.util.Pair;

import com.example.swapnil.myapplication.backend.jokeApi.JokeApi;
import com.example.swapnil.myapplication.backend.jokeApi.model.JokeBean;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;

import java.io.IOException;


public class EndpointsAsyncTask extends AsyncTask<Pair<Context, String>, Void, String> {
    private static JokeApi mJokeApi = null;
    private Context mContext;
    private String mResult;


    public EndpointsAsyncTask(Context context) {
        this.mContext = context;
    }


    @SafeVarargs
    @Override
    protected final String doInBackground(Pair<Context, String>... params) {
        if (mJokeApi == null) {
            JokeApi.Builder builder = new JokeApi.Builder(AndroidHttp.newCompatibleTransport(), new AndroidJsonFactory(), null)
                    .setRootUrl("https://builditbigger2662.appspot.com/_ah/api/");

            mJokeApi = builder.build();
        }


        try {
            return mJokeApi.putJoke(new JokeBean()).execute().getJoke();
        } catch (IOException e) {
            return e.getMessage();
        }
    }

    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);
        mResult = result;
        startJokeDisplayActivity();
    }

    private void startJokeDisplayActivity() {
        Intent intent = new Intent(mContext, JokeDisplayActivity.class);
        intent.putExtra(JokeDisplayActivity.INTENT_JOKE, mResult);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mContext.startActivity(intent);
    }
}

