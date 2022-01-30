package org.rubikamp.javaoop;

import android.util.Log;

public class HastiDog extends Pet{

    private static final String TAG = "Hastdog";

    @Override
    public void feed() {
        super.feed();
        Log.i(TAG, "feed: milk");

    }

    @Override
    public void sleep() {
        super.sleep();
        Log.i(TAG, "sleep: in bed");
    }
}
