/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ban_Doc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Functions extends Ban_Doc{
    //Constructor
    public Functions() {
    }

    public Functions(String maBD, String tenBD, String SDT, String diaChiBD, String gioiTinh, String sachMuon) {
        super(maBD, tenBD, SDT, diaChiBD, gioiTinh, sachMuon);
    }
   
    //Hiển thị toàn bộ thông tin bạn đọc
    public static List<Ban_Doc> showBanDoc(){ // Lấy ra danh sách bạn đọc
        List<Ban_Doc> ListBD = new ArrayList<>();
        Connection connection = null;
        Statement stm = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLTV", "sa", "123456@Ab");
            String sql = " SELECT * FROM DBO.BANDOC";
            stm = connection.createStatement();/****/
            ResultSet rs = stm.executeQuery(sql);/***/
            while(rs.next()){
                Ban_Doc bd = new Functions(rs.getString("MABD"),rs.getString("TENBD"),rs.getString("SDT"),rs.getString("DIACHI"),rs.getString("GIOITINH"),rs.getString("SACHMUON") );
                ListBD.add(bd);
            }
            connection.close();
            stm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBD;
    }
    //Thêm bạn đọc
    public static void insertBD(Ban_Doc bd){
        Connection connection = null;
        PreparedStatement pst = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLTV", "sa", "123456@Ab");
            String sql = "INSERT INTO DBO.BANDOC(MABD, TENBD, SDT, DIACHI, GIOITINH, SACHMUON) VALUES(?,?,?,?,?,?)";
            pst = connection.prepareStatement(sql);/*****/
            pst.setString(1, bd.getMaBD());
            pst.setString(2, bd.getTenBD());
            pst.setString(3, bd.getSDT());
            pst.setString(4, bd.getDiaChiBD());
            pst.setString(5, bd.getGioiTinh());
            pst.setString(6, bd.getSachMuon());
            pst.executeUpdate();
            connection.close();
            pst.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //Xóa bạn đọc 
    public static void deleteBD(String maBD){
        Connection connection = null;
        PreparedStatement pst = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLTV", "sa", "123456@Ab");
            String sql = "DELETE FROM DBO.BANDOC WHERE MABD = ?";
            pst = connection.prepareStatement(sql);
            pst.setString(1, maBD);
            pst.executeUpdate();
            connection.close();
            pst.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //Chỉnh sửa thông tin bạn đọc
    public static  void updateBD(Ban_Doc bd){
        Connection connection = null;
        PreparedStatement pst = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLTV","sa","123456@Ab");
            String sql = "UPDATE DBO.BANDOC SET TENBD = ?, SDT = ?, DIACHI = ?, GIOITINH = ?, SACHMUON = ? WHERE MABD = ?";
            pst = connection.prepareStatement(sql);
            pst.setString(6, bd.getMaBD());
            pst.setString(1, bd.getTenBD());
            pst.setString(2, bd.getSDT());
            pst.setString(3, bd.getDiaChiBD());
            pst.setString(4, bd.getGioiTinh());
            pst.setString(5, bd.getSachMuon());
            pst.executeUpdate();
            connection.close();
            pst.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // Tìm kiếm thông tin bạn đọc theo mã bạn đọc
    public static List<Ban_Doc> searchBD(String maBD){
        List<Ban_Doc> ListBD = new ArrayList<>();
        Connection connection = null;
        PreparedStatement pst = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLTV","sa","123456@Ab");
            String sql = "SELECT * FROM DBO.BANDOC WHERE MABD LIKE ?";
            pst = connection.prepareStatement(sql);
            pst.setString(1, "%"+maBD+"%");
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Ban_Doc bd = new Functions(rs.getString("MABD"),rs.getString("TENBD"),rs.getString("SDT"),rs.getString("DIACHI"),rs.getString("GIOITINH"),rs.getString("SACHMUON"));
                ListBD.add(bd);
            }
            connection.close();
            pst.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBD;
    }
}
