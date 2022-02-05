package uas;
import java.sql.*;
import java.util.Arrays;
import javax.swing.JOptionPane;
/**
 *
 * @author WINDOWS 10
 */
public class Tugas {
    java.sql.Connection con;
    java.sql.PreparedStatement pst; 
    java.sql.ResultSet rs;
    String sql;
    
    //menyimpan data deadline jam ke database
    public void saveJam(String jam1,String jam2,String jam3,String jam4,String jam5,String jam6,String jam7,String jam8)
    {
        try {
            sql = "INSERT INTO jam_1 (jam1, jam2, jam3, jam4, jam5, jam6, jam7, jam8) VALUES"
                    + "( '"+jam1+"' , "
                    + " '"+jam2+"' , "
                    + " '"+jam3+"' , "
                    + " '"+jam4+"' , "
                    + " '"+jam5+"' , "
                    + " '"+jam6+"' , "
                    + " '"+jam7+"' , "
                    + " '"+jam8+"' ) ";
            con = (Connection)Database.configDB();
            pst = con.prepareStatement(sql);
            pst.execute();
            System.out.println("data tersimpan");
            
        } catch (SQLException e) {
            System.out.println("gagal : " + e);
        }
    }
    public void saveJam(String jam1,String jam2,String jam3,String jam4,String jam5,String jam6,String jam7,String jam8, String jam9)
    {
        try {
            sql = "INSERT INTO jam_2 (jam1, jam2, jam3, jam4, jam5, jam6, jam7, jam8, jam9) VALUES"
                    + "( '"+jam1+"' , "
                    + " '"+jam2+"' , "
                    + " '"+jam3+"' , "
                    + " '"+jam4+"' , "
                    + " '"+jam5+"' , "
                    + " '"+jam6+"' , "
                    + " '"+jam7+"' , "
                    + " '"+jam8+"' , "
                    + " '"+jam9+"' ) ";
            con = (Connection)Database.configDB();
            pst = con.prepareStatement(sql);
            pst.execute();
            System.out.println("data tersimpan");
            
        } catch (SQLException e) {
            System.out.println("gagal : " + e);
        }
    }
    public void saveDay(String hari1,String hari2,String hari3,String hari4,String hari5,String hari6,String hari7,String hari8)
    {
        try {
            sql = "INSERT INTO hari_1 (hari1, hari2, hari3, hari4, hari5, hari6, hari7, hari8) VALUES"
                    + "( '"+hari1+"' , "
                    + " '"+hari2+"' , "
                    + " '"+hari3+"' , "
                    + " '"+hari4+"' , "
                    + " '"+hari5+"' , "
                    + " '"+hari6+"' , "
                    + " '"+hari7+"' , "
                    + " '"+hari8+"' ) ";
            con = (Connection)Database.configDB();
            pst = con.prepareStatement(sql);
            pst.execute();
            System.out.println("data tersimpan");
            
        } catch (SQLException e) {
            System.out.println("gagal : " + e);
        }
    }
    public void saveDay(String hari1,String hari2,String hari3,String hari4,String hari5,String hari6,String hari7,String hari8, String hari9)
    {
        try {
            sql = "INSERT INTO hari_2 (hari1, hari2, hari3, hari4, hari5, hari6, hari7, hari8, hari9) VALUES"
                    + "( '"+hari1+"' , "
                    + " '"+hari2+"' , "
                    + " '"+hari3+"' , "
                    + " '"+hari4+"' , "
                    + " '"+hari5+"' , "
                    + " '"+hari6+"' , "
                    + " '"+hari7+"' , "
                    + " '"+hari8+"' , "
                    + " '"+hari9+"' ) ";
            con = (Connection)Database.configDB();
            pst = con.prepareStatement(sql);
            pst.execute();
            System.out.println("data tersimpan");
            
        } catch (SQLException e) {
            System.out.println("gagal : " + e);
        }
    }
    
    public String[] getJam1()
    {
        String []jam = new String [8];
        try {
            sql = "SELECT jam1, jam2, jam3, jam4, jam5, jam6, jam7, jam8 FROM jam_1 ORDER BY id DESC";
            con = (Connection)Database.configDB();
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                for (int i = 0; i < 8; i++) {
                    jam[i] = rs.getString((i+1));
                }
            }
            System.out.println("data terload");
        } catch (SQLException e) {
            System.out.println("gagal : " + e);
        }
        return jam;
    }
    public String[] getJam2()
    {
        String []jam = new String [9];
        try {
            sql = "SELECT jam1, jam2, jam3, jam4, jam5, jam6, jam7, jam8, jam9 FROM jam_2 ORDER BY id DESC";
            con = (Connection)Database.configDB();
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                for (int i = 0; i < 9; i++) {
                    jam[i] = rs.getString((i+1));
                }
            }
            System.out.println("data terload");
        } catch (SQLException e) {
            System.out.println("gagal : " + e);
        }
        return jam;
    }
    public String[] gethari1()
    {
        String []hari = new String [8];
        try {
            sql = "SELECT hari1, hari2, hari3, hari4, hari5, hari6, hari7, hari8 FROM hari_1 ORDER BY id DESC";
            con = (Connection)Database.configDB();
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                for (int i = 0; i < 8; i++) {
                    hari[i] = rs.getString((i+1));
                }
            }
            System.out.println("data terload");
        } catch (SQLException e) {
            System.out.println("gagal : " + e);
        }
        return hari;
    }
    public String[] gethari2()
    {
        String []hari = new String [9];
        try {
            sql = "SELECT hari1, hari2, hari3, hari4, hari5, hari6, hari7, hari8, hari9 FROM hari_2 ORDER BY id DESC";
            con = (Connection)Database.configDB();
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                for (int i = 0; i < 9; i++) {
                    hari[i] = rs.getString((i+1));
                }
            }
            System.out.println("data terload");
        } catch (SQLException e) {
            System.out.println("gagal : " + e);
        }
        return hari;
    }
    
    public static void main(String[] args) {
        Tugas tugas = new Tugas();
        System.out.println("Hari 1 : " + Arrays.toString(tugas.gethari1()));
        System.out.println("Hari 2 : " + Arrays.toString(tugas.gethari2()));
    }
}
