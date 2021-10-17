/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sach_Thu_Vien;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;
public class Functions_Sach extends Sach {
    //Constructor
    public Functions_Sach() {
    }

    public Functions_Sach(String maSach, String tenSach, int giaSach, String keSo, String theLoai, String nhaXuatBan, int namXuatBan) {
        super(maSach, tenSach, giaSach, keSo, theLoai, nhaXuatBan, namXuatBan);
    }
    // Hiển thị tất cả sách trong thư viện
    public static List<Sach> showAllSach(){
        List<Sach> ListSach = new ArrayList<>();
        Connection connection = null;
        Statement stm = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLTV","sa","123456@Ab");
            String sql = "SELECT * FROM DBO.SACH";
            stm = connection.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                Sach sach = new Functions_Sach(rs.getString("MASACH"),rs.getString("TENSACH"),rs.getInt("GIASACH"),rs.getString("KESO"),rs.getString("THELOAI"),rs.getString("NHAXB"),rs.getInt("NAMXB"));
                ListSach.add(sach);
            }
            stm.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListSach;
    }
    //Thêm sách vào trong thư viện
    public static void insertSach(Sach sach){
        Connection connection = null;
        PreparedStatement pst = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLTV","sa","123456@Ab");
            String sql = "INSERT INTO DBO.SACH(MASACH, TENSACH, GIASACH, KESO, THELOAI, NHAXB, NAMXB)"
                    + "VALUES(?,?,?,?,?,?,?)";
            pst = connection.prepareStatement(sql);
            pst.setString(1, sach.getMaSach());
            pst.setString(2, sach.getTenSach());
            pst.setInt(3, sach.getGiaSach());
            pst.setString(4, sach.getKeSo());
            pst.setString(5, sach.getTheLoai());
            pst.setString(6, sach.getNhaXuatBan());
            pst.setInt(7, sach.getNamXuatBan());
            pst.executeUpdate();
            connection.close();
            pst.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //Xóa sách khỏi thư viện
    public static void deleteSach(String maSach){
        Connection connection = null;
        PreparedStatement pst = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLTV","sa","123456@Ab");
            String sql = "DELETE FROM DBO.SACH WHERE MASACH = ?";
            pst = connection.prepareStatement(sql);
            pst.setString(1, maSach);
            pst.executeUpdate();
            connection.close();
            pst.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //Chỉnh sửa thông tin sách 
    public static void updateSach(Sach sach){
        Connection connection = null;
        PreparedStatement pst = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLTV","sa","123456@Ab");
            String sql = "UPDATE DBO.SACH SET TENSACH = ?, GIASACH = ?, KESO = ?, THELOAI = ?, NHAXB = ?, NAMXB = ? WHERE MASACH = ?";
            pst = connection.prepareStatement(sql);
            pst.setString(7, sach.getMaSach());
            pst.setString(1, sach.getTenSach());
            pst.setInt(2, sach.getGiaSach());
            pst.setString(3, sach.getKeSo());
            pst.setString(4, sach.getTheLoai());
            pst.setString(5, sach.getNhaXuatBan());
            pst.setInt(6, sach.getNamXuatBan());
            pst.executeUpdate();
            connection.close();
            pst.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //Tìm kiếm thông tin sách theo mã sách
    public static List<Sach> searchSach(String maSach){
        List<Sach> ListSach = new ArrayList<>();
        Connection connection = null;
        PreparedStatement pst = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLTV","sa", "123456@Ab");
            String sql = "SELECT * FROM DBO.SACH WHERE MASACH LIKE ?";
            pst = connection.prepareStatement(sql);
            pst.setString(1, "%"+maSach+"%");
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Sach sach = new Functions_Sach(rs.getString("MASACH"),rs.getString("TENSACH"),rs.getInt("GIASACH"),rs.getString("KESO"),rs.getString("THELOAI"),rs.getString("NHAXB"),rs.getInt("NAMXB"));
                ListSach.add(sach);
            }
            connection.close();
            pst.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListSach;
    }
}
