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

        Athlete athlete1 = new Athlete("MR", "Fekri", 1386);
        athlete1.showAthleteInfo();
        Athlete athlete2 = new Athlete("Hast", "Mhmdi", 1385);
        athlete2.showAthleteInfo();
        Athlete athlete3 = new Athlete("Sana", "Ebadi", 1375);
        athlete3.showAthleteInfo();

        System.out.println("The number of all registrations is " + Athlete.showAllAthletes());


    }
}