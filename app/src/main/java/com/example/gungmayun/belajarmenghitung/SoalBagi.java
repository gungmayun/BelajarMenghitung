package com.example.gungmayun.belajarmenghitung;

import java.util.Random;

public class SoalBagi {
    private int ListSoal[] = {
            R.drawable.bagi1,
            R.drawable.bagi2,
            R.drawable.bagi3,
            R.drawable.bagi4,
            R.drawable.bagi5,
            R.drawable.bagi6,
            R.drawable.bagi7,
            R.drawable.bagi8,
            R.drawable.bagi9,
            R.drawable.bagi10
    };

    private int ListPilihan[][]={
        {R.drawable.no8,R.drawable.no1,R.drawable.no4,R.drawable.no5},
        {R.drawable.no1,R.drawable.no5,R.drawable.no4,R.drawable.no10},
        {R.drawable.no4,R.drawable.no10,R.drawable.no3,R.drawable.no12},
        {R.drawable.no2,R.drawable.no3,R.drawable.no12,R.drawable.no7},
        {R.drawable.no5,R.drawable.no2,R.drawable.no7,R.drawable.no6},
        {R.drawable.no7,R.drawable.no6,R.drawable.no1,R.drawable.no8},
        {R.drawable.no1,R.drawable.no8,R.drawable.no7,R.drawable.no4},
        {R.drawable.no2,R.drawable.no4,R.drawable.no12,R.drawable.no9},
        {R.drawable.no7,R.drawable.no9,R.drawable.no4,R.drawable.no5},
        {R.drawable.no2,R.drawable.no4,R.drawable.no6,R.drawable.no3}
    };
    private int ListJawaban[] = {
            R.drawable.no1,
            R.drawable.no1,
            R.drawable.no3,
            R.drawable.no2,
            R.drawable.no2,
            R.drawable.no1,
            R.drawable.no4,
            R.drawable.no2,
            R.drawable.no4,
            R.drawable.no3
    };

    public int getJumlahSoal(){
        return ListSoal.length;
    }

    public int getSoal(int a){
        return ListSoal[a];
    }

    public int getListSoal(int index){
        int soal = ListSoal[index];
        return soal;
    }

    public int getPilihan(int index, int num){
        int pilihan = ListPilihan[index][num-1];
        return pilihan;
    }
    public int getJawaban(int a){
        int jawaban = ListJawaban[a];
        return jawaban;
    }
}
