/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daodssv;

import config.latetime;
import context.DBContext;
import entity.GiaoVien;
import entity.SinhVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.apache.jasper.tagplugins.jstl.core.Out;

/**
 *
 * @author duyda
 */
public class TEACHERDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<GiaoVien> getAllTEACHER() {
        List<GiaoVien> list = new ArrayList<>();
        String query = "SELECT * \n"
                + "  FROM GIAOVIEN";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new GiaoVien(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7)
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }

//    public void addsv(String MSSV, String TenSV, String CLASS, String PASSWORD) {
//        String query = "insert into SINHVIEN values (?,?,?,?)";
//        try {
//            conn = new DBContext().getConnection();//mo ket noi voi sql
//            ps = conn.prepareStatement(query);
//            //chuyen cid vao dau ? thu 1
//            ps.setString(1, MSSV);
//            ps.setString(2, TenSV);
//            ps.setString(3, CLASS);
//            ps.setString(4, PASSWORD);
//
//            ps.executeQuery();
//        } catch (Exception e) {
//        }
//    }
    public GiaoVien loginT(String user, String pass) {
        String query = "select * from [GIANGVIEN]\n"
                + "where [MAGV] = ?\n"
                + "and [PASSWORD] = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            //chuyen cid vao dau ? thu 1
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new GiaoVien(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7)
                );
            }
        } catch (Exception e) {
        }
        return null;
    }

    public GiaoVien GVBYMSGV(String MAGV) {
        String query = "select * from [GIANGVIEN]\n"
                + "where [MAGV] = ?\n";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            //chuyen cid vao dau ? thu 1
            ps.setString(1, MAGV);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new GiaoVien(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7)
                );
            }
        } catch (Exception e) {
        }
        return null;
    }


    public void update(String MSGV, String fname, String lname, String email) {
         String query = "  \n"
                + " UPDATE [GIANGVIEN]\n"
                + "SET email = ?, [fristname]= ?,[lastname] = ?\n"
                + "WHERE [MAGV] = ?;";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            //chuyen cid vao dau ? thu 1
            ps.setString(1, email);
            ps.setString(2, fname);
            ps.setString(3, lname);
            ps.setString(4, MSGV);
            ps.executeQuery();
        } catch (Exception e) {
        }
    }
    public static void main(String[] args) {
        TEACHERDAO dao = new TEACHERDAO();
//        dao.RefeshMssv();
//        dao.addsv("218060000", "test", "21DTHD5", "1221");
        GiaoVien a = dao.GVBYMSGV("12345");
        System.out.println(a);
        
    }
}
