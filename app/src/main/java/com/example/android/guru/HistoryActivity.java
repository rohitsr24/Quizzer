package com.example.android.guru;

import android.content.Context;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
    }

    public void submitAnswers(View view) {
        CharSequence resultsDisplay;
        int answer1_score;
        int answer2_score;
        int answer3_score;
        int answer4_score;
        int answer5_score;
        int answer6_score;
        int answer7_score;
        int answer8_score;
        int answer9_score;
        int answer10_score;
        int final_score;

        //It helps to choose any of the radio button from radio group and
        // returns the score 1 if it's equal to the correct answer otherwise 0 at the final stage.
        Boolean answer1;
        RadioButton question1 =  this.findViewById(R.id.option_1_3);
        answer1 = question1.isChecked();
        if (answer1) {
            answer1_score = 1;
        } else {
            answer1_score = 0;
        }

        // It takes the input from the user and returns the score 1
        // if it's equal to the correct answer otherwise 0.
        String answer2;
        EditText question2 =  this.findViewById(R.id.question2);
        answer2 = question2.getText().toString().toLowerCase();
        if (answer2.equals("manabendra"+" "+"nath"+" "+ "roy")) {
            answer2_score = 1;
        } else {
            answer2_score = 0;
        }

        //It helps to choose any of the radio button from radio group and
        // returns the score 1 if it's equal to the correct answer otherwise 0 at the final stage.
        Boolean answer3;
        RadioButton question3 =  this.findViewById(R.id.option3_4);
        answer3 = question3.isChecked();
        if (answer3) {
            answer3_score = 1;
        } else {
            answer3_score = 0;
        }

        //It helps to choose any of the radio button from radio group and
        // returns the score 1 if it's equal to the correct answer otherwise 0 at the final stage.
        Boolean answer4;
        RadioButton question4 =  this.findViewById(R.id.option4_3);
        answer4 = question4.isChecked();
        if (answer4) {
            answer4_score = 1;
        } else {
            answer4_score = 0;
        }

        //It helps to choose mutiple answers from the check box and
        // returns the score 1 if it's equal to the correct answer otherwise 0 at the final stage.
        Boolean answer5_choice1;
        Boolean answer5_choice2;
        Boolean answer5_choice3;
        Boolean answer5_choice4;
        CheckBox question5_choice1 =  this.findViewById(R.id.option5_1);
        CheckBox question5_choice2 =  this.findViewById(R.id.option5_2);
        CheckBox question5_choice3 =  this.findViewById(R.id.option5_3);
        CheckBox question5_choice4 =  this.findViewById(R.id.option5_4);
        answer5_choice1 = question5_choice1.isChecked();
        answer5_choice2 = question5_choice2.isChecked();
        answer5_choice3 = question5_choice3.isChecked();
        answer5_choice4 = question5_choice4.isChecked();
        if (!answer5_choice1 && answer5_choice2 && answer5_choice3 && !answer5_choice4) {
            answer5_score = 1;
        } else {
            answer5_score = 0;
        }

        //It helps to choose any of the radio button from radio group and
        // returns the score 1 if it's equal to the correct answer otherwise 0 at the final stage.
        Boolean answer6;
        RadioButton question6 =  this.findViewById(R.id.option6_2);
        answer6 = question6.isChecked();
        if (answer6) {
            answer6_score = 1;
        } else {
            answer6_score = 0;
        }

        //It helps to choose any of the radio button from radio group and
        // returns the score 1 if it's equal to the correct answer otherwise 0 at the final stage.
        Boolean answer7;
        RadioButton question7 =  this.findViewById(R.id.option7_3);
        answer7 = question7.isChecked();
        if (answer7) {
            answer7_score = 1;
        } else {
            answer7_score = 0;
        }

        // It takes the input from the user and returns the score 1
        // if it's equal to the correct answer otherwise 0.
        String answer8;
        EditText question8 =  this.findViewById(R.id.question8);
        answer8 = question8.getText().toString().toLowerCase();
        if (answer8.equals("surat")) {
            answer8_score = 1;
        } else {
            answer8_score = 0;
        }

        //It helps to choose any of the radio button from radio group and
        // returns the score 1 if it's equal to the correct answer otherwise 0 at the final stage.
        Boolean answer9;
        RadioButton question9 =  this.findViewById(R.id.option9_3);
        answer9 = question9.isChecked();
        if (answer9) {
            answer9_score = 1;
        } else {
            answer9_score = 0;
        }

        //It helps to choose mutiple answers from the check box and
        // returns the score 1 if it's equal to the correct answer otherwise 0 at the final stage.
        Boolean answer10_choice1;
        Boolean answer10_choice2;
        Boolean answer10_choice3;
        Boolean answer10_choice4;
        CheckBox question10_choice1 =  this.findViewById(R.id.option10_1);
        CheckBox question10_choice2 =  this.findViewById(R.id.option10_2);
        CheckBox question10_choice3 =  this.findViewById(R.id.option10_3);
        CheckBox question10_choice4 =  this.findViewById(R.id.option10_4);
        answer10_choice1 = question10_choice1.isChecked();
        answer10_choice2 = question10_choice2.isChecked();
        answer10_choice3 = question10_choice3.isChecked();
        answer10_choice4 = question10_choice4.isChecked();
        if (answer10_choice1 && answer10_choice2 && !answer10_choice3 && !answer10_choice4) {
            answer10_score = 1;
        } else {
            answer10_score = 0;
        }

        // It returns the final score of the quizz when the submit button is clicked.
        final_score = answer1_score + answer2_score + answer3_score + answer4_score + answer5_score + answer6_score + answer7_score + answer8_score + answer9_score + answer10_score ;

        if (final_score == 10) {
            resultsDisplay = "Perfect! You scored 10 out of 10";
        } else {
            resultsDisplay = "Try again. You scored " + final_score + " out of 10";
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, resultsDisplay, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();

    }
}