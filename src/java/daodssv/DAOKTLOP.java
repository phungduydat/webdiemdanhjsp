/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daodssv;

import context.DBContext;
import entity.Attendences;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author duyda
 */
public class DAOKTLOP {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<Attendences> getAllMSSVINDDlast(String classno) {
        List<Attendences> list = new ArrayList<>();
        String query = "  select MSSV, min(checkout) AS TIMECHECKIN  from [diemdanh2]\n"
                + "  where classno = ?"
                + "  group by MSSV ";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, classno);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Attendences(
                        null,
                        rs.getString(1),
                        rs.getString(2)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Attendences> getAllMSSVNOTINCLASSINDDlast(String classno) {
        List<Attendences> list = new ArrayList<>();
        String query = " SELECT MSSV FROM Thanhvien\n"
                + "WHERE MSSV NOT IN (select [MSSV] from DIEMDANH2) And classno = ? ";
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

    public void setAcheckout(String checkout, String classno, String Mssv) {
        String query = "UPDATE bangdiemdanh\n"
                + "SET checkout = ?\n"
                + "WHERE classno = ? and MSSVdiemdanh = ?  ";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, checkout);
            ps.setString(2, classno);
            ps.setString(3, Mssv);

            rs = ps.executeQuery();

        } catch (Exception e) {
        }
    }


    public static void main(String[] args) {
        DAOKTLOP dao = new DAOKTLOP();
        List<Attendences> a = dao.getAllMSSVINDDlast("cnpm");
        for (Attendences i : a) {
            dao.setAcheckout(i.getCheckout(),"cnpm", i.getMSSVdd());
        }
    }
}
