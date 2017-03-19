package com.condingblocks.services;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by rishabhkhanna on 19/03/17.
 */

public class ThreadService extends IntentService {

    public static final String TAG = "service";

    public ThreadService() {
        super("name");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d(TAG, "onHandleIntent: ");
        loopWithTen(10);
    }


    public void loopWithTen(int duration){
        for(int i = 0 ; i < duration ; i++){
            loopWithOne();
        }

    }

    public void loopWithOne(){
        long startTime = System.currentTimeMillis();
        Log.d(TAG, "loopWithOne:  ");
        while(System.currentTimeMillis() - startTime < 1000);

    }
}
