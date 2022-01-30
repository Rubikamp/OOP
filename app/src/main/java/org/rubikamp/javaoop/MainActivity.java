package org.rubikamp.javaoop;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Three three = new Three();
        three.threeFun();

        One one = new Two();

        One one1 = new Three();

        one1.setCount(5);

        one1.setCount(10);

        Log.i(TAG, "onCreate: " + one.getCount());
        
    }
}