/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1_sof2041;

/**
 *
 * @author ADMIN
 */
public class Model_KhoaHoc {
    private int maKH;
    private int thoiLuong;
    private String ngayLap;
    private String maNV;

    public Model_KhoaHoc() {
    }

    public Model_KhoaHoc(int maKH, int thoiLuong, String ngayLap, String maNV) {
        this.maKH = maKH;
        this.thoiLuong = thoiLuong;
        this.ngayLap = ngayLap;
        this.maNV = maNV;
    }

    public Model_KhoaHoc(int thoiLuong, String ngayLap, String maNV) {
        this.thoiLuong = thoiLuong;
        this.ngayLap = ngayLap;
        this.maNV = maNV;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public int getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public String getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(String ngayLap) {
        this.ngayLap = ngayLap;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }
    public Object[] toDataRow(){
        return new Object[]{this.getMaKH(),
        this.getThoiLuong(), this.getNgayLap(),
        this.getMaNV()};
        
    }
    
}
