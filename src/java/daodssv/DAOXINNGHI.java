/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daodssv;

import context.DBContext;
import entity.DX_SV;
import entity.Donxin;
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
public class DAOXINNGHI {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
//    public void settime(int idTeacher, String DateBD) {
//        String query = "insert into Bangphancong(teacherId,startDate) \n"
//                + "values(?,?)";
//        try {
//            conn = new DBContext().getConnection();//mo ket noi voi sql
//            ps = conn.prepareStatement(query);
//            ps.setInt(1, idTeacher);
//            ps.setString(2, DateBD);
//            ps.executeQuery();
//
//        } catch (Exception e) {
//        }
//    }

    public void SETXINNGHI(String mssv, String lydo, String classno) {

        String query = " insert into donxin(mssv,lydo,duyet,classno) values (?,?,0,?);";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            //chuyen cid vao dau ? thu 1
            ps.setString(1, mssv);
            ps.setString(2, lydo);
            ps.setString(3, classno);
            rs = ps.executeQuery();
        } catch (Exception e) {
        }
    }

    public List<Donxin> DONXINBYMSSV(String mssv) {

        List<Donxin> list = new ArrayList<>();
        String query = "    select * from donxin where mssv = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            //chuyen cid vao dau ? thu 1
            ps.setString(1, mssv);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Donxin(
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getString(5),
                        rs.getString(6)
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Donxin> getallDonxin(String classno) {

        List<Donxin> list = new ArrayList<>();
        String query = "    select * from donxin where classno = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            //chuyen cid vao dau ? thu 1
            ps.setString(1, classno);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Donxin(
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getString(5),
                        rs.getString(6)
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<DX_SV> getallDonxin2(String classno) {

        List<DX_SV> list = new ArrayList<>();
        String query = "  select a.TENSV,b.lydo,b.duyet,a.MSSV,b.classno from SINHVIEN a , (\n"
                + "	 select * from donxin\n"
                + "  where classno = ?\n"
                + "  ) b\n"
                + "  where a.MSSV = b.mssv";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            //chuyen cid vao dau ? thu 1
            ps.setString(1, classno);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new DX_SV(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5)
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public void updatexinnghi(String MSSV) {
        String query = "  UPDATE donxin\n"
                + "  SET DUYET = 1\n"
                + "  WHERE MSSV = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            //chuyen cid vao dau ? thu 1
            ps.setString(1, MSSV);
            rs = ps.executeQuery();
        } catch (Exception e) {
        }

    }

    public static void main(String[] args) {
        DAOXINNGHI dao = new DAOXINNGHI();
        List<DX_SV> a = dao.getallDonxin2("cnpm");
        for (DX_SV i : a) {
            System.out.println(i);
        }
    }
}
