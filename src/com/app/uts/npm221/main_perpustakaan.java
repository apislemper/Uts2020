/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.uts.npm221;

import java.sql.SQLException;

/**
 *
 * @author Hafish
 */

public class main_perpustakaan {
    public static void main(String[] args){
        BukuDataSource datasource = new BukuDataSource();
    Buku bk = new Buku();
    bk.setIdBuku("123c");
    bk.setJudul("jatuh bangun");
    bk.setPengarang("ibnu taher");
    bk.setPenerbit("Nadila Apriyani");
    bk.setTahun(2003);
    boolean sukses = datasource.insert(bk);
    if(sukses){
        System.out.println("data berhasil disimpan");
    }else{
                System.out.println("data insert gagal");
                }
    }
    }

