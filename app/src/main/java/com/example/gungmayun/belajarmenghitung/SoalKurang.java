package com.example.gungmayun.belajarmenghitung;

import java.util.Random;

public class SoalKurang {
    private int ListSoal[] = {
            R.drawable.kurang1,
            R.drawable.kurang2,
            R.drawable.kurang3,
            R.drawable.kurang4,
            R.drawable.kurang5,
            R.drawable.kurang6,
            R.drawable.kurang7,
            R.drawable.kurang8,
            R.drawable.kurang9,
            R.drawable.kurang10
    };
    private int ListPilihan[][]= {
            {R.drawable.no1,R.drawable.no7,R.drawable.no2,R.drawable.no9},
            {R.drawable.no3,R.drawable.no9,R.drawable.no5,R.drawable.no2},
            {R.drawable.no2,R.drawable.no10,R.drawable.no3,R.drawable.no7},
            {R.drawable.no6,R.drawable.no1,R.drawable.no7,R.drawable.no12},
            {R.drawable.no7,R.drawable.no12,R.drawable.no4,R.drawable.no5},
            {R.drawable.no5,R.drawable.no4,R.drawable.no1,R.drawable.no6},
            {R.drawable.no1,R.drawable.no6,R.drawable.no2,R.drawable.no5},
            {R.drawable.no5,R.drawable.no2,R.drawable.no4,R.drawable.no7},
            {R.drawable.no7,R.drawable.no4,R.drawable.no10,R.drawable.no2},
            {R.drawable.no10,R.drawable.no2,R.drawable.no4,R.drawable.no1}
    };
    private int ListJawaban[] = {
            R.drawable.no1,
            R.drawable.no2,
            R.drawable.no3,
            R.drawable.no1,
            R.drawable.no4,
            R.drawable.no5,
            R.drawable.no2,
            R.drawable.no7,
            R.drawable.no7,
            R.drawable.no4
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
