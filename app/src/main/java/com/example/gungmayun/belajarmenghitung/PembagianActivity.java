package com.example.gungmayun.belajarmenghitung;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class PembagianActivity extends AppCompatActivity {

    private SoalBagi soalBagi = new SoalBagi();
    private TextView Skor;
    private ImageView soal;
    private ImageButton jwbn1, jwbn2, jwbn3, jwbn4;
    private int jawabanBenar;
    private int skor = 0;
    private int nomorSoal = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembagian);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Skor = (TextView) findViewById(R.id.nilai);
        soal = (ImageView) findViewById(R.id.soal);
        jwbn1 = (ImageButton) findViewById(R.id.jawaban1);
        jwbn2 = (ImageButton) findViewById(R.id.jawaban2);
        jwbn3 = (ImageButton) findViewById(R.id.jawaban3);
        jwbn4 = (ImageButton) findViewById(R.id.jawaban4);

        final MediaPlayer soundButton = MediaPlayer.create(this, R.raw.buttonclicksound);

        jwbn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soalOnclick(jwbn1, soalBagi);
            }
        });

        jwbn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soalOnclick(jwbn2, soalBagi);
            }
        });

        jwbn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soalOnclick(jwbn3, soalBagi);
            }
        });

        jwbn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soalOnclick(jwbn4, soalBagi);
            }
        });

        newlevel();

        updateSkor();
    }

    private void newlevel() {
        if (nomorSoal < soalBagi.getJumlahSoal()) {
            soal.setBackgroundResource(soalBagi.getSoal(nomorSoal));
            jwbn1.setBackgroundResource(soalBagi.getPilihan(nomorSoal, 1));
            jwbn2.setBackgroundResource(soalBagi.getPilihan(nomorSoal, 2));
            jwbn3.setBackgroundResource(soalBagi.getPilihan(nomorSoal, 3));
            jwbn4.setBackgroundResource(soalBagi.getPilihan(nomorSoal, 4));
            jawabanBenar = soalBagi.getJawaban(nomorSoal);
            nomorSoal++;
        } else {
            Intent intent = new Intent(getApplicationContext(), HighScoreBagiActivity.class);
            intent.putExtra("Skor", skor);
            startActivity(intent);
        }
    }

    private void updateSkor() {
        Skor.setText("Skor :" + skor);
    }

    public void soalOnclick(ImageButton imageButton, SoalBagi soalBagi) {
        int a = 0;
        if (imageButton == jwbn1) {
            a = 1;
        } else if (imageButton == jwbn2) {
            a = 2;
        } else if (imageButton == jwbn3) {
            a = 3;
        } else if (imageButton == jwbn4) {
            a = 4;
        }
        int jawaban = soalBagi.getPilihan(nomorSoal - 1, a);
        if (jawaban == jawabanBenar) {
            skor = skor + 10;
            MediaPlayer benar = MediaPlayer.create(getBaseContext(), R.raw.soundbenar);
            benar.start();
            newlevel();
            updateSkor();
        } else {
            MediaPlayer salah = MediaPlayer.create(getBaseContext(), R.raw.soundsalah);
            skor = skor - 5;
            salah.start();
            updateSkor();
        }
    }
}
