/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author WINDOWS 10
 */
public class Mahasiswa {
    private int id;
    private String nim;
    private String nama;
    private String ttl;
    private String jenisKelamin;
    private String programStudi;
    private String alamat;
    private String kelas;
    private String email;
    Login login = new Login();
    java.sql.Connection con;
    java.sql.Statement st;
    java.sql.ResultSet rs;
    String sql;

    public void getdata()  
    {
        try
        {
            sql = "SELECT * FROM `data_mahasiswa` ORDER BY id_data DESC";
            con = (Connection)Database.configDB();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                nim = rs.getString("NIM");
                nama = rs.getString("Nama");
                ttl = rs.getString("TTL");
                jenisKelamin = rs.getString("JenisKelamin");
                programStudi = rs.getString("ProgramStudi");
                alamat = rs.getString("Alamat");
                kelas = rs.getString("Kelas");
            }
            sql = "SELECT Email FROM `dataaccount` ORDER BY id DESC";
            rs = st.executeQuery(sql);
            if (rs.next()) {
                email = rs.getString(1);
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNim() {
        return nim;
    }
        
    public String getNama() {
        return nama;
    }
            

    public String getTtl() {
        return ttl;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getKelas() {
        return kelas;
    }

    public String getEmail() {
        return email;
    }
    
    
    
}
