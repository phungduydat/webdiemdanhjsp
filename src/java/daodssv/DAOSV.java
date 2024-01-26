/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daodssv;

import config.RANDOM;
import config.SendEmail;
import context.DBContext;
import entity.SinhVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author duyda
 */
public class DAOSV {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<SinhVien> getAllDSSV() {
        List<SinhVien> list = new ArrayList<>();
        String query = "SELECT * \n"
                + "  FROM SINHVIEN";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new SinhVien(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8)
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public void addsv(String MSSV, String TenSV, String CLASS, String PASSWORD) {
        String query = "insert into SINHVIEN values (?,?,?,?)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            //chuyen cid vao dau ? thu 1
            ps.setString(1, MSSV);
            ps.setString(2, TenSV);
            ps.setString(3, CLASS);
            ps.setString(4, PASSWORD);
            ps.executeQuery();
        } catch (Exception e) {
        }
    }

    public SinhVien login(String user, String pass) {
        String query = "select * from [SINHVIEN]\n"
                + " where MSSV = ? and [PASSWORD] = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            //chuyen cid vao dau ? thu 1
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new SinhVien(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8)
                );
            }
        } catch (Exception e) {
        }
        return null;
    }

    public SinhVien LAYLAIPASS(String EMAIL, String MSSV) {
        String query = "select * from [SINHVIEN]\n"
                + "where MSSV = ?\n"
                + "and EMAIL = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            //chuyen cid vao dau ? thu 1
            ps.setString(1, MSSV);
            ps.setString(2, EMAIL);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new SinhVien(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public SinhVien LAYLAIPASS1(String MSSV) {
        String query = "select * from [SINHVIEN]\n"
                + "where MSSV = ?\n";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            //chuyen cid vao dau ? thu 1
            ps.setString(1, MSSV);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new SinhVien(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public void RESETPASS(String mssv) {
        RANDOM r = new RANDOM();
        String newpass = r.random();
        String query = "UPDATE SINHVIEN\n"
                + "SET PASSWORD = ? \n"
                + " WHERE MSSV = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, newpass);
            ps.setString(2, mssv);
            ps.executeQuery();
        } catch (Exception e) {
        }
    }

    public SinhVien SVBYMSSV(String MSSV) {
        String query = "select * from [SINHVIEN]\n"
                + "where MSSV = ?\n";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            //chuyen cid vao dau ? thu 1
            ps.setString(1, MSSV);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new SinhVien(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public void updatesv(String MSSV, String email, String fname, String lname, String diachi) {
        String query = "  \n"
                + " UPDATE [SINHVIEN]\n"
                + "SET [fristname]= ?,[lastname] = ?, [diachi] = ?,email = ?\n"
                + "WHERE [MSSV] = ?;";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            //chuyen cid vao dau ? thu 1
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, diachi);
            ps.setString(5, MSSV);
            ps.setString(4, email);
            ps.executeQuery();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        DAOSV dao = new DAOSV();
        //        dao.RefeshMssv();
        //        dao.addsv("218060000", "test", "21DTHD5", "1221");
//                List<SinhVien> list = dao.getAllDSSV();
//                for (SinhVien o : list) {
//                    System.out.println(o);
//                }
//        dao.updatesv("2180608807", "duydatphung7@gmail.com", "duy", "dat", "12");
//        SinhVien a = dao.SVBYMSSV("2180608807");
//        System.out.println(a);
//        SinhVien a = dao.SVBYMSSV("2180608807");
//        dao.updateemailsv("2180608807", "duydatphung7@gmail.com");
//        dao.updatesv("2180608807", "duy", "dat", "okla");
//        System.out.println(a);
        String s = "2180608807";
        dao.LAYLAIPASS("duydatphung7@gmail.com","2180608807");
        SinhVien sv = dao.LAYLAIPASS1(s);
        System.out.println(sv);
    }
}
