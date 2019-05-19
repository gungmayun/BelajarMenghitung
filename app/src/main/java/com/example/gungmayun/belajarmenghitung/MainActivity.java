package com.example.gungmayun.belajarmenghitung;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton click;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        final MediaPlayer soundButton = MediaPlayer.create(this, R.raw.buttonclicksound);
        mediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.backsoundapp);
        mediaPlayer.start();

        click = (ImageButton) findViewById(R.id.buttonPlay);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundButton.start();
                Intent intent =new Intent(MainActivity.this, BelajarActivity.class);
                startActivity(intent);
                mediaPlayer.start();
            }
        });

        click = (ImageButton) findViewById(R.id.buttonAbout);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundButton.start();
                Intent intent =new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
                mediaPlayer.start();
            }
        });

        click = (ImageButton) findViewById(R.id.buttonExit);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundButton.start();
                Intent intent =new Intent(MainActivity.this, ExitActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
