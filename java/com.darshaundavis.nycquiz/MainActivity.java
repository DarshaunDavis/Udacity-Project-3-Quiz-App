package com.darshaundavis.nycquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the submit button is clicked
     */
    public void calculateQuiz (View view) {
        //Retrieves the name
        EditText nameField = findViewById(R.id.name_field);
        String name = nameField.getText().toString();

        //Retrieves the correct answer from the first question
        RadioButton questionOneAnswer = findViewById(R.id.the_bronx_answer);
        boolean questionOneIsTheBronx = questionOneAnswer.isChecked();

        //Retrieves the correct answer from the second question
        RadioButton questionTwoAnswer;
        questionTwoAnswer = findViewById(R.id.pelham_bay_park_answer);
        boolean questionTwoIsPelhamBayPark = questionTwoAnswer.isChecked();

        //Retrieves the correct answer from the third question
        CheckBox questionThreeAnswerOne = findViewById(R.id.q3_a1);
        boolean questionThreeAnswerOneChecked = questionThreeAnswerOne.isChecked();
        CheckBox questionThreeAnswerTwo = findViewById(R.id.q3_a2);
        boolean questionThreeAnswerTwoChecked = questionThreeAnswerTwo.isChecked();
        CheckBox questionThreeAnswerThree = findViewById(R.id.q3_a3);
        boolean questionThreeAnswerThreeChecked = questionThreeAnswerThree.isChecked();
        CheckBox questionThreeAnswerFour = findViewById(R.id.q3_a4);
        boolean questionThreeAnswerFourChecked = questionThreeAnswerFour.isChecked();
        CheckBox questionThreeAnswerFive = findViewById(R.id.q3_a5);
        boolean questionThreeAnswerFiveChecked = questionThreeAnswerFive.isChecked();
        CheckBox questionThreeAnswerSix = findViewById(R.id.q3_a6);
        boolean questionThreeAnswerSixChecked = questionThreeAnswerSix.isChecked();
        CheckBox questionThreeAnswerSeven = findViewById(R.id.q3_a7);
        boolean questionThreeAnswerSevenChecked = questionThreeAnswerSeven.isChecked();

        //Retrieves the correct answer from the fourth question
        EditText questionFourAnswer = findViewById(R.id.question_4_answer);
        String questionFour = questionFourAnswer.getText().toString();

        //Retrieves the correct answer from the first question
        CheckBox questionFiveLaguardia = findViewById(R.id.lga);
        boolean questionFiveLaguardiaChecked = questionFiveLaguardia.isChecked();
        CheckBox questionFiveJohnFKennedy = findViewById(R.id.jfk);
        boolean questionFiveJohnFKennedyChecked = questionFiveJohnFKennedy.isChecked();
        CheckBox questionFiveNewark = findViewById(R.id.ewr);
        boolean questionFiveNewarkChecked = questionFiveNewark.isChecked();
        CheckBox questionFiveOHare = findViewById(R.id.ord);
        boolean questionFiveOHareChecked = questionFiveOHare.isChecked();
        CheckBox questionFiveHamad = findViewById(R.id.doh);
        boolean questionFiveHamadChecked = questionFiveHamad.isChecked();

        //Passes the score to the toast message
        int score = checkAnswers(questionOneIsTheBronx, questionTwoIsPelhamBayPark, questionThreeAnswerOneChecked, questionThreeAnswerTwoChecked, questionThreeAnswerThreeChecked, questionThreeAnswerFourChecked, questionThreeAnswerFiveChecked, questionThreeAnswerSixChecked, questionThreeAnswerSevenChecked, questionFour, questionFiveLaguardiaChecked, questionFiveJohnFKennedyChecked, questionFiveNewarkChecked, questionFiveOHareChecked, questionFiveHamadChecked);

        //This toast gives the results
        Toast.makeText(this,name + " Your score is " + score + "/100", Toast.LENGTH_SHORT).show();
    }

    /**
     * Checks the answers of the quiz
     * @param questionOneIsTheBronx is the answer to question one
     * @param questionTwoIsPelhmanBayPark is the answer to question two
     * @param questionThreeAnswerOneChecked is the answer to question three
     * @param questionThreeAnswerTwoChecked is the answer to question three
     * @param questionThreeAnswerThreeChecked is the answer to question three
     * @param questionThreeAnswerFourChecked is the answer to question three
     * @param questionThreeAnswerFiveChecked is the answer to question three
     * @param questionThreeAnswerSixChecked is not the answer to question three
     * @param questionThreeAnswerSevenChecked is the answer to question three
     * @param questionFour is the answer to question four
     * @param questionFiveJohnFKennedyChecked is one answer to question five
     * @param questionFiveLaguardiaChecked is one answer to question five
     * @param questionFiveNewarkChecked is one answer to question five
     * @param questionFiveOHareChecked is one answer to question five
     * @param questionFiveHamadChecked is one answer to question five
     */

    private int checkAnswers (boolean questionOneIsTheBronx, boolean questionTwoIsPelhmanBayPark, boolean questionThreeAnswerOneChecked, boolean questionThreeAnswerTwoChecked, boolean questionThreeAnswerThreeChecked, boolean questionThreeAnswerFourChecked, boolean questionThreeAnswerFiveChecked, boolean questionThreeAnswerSixChecked, boolean questionThreeAnswerSevenChecked, String questionFour, boolean questionFiveLaguardiaChecked, boolean questionFiveJohnFKennedyChecked, boolean questionFiveNewarkChecked, boolean questionFiveOHareChecked, boolean questionFiveHamadChecked) {
        int finalScore = 0;

        //Checks if question 1 is correct
        if (questionOneIsTheBronx) {
            finalScore = finalScore + 20;
            TextView answerOne = findViewById(R.id.answer1);
            answerOne.setText(getString(R.string.answer1));
        } else {
            TextView answerOne = findViewById(R.id.answer1);
            answerOne.setText(getString(R.string.answer1));
        }


        //Checks if question 2 is correct
        if (questionTwoIsPelhmanBayPark) {
            finalScore = finalScore + 20;
            TextView answerTwo = findViewById(R.id.answer2);
            answerTwo.setText(getString(R.string.answer2));
        } else {
            TextView answerTwo = findViewById(R.id.answer2);
            answerTwo.setText(getString(R.string.answer2));
        }

        //Checks if question 3 is correct
        if (questionThreeAnswerSixChecked) {
           TextView answerThree = findViewById(R.id.answer3);
            answerThree.setText(getString(R.string.answer3));
        } else if (questionThreeAnswerSevenChecked || questionThreeAnswerOneChecked && questionThreeAnswerTwoChecked && questionThreeAnswerThreeChecked && questionThreeAnswerFourChecked && questionThreeAnswerFiveChecked){
            finalScore = finalScore + 20;
            TextView answerThree = findViewById(R.id.answer3);
            answerThree.setText(getString(R.string.answer3));
        }else {
            TextView answerFive = findViewById(R.id.answer5);
            answerFive.setText(getString(R.string.answer5));
        }

        //Checks if question 4 is correct
        if (questionFour.equalsIgnoreCase("g")) {
            finalScore = finalScore + 20;
            TextView answerFour = findViewById(R.id.answer4);
            answerFour.setText(getString(R.string.answer4));
        } else {
            TextView answerFour = findViewById(R.id.answer4);
            answerFour.setText(getString(R.string.answer4));
        }


        //Checks if question 5 is correct
        if (questionFiveOHareChecked || questionFiveHamadChecked) {
            TextView answerFive = findViewById(R.id.answer5);
            answerFive.setText(getString(R.string.answer5));
        }else if (questionFiveLaguardiaChecked && questionFiveJohnFKennedyChecked && questionFiveNewarkChecked) {
            finalScore = finalScore + 20;
            TextView answerFive = findViewById(R.id.answer5);
            answerFive.setText(getString(R.string.answer5));
        }else {
            TextView answerFive = findViewById(R.id.answer5);
            answerFive.setText(getString(R.string.answer5));
        }

        return finalScore;
    }
}
