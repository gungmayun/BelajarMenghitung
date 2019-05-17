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
