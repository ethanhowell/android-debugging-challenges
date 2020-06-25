package com.codepath.debuggingchallenges.activities;

import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.codepath.debuggingchallenges.R;

public class ChangeBackgroundActivity extends AppCompatActivity {
    private static String TAG = ChangeBackgroundActivity.class.getCanonicalName();

    private int oldColor = Color.BLUE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: created change background");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_background);
        Button goButton = findViewById(R.id.btnGo);
    }

    public void onGoClick(View view) {
        Log.i(TAG, "onGoClick: button clicked");
        View mainView = findViewById(android.R.id.content);
        mainView.setBackgroundColor(getNextColor());
    }

    private int getNextColor() {
        int newColor = (oldColor == Color.BLUE) ? Color.RED : Color.BLUE;
        oldColor = newColor;
        return newColor;
    }
}
