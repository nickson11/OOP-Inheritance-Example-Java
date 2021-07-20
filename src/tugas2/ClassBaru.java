/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author 62822
 */
class ClassBaru extends ClassWarisan {
//    variable

    private String nama;
    private String alamat;
    private int usia;
    private String namaortu;

    //getset
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUsia() {
        if (usia <= 5) {
            System.out.println("Kategori Umur          : Balita");
        } else if (usia <= 12) {
            System.out.println("Kategori Umur          : Anak-Anak");
        } else if (usia <= 18) {
            System.out.println("Kategori Umur          : Remaja");
        } else if (usia > 18) {
            System.out.println("Kategori Umur          : Dewasa");
        }
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public String getNamaortu() {
        return namaortu;
    }

    public void setNamaortu(String namaortu) {
        this.namaortu = namaortu;
    }

    //methodkenalan
    public void kenalan(int usia) {
        System.out.println(usia);
    }

}
