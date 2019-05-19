package com.example.gungmayun.belajarmenghitung;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class BelajarActivity extends AppCompatActivity {
    ImageButton click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final MediaPlayer soundButton = MediaPlayer.create(this, R.raw.buttonclicksound);

        click = (ImageButton) findViewById(R.id.menu_penambahan);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundButton.start();
                Intent intent = new Intent(BelajarActivity.this, PenambahanActivity.class);
                startActivity(intent);
            }
        });

        click = (ImageButton) findViewById(R.id.menu_pengurangan);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundButton.start();
                Intent intent = new Intent(BelajarActivity.this, PenguranganActivity.class);
                startActivity(intent);
            }
        });

        click = (ImageButton) findViewById(R.id.menu_perkalian);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundButton.start();
                Intent intent = new Intent(BelajarActivity.this, PerkalianActivity.class);
                startActivity(intent);
            }
        });

        click = (ImageButton) findViewById(R.id.menu_pembagian);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundButton.start();
                Intent intent = new Intent(BelajarActivity.this, PembagianActivity.class);
                startActivity(intent);
            }
        });
    }
}
