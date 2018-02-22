package com.example.android.tenniscounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String scoreTeamA = "0";
    String scoreTeamB = "0";
    int tieBreakA = 0;
    int tieBreakB = 0;
    int gameTeamA = 0;
    int gameTeamB = 0;
    int setTeamA = 0;
    int setTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Add points for Team A.
     */
    public void addPointForTeamA(View v) {
        if (scoreTeamA == "0") {
            scoreTeamA = "15";
            displayForTeamA(scoreTeamA);
        } else if (scoreTeamA == "15") {
            scoreTeamA = "30";
            displayForTeamA(scoreTeamA);
        } else if (scoreTeamA == "30") {
            scoreTeamA = "40";
            displayForTeamA(scoreTeamA);
        } else if (scoreTeamA == "40" && ((scoreTeamB == "0") || (scoreTeamB == "15") || scoreTeamB == "30")) {
            if ((gameTeamA >= 5) && (gameTeamA - gameTeamB >= 1)) {
                setTeamA++;
                gameTeamA = 0;
                gameTeamB = 0;
                scoreTeamA = "0";
                scoreTeamB = "0";
                displaySetForTeamA(setTeamA);
                displayGameForTeamA(gameTeamA);
                displayGameForTeamB(gameTeamB);
                displayForTeamA(scoreTeamA);
                displayForTeamB(scoreTeamB);
                 } else {
                gameTeamA++;
                scoreTeamA = "0";
                scoreTeamB = "0";
                displayForTeamA(scoreTeamA);
                displayForTeamB(scoreTeamB);
                displayGameForTeamA(gameTeamA);
            }
        } else if (scoreTeamA == "40" && scoreTeamB == "40") {
            scoreTeamA = "Adv";
            scoreTeamB = "-";
            displayForTeamA(scoreTeamA);
            displayForTeamB(scoreTeamB);
        } else if (scoreTeamA == "Adv" && scoreTeamB == "-") {
            if ((gameTeamA >= 5) && (gameTeamA - gameTeamB >= 1)) {
                setTeamA++;
                gameTeamA = 0;
                gameTeamB = 0;
                scoreTeamA = "0";
                scoreTeamB = "0";
                displaySetForTeamA(setTeamA);
                displayGameForTeamA(gameTeamA);
                displayGameForTeamB(gameTeamB);
                displayForTeamA(scoreTeamA);
                displayForTeamB(scoreTeamB);
            } else {
                gameTeamA++;
                scoreTeamA = "0";
                scoreTeamB = "0";
                displayForTeamA(scoreTeamA);
                displayForTeamB(scoreTeamB);
                displayGameForTeamA(gameTeamA);
            }
        } else if (scoreTeamA == "Adv" && scoreTeamB == "Adv") {
            scoreTeamA = "Adv";
            scoreTeamB = "-";
            displayForTeamA(scoreTeamA);
            displayForTeamB(scoreTeamB);
        } else if (scoreTeamA == "-" && scoreTeamB == "Adv") {
            scoreTeamA = "-";
            scoreTeamB = "-";
            displayForTeamA(scoreTeamA);
            displayForTeamB(scoreTeamB);
        } else if (scoreTeamA == "-" && scoreTeamB == "-") {
            scoreTeamA = "Adv";
            scoreTeamB = "-";
            displayForTeamA(scoreTeamA);
            displayForTeamB(scoreTeamB);
        }
    }

    /**
     * Add points for Team B.
     */
    public void addPointForTeamB(View v) {
        if (scoreTeamB == "0") {
            scoreTeamB = "15";
            displayForTeamB(scoreTeamB);
        } else if (scoreTeamB == "15") {
            scoreTeamB = "30";
            displayForTeamB(scoreTeamB);
        } else if (scoreTeamB == "30") {
            scoreTeamB = "40";
            displayForTeamB(scoreTeamB);
        } else if (scoreTeamB == "40" && ((scoreTeamA == "0") || (scoreTeamA == "15") || scoreTeamA == "30")) {
            if ((gameTeamB >= 5) && (gameTeamB - gameTeamA >= 1)) {
                setTeamB++;
                gameTeamB = 0;
                gameTeamA = 0;
                scoreTeamB = "0";
                scoreTeamA = "0";
                displaySetForTeamB(setTeamB);
                displayGameForTeamB(gameTeamB);
                displayGameForTeamA(gameTeamA);
                displayForTeamB(scoreTeamB);
                displayForTeamA(scoreTeamA);
            } else {
                gameTeamB++;
                scoreTeamB = "0";
                scoreTeamA = "0";
                displayForTeamB(scoreTeamB);
                displayForTeamA(scoreTeamA);
                displayGameForTeamB(gameTeamB);
            }
        } else if (scoreTeamB == "40" && scoreTeamA == "40") {
            scoreTeamB = "Adv";
            scoreTeamA = "-";
            displayForTeamB(scoreTeamB);
            displayForTeamA(scoreTeamA);
        } else if (scoreTeamB == "Adv" && scoreTeamA == "-") {
            if ((gameTeamB >= 5) && (gameTeamB - gameTeamA >= 1)) {
                setTeamB++;
                gameTeamB = 0;
                gameTeamA = 0;
                scoreTeamB = "0";
                scoreTeamA = "0";
                displaySetForTeamB(setTeamB);
                displayGameForTeamB(gameTeamB);
                displayGameForTeamA(gameTeamA);
                displayForTeamB(scoreTeamB);
                displayForTeamA(scoreTeamA);
            } else {
                gameTeamB++;
                scoreTeamB = "0";
                scoreTeamA = "0";
                displayForTeamB(scoreTeamB);
                displayForTeamA(scoreTeamA);
                displayGameForTeamB(gameTeamB);
            }
        } else if (scoreTeamB == "Adv" && scoreTeamA == "Adv") {
            scoreTeamA = "-";
            scoreTeamB = "Adv";
            displayForTeamB(scoreTeamB);
            displayForTeamA(scoreTeamA);
        } else if (scoreTeamB == "-" && scoreTeamA == "Adv") {
            scoreTeamB = "-";
            scoreTeamA = "-";
            displayForTeamB(scoreTeamB);
            displayForTeamA(scoreTeamA);
        } else if (scoreTeamB == "-" && scoreTeamA == "-") {
            scoreTeamA = "-";
            scoreTeamB = "Adv";
            displayForTeamB(scoreTeamB);
            displayForTeamA(scoreTeamA);
        }
    }

    /**--------------------------- Score Team A -----------------------------------*/

    /**
     * Displays the score for Team A.
     */
    public void displayForTeamA(String score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the tie break points for Team A.
     */
    public void displayTieBreakForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the games won by Team A.
     */
    public void displayGameForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_game);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the sets won by Team A.
     */
    public void displaySetForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_set);
        scoreView.setText(String.valueOf(score));
    }

    /**--------------------------- Score Team B -----------------------------------*/

    /**
     * Displays the score for Team B.
     */
    public void displayForTeamB(String score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the tie break points for Team B.
     */
    public void displayTieBreakForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the games won by Team B.
     */
    public void displayGameForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_game);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the sets won by Team B.
     */
    public void displaySetForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_set);
        scoreView.setText(String.valueOf(score));
    }

    /**--------------------------- Reset -----------------------------------*/

    /**
     * Reset the global score to zero for Team A and Team B
     */
    public void Reset(View v) {
        scoreTeamA = "0";
        scoreTeamB = "0";
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        gameTeamA = 0;
        gameTeamB = 0;
        displayGameForTeamA(gameTeamA);
        displayGameForTeamB(gameTeamB);
        setTeamA = 0;
        setTeamB = 0;
        displaySetForTeamA(setTeamA);
        displaySetForTeamB(setTeamB);
    }
}
