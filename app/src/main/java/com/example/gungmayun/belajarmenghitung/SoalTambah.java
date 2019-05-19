package com.example.gungmayun.belajarmenghitung;

import java.util.Random;

public class SoalTambah {
    private int ListSoal[] = {
            R.drawable.tambah1,
            R.drawable.tambah2,
            R.drawable.tambah3,
            R.drawable.tambah4,
            R.drawable.tambah5,
            R.drawable.tambah6,
            R.drawable.tambah7,
            R.drawable.tambah8,
            R.drawable.tambah9,
            R.drawable.tambah10
    };

    private int ListPilihan[][]={
        {R.drawable.no2, R.drawable.no4, R.drawable.no10, R.drawable.no1},
        {R.drawable.no10, R.drawable.no8, R.drawable.no5, R.drawable.no12},
        {R.drawable.no3, R.drawable.no4, R.drawable.no7, R.drawable.no6},
        {R.drawable.no10, R.drawable.no1, R.drawable.no6, R.drawable.no9},
        {R.drawable.no12, R.drawable.no5, R.drawable.no3, R.drawable.no4},
        {R.drawable.no4, R.drawable.no3, R.drawable.no1, R.drawable.no6},
        {R.drawable.no7, R.drawable.no1, R.drawable.no10, R.drawable.no12},
        {R.drawable.no6, R.drawable.no8, R.drawable.no9, R.drawable.no1},
        {R.drawable.no9, R.drawable.no7, R.drawable.no10, R.drawable.no3},
        {R.drawable.no12, R.drawable.no4, R.drawable.no2, R.drawable.no5}
    };
    private int ListJawaban[] = {
            R.drawable.no2,
            R.drawable.no5,
            R.drawable.no4,
            R.drawable.no6,
            R.drawable.no5,
            R.drawable.no6,
            R.drawable.no7,
            R.drawable.no9,
            R.drawable.no10,
            R.drawable.no12,
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
