package com.example.gungmayun.belajarmenghitung;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class HighScoreTambahActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_score_tambah);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        TextView skorMu = (TextView) findViewById(R.id.skormu);
        TextView skorTinggi = (TextView) findViewById(R.id.skortinggi);

        int skor = getIntent().getIntExtra("Skor", 0);
        skorMu.setText("Skor Pencapaianmu :" + skor);

        SharedPreferences share = getPreferences(MODE_PRIVATE);
        int skorT = share.getInt("skorT", 0);
        if (skor > skorT){
            skorTinggi.setText("Skor Tertinggi :" + skor);
            SharedPreferences.Editor editor = share.edit();
            editor.putInt("skorT", skor);
            editor.commit();
        }else{
            skorTinggi.setText("Skor Tertinggi :" + skorT);
        }
    }
    public void OnClick (View view){
        Intent intent = new Intent(HighScoreTambahActivity.this, PenambahanActivity.class);
        startActivity(intent);
    }
}
