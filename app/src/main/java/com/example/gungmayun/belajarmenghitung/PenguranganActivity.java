package com.example.gungmayun.belajarmenghitung;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class PenguranganActivity extends AppCompatActivity {

    ImageButton pilih;
    ImageButton jwbn1, jwbn2, jwbn3, jwbn4;
    ImageView soal;
    int s,s1,j1,j2,j3,j4;
    int skor=0;

    SoalKurang soalKurang = new SoalKurang();
    int n = soalKurang.getjumlahsoal();

    boolean jawabanbenar = true;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengurangan);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        soal = (ImageView) findViewById(R.id.soal);
        jwbn1 = (ImageButton) findViewById(R.id.jawaban1);
        jwbn2 = (ImageButton) findViewById(R.id.jawaban2);
        jwbn3 = (ImageButton) findViewById(R.id.jawaban3);
        jwbn4 = (ImageButton) findViewById(R.id.jawaban4);

        final MediaPlayer soundButton = MediaPlayer.create(this, R.raw.buttonclicksound);

        newlevel();

        jwbn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Correct(j1==s);
            }
        });

        jwbn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Correct(j2==s);
            }
        });

        jwbn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Correct(j3==s);
            }
        });

        jwbn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Correct(j4==s);
            }
        });
    }
    public void newlevel(){
        s = soalKurang.getrandomsoal();
        s1 = soalKurang.getrandomsoal();
        int i = new Random().nextInt(4) +1;

        if (i==1){
            j1 = s;
        }
        else {
            j1 = soalKurang.getrandomsoal();
        }
        if (i==2){
            j2 = s;
        }
        else {
            j2 = soalKurang.getrandomsoal();
        }
        if (i==3){
            j3 = s;
        }
        else {
            j3 = soalKurang.getrandomsoal();
        }
        if (i==4){
            j4 = s;
        }
        else {
            j4 = soalKurang.getrandomsoal();
        }

        soal.setBackgroundResource(soalKurang.getimagesoal(s));
        jwbn1.setBackgroundResource(soalKurang.getimagejawaban(j1));
        jwbn2.setBackgroundResource(soalKurang.getimagejawaban(j2));
        jwbn3.setBackgroundResource(soalKurang.getimagejawaban(j3));
        jwbn4.setBackgroundResource(soalKurang.getimagejawaban(j4));
    }

    public void Correct(boolean input){
        TextView tampil_nilai = (TextView) findViewById(R.id.nilai);

        if (input && i <n){
            MediaPlayer benar = MediaPlayer.create(getBaseContext(),R.raw.soundbenar);
            skor +=10;
            benar.start();
            newlevel();
            i++;
        }else{
            MediaPlayer salah = MediaPlayer.create(getBaseContext(),R.raw.soundsalah);
            skor -=5;
            salah.start();
        }

        tampil_nilai.setText("SKOR : " +skor);
    }
}
