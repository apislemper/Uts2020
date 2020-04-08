/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.uts.npm221;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hafish
 */
public class ConnectMysql {
    public static Connection connection;
    static{
    MysqlDataSource ds = new MysqlDataSource();
        ds.setServerName ("localhost");
        ds.setDatabaseName("Perpustakaan");
        ds.setUser ("root");
        ds.setPassword("");
        try { 
            connection = ds.getConnection() ;
          //  System.out.println("koneksi mysql berhasil");
        } catch (SQLException ex) {
            Logger.getLogger(ConnectMysql.class.getName()).log(Level.SEVERE, null, ex);
            //System.out.println("koneksi mysql gagal");
            //System.out.println("error " + ex.getMessage());
        }
    }
    
    
    public static Connection getConnection(){
        return connection ; 
    }


}