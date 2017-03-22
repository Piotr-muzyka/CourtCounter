package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA =0;
    int scoreTeamB =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given scoreTeamA for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threePoints(View v) {
        scoreTeamA +=3;
        displayForTeamA(scoreTeamA);
    }
    public void twoPoints(View v) {
        scoreTeamA +=2;
        displayForTeamA(scoreTeamA);
    }
    public void freeThrow(View v) {
        scoreTeamA +=1;
        displayForTeamA(scoreTeamA);
    }

    public void threePoints2(View v) {
        scoreTeamB +=3;
        displayForTeamB(scoreTeamB);
    }
    public void twoPoints2(View v) {
        scoreTeamB +=2;
        displayForTeamB(scoreTeamB);
    }
    public void freeThrow2(View v) {
        scoreTeamB +=1;
        displayForTeamB(scoreTeamB);
    }

}
