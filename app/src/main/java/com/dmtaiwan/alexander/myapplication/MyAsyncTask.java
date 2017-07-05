package com.dmtaiwan.alexander.myapplication;

import android.os.AsyncTask;

/**
 * Created by AlexThinkPad on 7/4/2017.
 */

public class MyAsyncTask extends AsyncTask<Void, Void, String> {

    private AsyncListener listener;

    public MyAsyncTask(AsyncListener listener) {
        this.listener = listener;
    }

    @Override
    protected String doInBackground(Void... voids) {
        return "This is my Test String";
    }

    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);
        listener.returnString(result);
    }


}
