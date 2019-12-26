package com.example.tyler.roller;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import java.util.Random;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    private ImageView dice1;
    private ImageView dice2;
    private ImageView dice3;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp = MediaPlayer.create(this, R.raw.rollsound);

    }

    public void RollDice(View v)
    {
        mp.start();

        Random rand = new Random();

        dice1= (ImageView) findViewById(R.id.Dice1);

        dice2= (ImageView) findViewById(R.id.Dice2);

        dice3= (ImageView) findViewById(R.id.Dice3);

        int d1 = rand.nextInt((6 - 1) + 1) + 1;
        int d2 = rand.nextInt((6 - 1) + 1) + 1;
        int d3 = rand.nextInt((6 - 1) + 1) + 1;


        int[] redDice = new int[]{R.drawable.red1, R.drawable.red2, R.drawable.red3,
                R.drawable.red4, R.drawable.red5, R.drawable.red6};

        int[] yellowDice = new int[]{R.drawable.yellow1, R.drawable.yellow2, R.drawable.yellow3,
                R.drawable.yellow4, R.drawable.yellow5, R.drawable.yellow6};

        int[] eventDice = new int[]{R.drawable.pirate, R.drawable.pirate, R.drawable.pirate,
                R.drawable.bluecast, R.drawable.greencast, R.drawable.yellowcast};

        int setDice1 = redDice[d1-1];
        int setDice2 = yellowDice[d2-1];
        int setDice3 = eventDice[d3-1];

        int Total = d1 + d2;
        TextView TotalLabel = (TextView) findViewById(R.id.Total);
        TotalLabel.setText(Integer.toString(Total));

        dice1.setImageResource(setDice1);
        dice2.setImageResource(setDice2);
        dice3.setImageResource(setDice3);

    }


}



