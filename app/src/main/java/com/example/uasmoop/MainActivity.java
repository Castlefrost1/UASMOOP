package com.example.uasmoop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick(View v)
    {
        MainGame game = new MainGame();
        TextView winner = findViewById(R.id.textBox);
        winner.setText("The winner is Player " + Integer.toString(game.start()));
    }

    public void resetClick(View v)
    {
        TextView reset = findViewById(R.id.textBox);
        reset.setText("The winner here . . .");
    }
}
