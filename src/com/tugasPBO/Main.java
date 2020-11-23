package com.tugasPBO;

/*Nama      : Argya Aulia Fauzandika
  NIM       : 10119035
  Kelas     : IF1
  Deskripsi : Program ini menampilkan hasil perhitungan gradien garis lurus mengimplementasikan interface
* */

public class Main {
    public static void main(String[] args){
        Koordinat koor = new Koordinat(2,10,5,7);
        System.out.println("Garis yang melalui titik ("+koor.getX1()+","+koor.getX2()+") dan" +
                " ("+koor.getY1()+","+koor.getY2()+") memiliki gradien sebesar "+koor.hitungGradient());

        Koordinat koor1 = new Koordinat(5,1,3,12);
        System.out.println("Garis yang melalui titik ("+koor1.getX1()+","+koor1.getX2()+") dan" +
                " ("+koor1.getY1()+","+koor1.getY2()+") memiliki gradien sebesar "+koor1.hitungGradient());

    }
}
