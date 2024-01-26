/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daodssv;

import context.DBContext;
import entity.Attendences;
import entity.Schedule;
import entity.SinhVien;
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
public class DAODIEMDANH {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
//    public void settime(int idTeacher, String DateBD) {
//        String query = "insert into Schedule(teacherId,startDate) \n"
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

    public List<ThanhVien> getThanhvien(String classno) {
        List<ThanhVien> list = new ArrayList<>();
        String query = "  select MSSV,classno from Thanhvien\n"
                + "  where classno = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            //chuyen cid vao dau ? thu 1
            ps.setString(1, classno);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new ThanhVien(
                        rs.getString(1),
                        rs.getString(2)
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Attendences> getAllMSSVINAT(String classno) {
        List<Attendences> list = new ArrayList<>();
        String query = "select MSSVdiemdanh , checkin ,checkout from bangdiemdanh\n"
                + "where classno = ? ";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, classno);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Attendences(
                        rs.getString(2),
                        rs.getString(1),
                        rs.getString(3)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Attendences> getAllMSSVNOTINCLASSINAT(String classno) {
        List<Attendences> list = new ArrayList<>();
        String query = " SELECT MSSV FROM Thanhvien\n"
                + "WHERE classno = ? and MSSV NOT IN (select [MSSVdiemdanh] from bangdiemdanh)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, classno);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Attendences(
                        null,
                        rs.getString(1),
                        null));
            }
        } catch (Exception e) {
        }
        return list;

    }

    public List<Attendences> getAllMSSVINDD(String classno) {
        List<Attendences> list = new ArrayList<>();
        String query = "  select MSSV, min(checkin) AS TIMECHECKIN  from [diemdanh]\n"
                + "  where classno = ?"
                + "  group by MSSV ";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, classno);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Attendences(
                        rs.getString(2),
                        rs.getString(1),
                        null));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Attendences> getAllMSSVNOTINCLASSINDD(String classno) {
        List<Attendences> list = new ArrayList<>();
        String query = " SELECT MSSV FROM Thanhvien\n"
                + "WHERE MSSV NOT IN (select [MSSV] from DIEMDANH) And classno = ? ";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, classno);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Attendences(
                        null,
                        rs.getString(1), null
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public void setAtten(String classno) {
        String query = "   insert into bangdiemdanh (MSSVdiemdanh, checkin, classno)\n"
                + "   select MSSV , min(checkin) , classno as checkin\n"
                + "   from diemdanh\n"
                + "   where classno = ?\n"
                + "   group by MSSV , classno;";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, classno);
            ps.executeQuery();
        } catch (Exception e) {
        }
    }

    public void settimestart(String starttime, int igv, String classno) {
        String query = "UPDATE Bangphancong\n"
                + "SET  startDate = ? \n"
                + "WHERE classno = ? and idgv = ? ;";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            //chuyen cid vao dau ? thu 1
            ps.setString(1, starttime);
            ps.setInt(3, igv);
            ps.setString(2, classno);
            rs = ps.executeQuery();
        } catch (Exception e) {
        }
    }

    public void settimesend(String endtime, int igv, String classno) {
        String query = "UPDATE Bangphancong\n"
                + "SET  endDate = ? \n"
                + "WHERE classno = ? and idgv = ? ;";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            //chuyen cid vao dau ? thu 1
            ps.setString(1, endtime);
            ps.setInt(3, igv);
            ps.setString(2, classno);
            rs = ps.executeQuery();
        } catch (Exception e) {
        }
    }

    public Schedule getschedule(int igv, String classno) {
        String query = " select  * from [Bangphancong]\n"
                + "  where idgv = ? and classno = ? ";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            //chuyen cid vao dau ? thu 1
            ps.setInt(1, igv);
            ps.setString(2, classno);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Schedule(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getString(6)
                );
            }
        } catch (Exception e) {
        }
        return null;
    }

    public static void main(String[] args) {
        DAODIEMDANH DAO = new DAODIEMDANH();
        List<Attendences> lista = DAO.getAllMSSVNOTINCLASSINAT("cnpm");
        for (Attendences o : lista) {
            System.out.println(o);
        }        

//        List<ThanhVien> listb = DAO.getThanhvien("cnpm");
//        for (ThanhVien o : listb) {
//            System.out.println(o);
//        }

//        Schedule a = DAO.getschedule(2, "cnpm");
//        oclocknow o = new oclocknow();
////        DAO.settimestart(o.settimenow(), 2, 1, "cnpm");
////        DAO.settimesend(o.settimenow(), 0);
//         Schedule s =DAO.getschedule(2, "cnpm");
//         System.out.println(s);
//         System.out.println(s.getStartDate());
    }
}
