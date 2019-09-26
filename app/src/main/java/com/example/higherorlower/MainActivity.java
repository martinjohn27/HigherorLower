package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random rand = new Random();
    int randomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        randomNumber = rand.nextInt(20);

    }

    public void Guess(View view){
        String message;
        EditText editText = findViewById(R.id.editText);
        int guessValue = Integer.parseInt(editText.getText().toString());

        if(guessValue > randomNumber){
            message ="Lower!";
        }
        else if(guessValue <randomNumber){
            message = "Higher!";
        }
        else {
            message = "You got it!";
        }
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();

    }

}
