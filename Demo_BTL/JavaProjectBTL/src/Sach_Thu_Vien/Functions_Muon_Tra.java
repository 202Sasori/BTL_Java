/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sach_Thu_Vien;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Functions_Muon_Tra extends Muon_Tra_Sach{
    //Constructor
    public Functions_Muon_Tra() {
    }

    public Functions_Muon_Tra(String maBD, String maSach, String ngayMuon, String ngayTra, int soLuong) {
        super(maBD, maSach, ngayMuon, ngayTra, soLuong);
    }
    
    //Hiển thị toàn bộ danh sách mượn trả
    public static List<Muon_Tra_Sach> showAllMuonTra(){
        List<Muon_Tra_Sach> ListMT = new ArrayList<>();
        Connection connection = null;
        Statement stm = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLTV","sa","123456@Ab");
            String sql = "SELECT * FROM DBO.MUONTRA";
            stm = connection.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                Muon_Tra_Sach mt = new Functions_Muon_Tra(rs.getString("MABD"),rs.getString("MASACH"),rs.getString("NGAYMUON"),rs.getString("NGAYTRA"),rs.getInt("SOLUONG"));
                ListMT.add(mt);
            }
            connection.close();
            stm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListMT;
    }
    //Thực hiện mượn sách - thêm thông tin mượn trả
    public static void insertMT(Muon_Tra_Sach mt){
        Connection connection = null;
        PreparedStatement pst = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLTV","sa","123456@Ab");
            String sql = "INSERT INTO DBO.MUONTRA(MABD,MASACH,NGAYMUON,NGAYTRA,SOLUONG) VALUES(?,?,?,?,?)";
            pst = connection.prepareStatement(sql);
            pst.setString(1, mt.getMaBD());
            pst.setString(2, mt.getMaSach());
            pst.setString(3, mt.getNgayMuon());
            pst.setString(4, mt.getNgayTra());
            pst.setInt(5, mt.getSoLuong());
            pst.executeUpdate();
            connection.close();
            pst.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //Sửa thông tin mượn trả
    public static void updateMT(Muon_Tra_Sach mt){
        Connection connection = null;
        PreparedStatement pst = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLTV","sa","123456@Ab");
            String sql = "UPDATE MUONTRA SET MASACH = ?, NGAYMUON = ?, NGAYTRA = ?, SOLUONG = ? WHERE MABD = ?";
            pst = connection.prepareStatement(sql);
            pst.setString(5, mt.getMaBD());
            pst.setString(1, mt.getMaSach());
            pst.setString(2, mt.getNgayMuon());
            pst.setString(3, mt.getNgayTra());
            pst.setInt(4, mt.getSoLuong());
            pst.executeUpdate();
            connection.close();
            pst.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //Thực hiện trả sách - xóa thông tin mượn trả
    public static void deleteMT(String maBD){
        Connection connection = null;
        PreparedStatement pst = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLTV","sa","123456@Ab");
            String sql = "DELETE FROM DBO.MUONTRA WHERE MABD = ?";
            pst = connection.prepareStatement(sql);
            pst.setString(1, maBD);
            pst.executeUpdate();
            connection.close();
            pst.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //Thực hiện tìm kiếm thông tin chi tiết mượn trả
     public static List<Muon_Tra_Sach> searchMT(String maBD){
        List<Muon_Tra_Sach> ListMT = new ArrayList<>();
        Connection connection = null;
        PreparedStatement pst = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLTV","sa", "123456@Ab");
            String sql = "SELECT * FROM DBO.MUONTRA WHERE MABD LIKE ?";
            pst = connection.prepareStatement(sql);
            pst.setString(1, "%"+maBD+"%");
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Muon_Tra_Sach mt = new Functions_Muon_Tra(rs.getString("MABD"),rs.getString("MASACH"),rs.getString("NGAYMUON"),rs.getString("NGAYTRA"),rs.getInt("SOLUONG"));
                ListMT.add(mt);
            }
            connection.close();
            pst.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListMT;
    }
           
}
