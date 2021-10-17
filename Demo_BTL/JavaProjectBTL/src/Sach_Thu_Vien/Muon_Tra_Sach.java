/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sach_Thu_Vien;

public abstract class Muon_Tra_Sach {
    private String maBD;
    private String maSach;
    private String ngayMuon;
    private String ngayTra;
    private int soLuong;
    
    //Constructor
    public Muon_Tra_Sach() {}

    public Muon_Tra_Sach(String maBD, String maSach, String ngayMuon, String ngayTra, int soLuong) {
        this.maBD = maBD;
        this.maSach = maSach;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
        this.soLuong = soLuong;
    }
    //Getter & Setter
    public String getMaBD() {
        return maBD;
    }

    public void setMaBD(String maBD) {
        this.maBD = maBD;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(String ngayTra) {
        this.ngayTra = ngayTra;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}