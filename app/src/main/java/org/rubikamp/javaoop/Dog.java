package org.rubikamp.javaoop;

import android.util.Log;

public class Dog extends Pet {

    public boolean isRude;
    public String gender;

    private static final String TAG = "Dog";

    @Override
    public void feed() {
        super.feed();
        Log.d(TAG, "feed: meet and milk");
    }

    @Override
    public void sleep() {
        super.sleep();
        Log.i(TAG, "sleep: in library");
    }
}
