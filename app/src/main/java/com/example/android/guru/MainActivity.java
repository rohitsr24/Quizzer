package com.example.android.guru;


import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openCurrentAffairs(View view) {

        Intent i = new Intent(this, CurrentAffairsActivity.class);
        startActivity(i);
    }

    public void openGeneralKnowledge(View view) {

        Intent i = new Intent(this, GeneralKnowledgeActivity.class);
        startActivity(i);
    }

    public void openScience(View view) {

        Intent i = new Intent(this, ScienceActivity.class);
        startActivity(i);
    }

    public void openHistory(View view) {

        Intent i = new Intent(this, HistoryActivity.class);
        startActivity(i);
    }

    public void openBiology(View view) {

        Intent i = new Intent(this, BiologyActivity.class);
        startActivity(i);
    }
}
