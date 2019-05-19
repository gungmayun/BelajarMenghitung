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

import java.util.ArrayList;
import java.util.Random;

public class PenambahanActivity extends AppCompatActivity {

    private SoalTambah soalTambah = new SoalTambah();
    private TextView Skor;
    private ImageView soal;
    private ImageButton jwbn1, jwbn2, jwbn3, jwbn4;
    private int jawabanBenar;
    private int skor = 0;
    private int nomorSoal = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penambahan);
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
                soalOnclick(jwbn1, soalTambah);
            }
        });

        jwbn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soalOnclick(jwbn2, soalTambah);
            }
        });

        jwbn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soalOnclick(jwbn3, soalTambah);
            }
        });

        jwbn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soalOnclick(jwbn4, soalTambah);
            }
        });

        newlevel();

        updateSkor();
    }

    private void newlevel(){
        if (nomorSoal < soalTambah.getJumlahSoal()){
            soal.setBackgroundResource(soalTambah.getSoal(nomorSoal));
            jwbn1.setBackgroundResource(soalTambah.getPilihan(nomorSoal, 1));
            jwbn2.setBackgroundResource(soalTambah.getPilihan(nomorSoal, 2));
            jwbn3.setBackgroundResource(soalTambah.getPilihan(nomorSoal, 3));
            jwbn4.setBackgroundResource(soalTambah.getPilihan(nomorSoal, 4));
            jawabanBenar = soalTambah.getJawaban(nomorSoal);
            nomorSoal++;
        }else {
            Intent intent = new Intent(getApplicationContext(), HighScoreTambahActivity.class);
            intent.putExtra("Skor", skor);
            startActivity(intent);
        }
    }
    private void updateSkor(){
        Skor.setText("Skor :" +skor);
    }
    public void soalOnclick(ImageButton imageButton, SoalTambah soalTambah){
        int a = 0;
        if (imageButton == jwbn1){
            a = 1;
        }
        else if(imageButton == jwbn2){
            a = 2;
        }
        else if(imageButton == jwbn3){
            a = 3;
        }
        else if (imageButton == jwbn4){
            a = 4;
        }
        int jawaban = soalTambah.getPilihan(nomorSoal-1, a);
        if (jawaban == jawabanBenar){
            skor = skor + 10;
            MediaPlayer benar = MediaPlayer.create(getBaseContext(),R.raw.soundbenar);
            benar.start();
            newlevel();
            updateSkor();
        }else{
            MediaPlayer salah = MediaPlayer.create(getBaseContext(),R.raw.soundsalah);
            skor = skor - 5;
            salah.start();
            updateSkor();
        }
    }
}