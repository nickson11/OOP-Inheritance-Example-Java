/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

import java.util.Scanner;

/**
 *
 * @author 62822
 */
public class TD2_682020603 {

    public static void main(String[] args) {

        //variable
        String nama;
        String alamat;
        int usia;
        String namaortu;

        //classbaru
        ClassBaru Baru = new ClassBaru();

        //classwarisan
        ClassWarisan Warisan = new ClassWarisan();

        Scanner scnr = new Scanner(System.in);

        System.out.println("DATA KELUARGA");
        System.out.println("=============================");
        System.out.print("Masukkan Nama     : ");
        nama = scnr.nextLine();
        System.out.print("Masukkan Alamat   : ");
        alamat = scnr.nextLine();
        System.out.print("Nama Orang Tua     : ");
        namaortu = scnr.nextLine();
        System.out.print("Berapa Umurmu     : ");
        usia = scnr.nextInt();

        System.out.println("");

        Baru.setNama(nama);
        Baru.setAlamat(alamat);
        Baru.setUsia(usia);
        Baru.setNamaortu(namaortu);

        System.out.println("HASIL DATA KELUARGA");
        System.out.println("============================");
        System.out.println("Nama Saya              : " + Baru.getNama());
        System.out.println("Alamat Saya            : " + Baru.getAlamat());
        System.out.println("Umur Saya              : " + Baru.getUsia());
        Baru.ortuku(namaortu);
        System.out.println(Baru.getNamaortu());
        Baru.status();
        Baru.kenalan(usia);
        Warisan.info();

    }

}
