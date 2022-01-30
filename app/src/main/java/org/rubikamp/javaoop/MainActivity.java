package org.rubikamp.javaoop;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        GrandPa grandPa = new GrandPa();
//        grandPa.showGrandfatherHeight();
//        grandPa.showGrandfatherSkinColor();
//        grandPa.showGrandfatherBaldness();
//        grandPa.showGrandfatherBehavior();
//        grandPa.showGrandfatherCreativity();
//        grandPa.showGrandfatherNationality();
//        grandPa.showGrandfatherActivity();

//        Papa papa = new Papa();
//        papa.showGrandfatherActivity();
//        papa.showGrandfatherHeight();
//        papa.showGrandfatherSkinColor();
//        papa.showGrandfatherBaldness();
//        papa.showGrandfatherBehavior();
//        papa.showGrandfatherCreativity();
//        papa.showGrandfatherActivity();
//        papa.showGrandfatherNationality();
//        papa.showFatherEducation();
//        papa.showFatherStudyTime();

        Son sonObject = new Son();
        sonObject.showGrandfatherHeight();
        sonObject.showGrandfatherSkinColor();
        sonObject.showGrandfatherBaldness();
        sonObject.showGrandfatherBehavior();
        sonObject.showGrandfatherCreativity();
        sonObject.showGrandfatherActivity();
        sonObject.showGrandfatherNationality();
        sonObject.showFatherEducation();
        sonObject.showFatherStudyTime();
    }
}