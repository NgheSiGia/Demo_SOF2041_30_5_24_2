
package demo1_sof2041;

import java.sql.*;
import java.util.ArrayList;

public class Repositories_NV {
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql;
    
    public ArrayList<Model_NV> getAll(){
        ArrayList<Model_NV> list_NV = new ArrayList<>();
        sql = "select MaNV, MatKhau, HoTen, VaiTro from NhanVien";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                String maNv, pass, ten;
                boolean vaiTro;
                maNv = rs.getString(1);
                pass = rs.getString(2);
                ten = rs.getString(3);
                vaiTro = rs.getBoolean(4);
                Model_NV m1 = new Model_NV(maNv, pass, ten, vaiTro);
                list_NV.add(m1);
            }
            return list_NV;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public int them(Model_NV m2){
        sql = "insert into NhanVien (MaNV, MatKhau, HoTen, VaiTro) values (?,?,?,?)";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, m2.getMaNv());
            ps.setObject(2, m2.getPass());
            ps.setObject(3, m2.getTen());
            ps.setObject(4, m2.getVaiTro());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    public int xoa(String maXoa){
        sql = "delete from NhanVien where MaNV = ?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, maXoa);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    public int sua(Model_NV m3, String maSua){
        sql = "update NhanVien set MatKhau = ?, HoTen = ?, VaiTro = ? where MaNV = ?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, m3.getPass());
            ps.setObject(2, m3.getTen());
            ps.setObject(3, m3.getVaiTro());
            ps.setObject(4, maSua);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
