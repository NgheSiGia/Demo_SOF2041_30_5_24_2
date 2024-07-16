/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1_sof2041;
import java.sql.*;
import java.util.ArrayList;

public class Rp_KhoaHoc {
 private Connection con=null;
 private PreparedStatement ps=null;
 private ResultSet rs=null;
 private String sql=null;
 public  ArrayList<Model_KhoaHoc> getAll(){
     ArrayList<Model_KhoaHoc> listKH= new ArrayList();
     //tuyệt đối k dùng * trong select
     sql="select makh,thoiluong,ngaytao,manv from khoahoc";
     try {
         con=DBConnect.getConnection();
         ps=con.prepareStatement(sql);
         rs=ps.executeQuery();// select
         while(rs.next()){
             int maKh, thoiLuong;
             String maNV, ngayTao;
             maKh=rs.getInt(1);
             thoiLuong=rs.getInt(2);
             ngayTao=rs.getString(3);
             maNV=rs.getString(4);
             listKH.add(new Model_KhoaHoc(maKh, thoiLuong, ngayTao, maNV));
         }
         return listKH;
     } catch (Exception e) {
         e.printStackTrace();
         return null;
     }
 }
 // tìm kiếm
 
 public  ArrayList<Model_KhoaHoc> timKiem( String maNVCT){
     ArrayList<Model_KhoaHoc> listKH= new ArrayList();
     //tuyệt đối k dùng * trong select
     sql="select makh,thoiluong,ngaytao,manv from khoahoc where manv like ?";
     try {
         con=DBConnect.getConnection();
         ps=con.prepareCall(sql);
         ps.setObject(1, '%'+maNVCT+'%');
         
         rs=ps.executeQuery();// select
         while(rs.next()){
             int maKh, thoiLuong;
             String maNV, ngayTao;
             maKh=rs.getInt(1);
             thoiLuong=rs.getInt(2);
             ngayTao=rs.getString(3);
             maNV=rs.getString(4);
             listKH.add(new Model_KhoaHoc(maKh, thoiLuong, ngayTao, maNV));
         }
         return listKH;
     } catch (Exception e) {
         e.printStackTrace();
         return null;
     }
 }
}// final
