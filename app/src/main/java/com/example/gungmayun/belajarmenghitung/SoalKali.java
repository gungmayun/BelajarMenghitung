package com.example.gungmayun.belajarmenghitung;

import java.util.Random;

public class SoalKali {
    private int ListSoal[] = {
            R.drawable.kali1,
            R.drawable.kali2,
            R.drawable.kali3,
            R.drawable.kali4,
            R.drawable.kali5,
            R.drawable.kali6,
            R.drawable.kali7,
            R.drawable.kali8,
            R.drawable.kali9,
            R.drawable.kali10
    };
    private int ListPilihan[][]={
            {R.drawable.no1, R.drawable.no12,R.drawable.no9,R.drawable.no7},
            {R.drawable.no9,R.drawable.no2,R.drawable.no5,R.drawable.no3},
            {R.drawable.no5,R.drawable.no3,R.drawable.no4,R.drawable.no6},
            {R.drawable.no4,R.drawable.no6,R.drawable.no10,R.drawable.no3},
            {R.drawable.no10,R.drawable.no5,R.drawable.no1,R.drawable.no2},
            {R.drawable.no8,R.drawable.no2,R.drawable.no7,R.drawable.no10},
            {R.drawable.no7,R.drawable.no10,R.drawable.no12,R.drawable.no2},
            {R.drawable.no12,R.drawable.no2,R.drawable.no1,R.drawable.no10},
            {R.drawable.no1,R.drawable.no10,R.drawable.no2,R.drawable.no5},
            {R.drawable.no2,R.drawable.no5,R.drawable.no8,R.drawable.no4}
    };
    private int ListJawaban[] = {
            R.drawable.no1,
            R.drawable.no2,
            R.drawable.no4,
            R.drawable.no3,
            R.drawable.no5,
            R.drawable.no8,
            R.drawable.no2,
            R.drawable.no12,
            R.drawable.no10,
            R.drawable.no8
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
