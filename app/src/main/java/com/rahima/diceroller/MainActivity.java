package com.rahima.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.security.PrivateKey;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private static Button button;
    public static TextView textView;
    public static ImageView img1, img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // array to store dice images
        final int[] dice = {R.drawable.dice1, R.drawable.dice2, R.drawable.dice3,
                           R.drawable.dice4, R.drawable.dice5, R.drawable.dice6};

        // linking the roll button from its id
        button = findViewById(R.id.bt);

        //linking the result textview from its id
        textView = findViewById(R.id.t_1);

        //linking both the imageviews of the dice images with their ids
        img1 = findViewById(R.id.i1);
        img2 = findViewById(R.id.i2);


        // call the on click function
        // call the on click function
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // generate two random numbers
                // using Random function
                Random random = new Random();
                int num1 = random.nextInt(6);
                Random random1 = new Random();
                int num2 = random.nextInt(6);

                // the bigger number will be displayed in the
                // textView as the winner otherwise draw..
                if (num1 > num2) {
                    textView.setText("WINNER : Player 1");
                } else if (num2 > num1) {
                    textView.setText("WINNER : Player 2");
                } else {
                    textView.setText("RESULT : Draw");
                }
                // set the images from the array by the index
                // position of the numbers generated
                img1.setImageResource(dice[num1]);
                img2.setImageResource(dice[num2]);
            }
        });
    }

}