package com.juaracoding;

public class SoalKedua {

    public static void main(String[] args) {
        int angka = 9;
        for (int i = 0; i <= angka; i++) {
            for (int j = i; j <= angka; j++) {
                if(j % 2 == 1){
                    System.out.print(j);
                }else{
                    System.out.print("_");
                }
            }
            angka--;
            System.out.println();
        }
    }
}
