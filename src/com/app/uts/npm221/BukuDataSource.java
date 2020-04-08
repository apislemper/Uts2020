/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.uts.npm221;


import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Hafish
 */
public class BukuDataSource {
    private Connection connection;
    public BukuDataSource(){
       connection = ConnectMysql.getConnection();
}
    
public List<Buku> getAll(){
    List<Buku> list = new ArrayList<>();
    String sql = "SELECT * FROM Perpustakaan";
            try {
                PreparedStatement statement = connection.prepareStatement(sql);
                ResultSet rs = statement.executeQuery();
                Buku bk;
                while(rs.next()){
                    bk = new Buku();
                    bk.setIdBuku(rs.getString("IdBuku"));
                    bk.setJudul(rs.getString("Judul"));
                    bk.setPengarang(rs.getString("Pengarang"));
                    bk.setPenerbit(rs.getString("Penerbit"));
                    bk.setTahun(rs.getInt("Tahun"));
                    list.add(bk);
                }
            } catch(Exception e) {
                System.out.println("Error get all " + e.getMessage());
}
return list;
}

public Buku getByIdBuku(String IdBuku){
    String sql = "SELECT * FROM Mahasiswa WHERE IdBuku=?";
    Buku bk = null ; 
    try {
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, IdBuku);
        ResultSet rs = statement.executeQuery();
        if(rs.next()){
            bk = new Buku();
                    bk.setIdBuku(rs.getString("IdBuku"));
                    bk.setJudul(rs.getString("Judul"));
                    bk.setPengarang(rs.getString("Pengarang"));
                    bk.setPenerbit(rs.getString("Penerbit"));
                    bk.setTahun(rs.getInt("Tahun"));
                    }
            } catch(Exception e) {
                    
        }
    return bk;
            
    }

public boolean insert (Buku bk){
    boolean status = false ; 
    String sql = "INSERT INTO Buku VALUES(?,?,?,?,?)";
   try {
       PreparedStatement statement = connection.prepareStatement(sql);
       statement.setString(1, bk.getIdBuku());
       statement.setString(2, bk.getJudul());
       statement.setString(3, bk.getPengarang());
       statement.setString(4, bk.getPenerbit());
       statement.setInt(5, bk.getTahun());
       int result = statement.executeUpdate();
       status = result > 0 ;
   }catch(Exception e){
       
   }
   return status;
}


public boolean update (Buku bk){
    boolean status = false ; 
    String sql = "UPDATE Buku SET Judul = ? , Pengarang = ? , Penerbit = ?, Tahun = ? " + "WHERE IdBuku = ?";
   try {
       PreparedStatement statement = connection.prepareStatement(sql);
       statement.setString(1, bk.getJudul());
       statement.setString(2, bk.getPengarang());
       statement.setString(3, bk.getPenerbit());
       statement.setInt(4, bk.getTahun());
       statement.setString(5, bk.getIdBuku());
       int result = statement.executeUpdate();
       status = result > 0 ;
   }catch(Exception e){
       
   }
   return status;
}


public boolean delete (Buku bk){
    boolean status = false ; 
    String sql = "DELETE FROM Buku WHERE IdBuku = ?";
   try {
       PreparedStatement statement = connection.prepareStatement(sql);
       statement.setString(1, bk.getIdBuku());
       int result = statement.executeUpdate();
       status = result > 0 ;
   }catch(Exception e){
       
   }
   return status;
}



}
