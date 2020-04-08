package com.app.uts.npm221;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package com.app.dosen.entiti;

/**
 *
 * @author Hafish
 */
public class Buku {

    private String IdBuku;
    private String Judul;
    private String Pengarang;
    private String Penerbit;
    private int Tahun;

    public Buku() {
    }

    public Buku(String nim, String nama, String jurusan, String alamat, String email, int telepon) {
        this.IdBuku = IdBuku;
        this.Judul = Judul;
        this.Pengarang = Pengarang;
        this.Penerbit = Penerbit;
        this.Tahun = Tahun;
        }

    public String getIdBuku() {
        return IdBuku;
    }

    public void setIdBuku(String IdBuku) {
        this.IdBuku = IdBuku;
    }

    public String getJudul() {
        return Judul;
    }

    public void setJudul(String Judul) {
        this.Judul = Judul;
    }

    public String getPengarang() {
        return Pengarang;
    }

    public void setPengarang(String Pengarang) {
        this.Pengarang = Pengarang;
    }

    public String getPenerbit() {
        return Penerbit;
    }

    public void setPenerbit(String Penerbit) {
        this.Penerbit = Penerbit;
    }

    public int getTahun() {
        return Tahun;
    }

    public void setTahun(int Tahun) {
        this.Tahun = Tahun;
    }

    public Object getValue(int index) {
        switch (index) {
            case 0:
                return IdBuku;
            case 1:
                return Judul;
            case 2:
                return Pengarang;
            case 3:
                return Penerbit;
            case 4:
                return Tahun;
            default:
                return null;
            
        }
    }


}
