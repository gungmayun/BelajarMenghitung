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

    public int[] getListSoalKurang(){
        return ListSoal;
    }
    public int[] getListJawabanKurang(){
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
