/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daodssv;

import context.DBContext;
import entity.Attendences;
import entity.ClassMember;
import entity.ThanhVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author duyda
 */
public class DAODSSV {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    //sinh vien da quet ma
    public void RefeshMssv() {
        String query = "delete from bangdiemdanh";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.executeQuery();
        } catch (Exception e) {
        }
    }

    public List<ThanhVien> getallthanhvien(String classno) {
        List<ThanhVien> list = new ArrayList<>();
        String query = "select classno , mssv from Thanhvien\n"
                + "where classno = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, classno);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new ThanhVien(
                        rs.getString(2),
                        rs.getString(1)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public static void main(String[] args) {
        DAODSSV dao = new DAODSSV();
        List<ThanhVien> a = dao.getallthanhvien("cnpm");
        for (ThanhVien i : a) {
            System.out.println(i);
        }

    }
}
