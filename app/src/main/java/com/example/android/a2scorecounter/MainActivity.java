package com.example.android.a2scorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //variables for main score for both teams
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    //variables for number of yellow cards
    int yellowCardTeamA = 0;
    int yellowCardTeamB = 0;

    //variables for number of red cards

    int redCardTeamA = 0;
    int redCardTeamB = 0;

    //method for increasing score for team A

    public void addScoreTeamA(View v) {
        scoreTeamA++;
        displayScoreA(scoreTeamA);
    }

    public void addScoreTeamB(View v) {
        scoreTeamB++;
        displayScoreB(scoreTeamB);
    }

    // method for display score in textView
    public void displayScoreA(int scoreA) {
        TextView txtScoreA = findViewById(R.id.num_score_A);
        txtScoreA.setText(String.valueOf(scoreA));
    }

    public void displayScoreB(int scoreB) {
        TextView txtScoreB = findViewById(R.id.num_score_B);
        txtScoreB.setText(String.valueOf(scoreB));
    }

    // method for display yellow card
    public void addYellowCardTeamA(View v) {
        yellowCardTeamA++;
        displayYellowCardA(yellowCardTeamA);
    }

    public void displayYellowCardA(int yellowA) {
        TextView txtYellowA = findViewById(R.id.num_yellow_A);
        txtYellowA.setText(String.valueOf(yellowA));
    }

    public void addYellowCardTeamB(View v) {
        yellowCardTeamB++;
        displayYellowCardB(yellowCardTeamB);
    }

    public void displayYellowCardB(int yellowB) {
        TextView txtYellowB = findViewById(R.id.num_yellow_B);
        txtYellowB.setText(String.valueOf(yellowB));
    }

    // method for display red card
    public void addRedCardTeamA(View v) {
        redCardTeamA++;
        displayRedCardA(redCardTeamA);
    }

    public void displayRedCardA(int redA) {
        TextView txtRedA = findViewById(R.id.num_red_A);
        txtRedA.setText(String.valueOf(redA));
    }

    public void addRedCardTeamB(View v) {
        redCardTeamB++;
        displayRedCardB(redCardTeamB);
    }

    public void displayRedCardB(int redB) {
        TextView txtYellowB = findViewById(R.id.num_red_B);
        txtYellowB.setText(String.valueOf(redB));
    }

    //method for reset button
    public void resetMethod(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        yellowCardTeamA = 0;
        yellowCardTeamB = 0;
        redCardTeamA = 0;
        redCardTeamB = 0;
        displayScoreA(scoreTeamA);
        displayScoreB(scoreTeamB);
        displayYellowCardA(yellowCardTeamA);
        displayYellowCardB(yellowCardTeamB);
        displayRedCardA(redCardTeamA);
        displayRedCardB(redCardTeamB);

    }


}
