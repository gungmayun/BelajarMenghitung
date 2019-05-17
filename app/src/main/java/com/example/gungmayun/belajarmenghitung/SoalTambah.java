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

    public int[] getListSoal(){
       return ListSoal;
    }
    public int[] getListJawaban(){
        return ListJawaban;
    }

    public int getrandomsoal(){
        int random = new Random().nextInt(ListSoal.length);
        return random;
    }
    public int getimagesoal(int i){
        return ListSoal[i];
    }
    public int getimagejawaban(int i){
        return ListJawaban[i];
    }
    public int getjumlahsoal(){
        return ListSoal.length;
    }
    public int getjumlahjawaban(){
        return ListJawaban.length;
    }
}
