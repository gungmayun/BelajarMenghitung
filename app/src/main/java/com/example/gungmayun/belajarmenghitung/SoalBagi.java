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
