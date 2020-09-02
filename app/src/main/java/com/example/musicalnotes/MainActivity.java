package com.example.musicalnotes;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    int red,blue,green,purple,maroon,yellow,orange;
    SoundPool sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp= new SoundPool(10, AudioManager.STREAM_MUSIC,0);
       /* final MediaPlayer red     =MediaPlayer.create(this,R.raw.piano11);
        final MediaPlayer blue    =MediaPlayer.create(this,R.raw.piano12);
        final MediaPlayer green   =MediaPlayer.create(this,R.raw.piano13);
        final MediaPlayer purple  =MediaPlayer.create(this,R.raw.piano14);
        final MediaPlayer maroon  =MediaPlayer.create(this,R.raw.piano15);
        final MediaPlayer yellow  =MediaPlayer.create(this,R.raw.piano16);
        final MediaPlayer orange  =MediaPlayer.create(this,R.raw.piano17);
        Button redb     =(Button) findViewById(R.id.red);
        Button blueb    =(Button)findViewById(R.id.blue);
        Button greenb   =(Button)findViewById(R.id.green);
        Button purpleb  =(Button)findViewById(R.id.purple);
        Button maroonb  =(Button)findViewById(R.id.maroon);
        Button yellowb  =(Button)findViewById(R.id.yellow);
        Button orangeb  =(Button)findViewById((R.id.orange));
       redb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                red.start();
            }
        });
        blueb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blue.start();
            }
        });
        greenb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                green.start();
            }
        });
        yellowb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yellow.start();
            }
        });
        purpleb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                purple.start();
            }
        });
        maroonb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                maroon.start();
            }
        });
        orangeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                orange.start();
            }
        });*/
       red=sp.load(getApplicationContext(),R.raw.piano11,1);
       blue=sp.load(getApplicationContext(),R.raw.piano12,1);
       green=sp.load(getApplicationContext(),R.raw.piano13,1);
       purple=sp.load(getApplicationContext(),R.raw.piano14,1);
       maroon=sp.load(getApplicationContext(),R.raw.piano15,1);
       yellow=sp.load(getApplicationContext(),R.raw.piano16,1);
       orange=sp.load(getApplicationContext(),R.raw.piano17,1);

    }
    public void playRed(View v){
        sp.play(red,1,1,1,0,1);
    }
    public void playBlue(View v){
        sp.play(blue,1,1,1,0,1);
    }
    public void playGreen(View v){
        sp.play(green,1,1,1,0,1);
    }
    public void playYellow(View v){
        sp.play(yellow,1,1,1,0,1);
    }
    public void playPurple(View v){
        sp.play(purple,1,1,1,0,1);
    }
    public void playMaroon(View v){
        sp.play(maroon,1,1,1,0,1);
    }
    public void playOrange(View v){
        sp.play(orange,1,1,1,0,1);
    }
}