/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daodssv;

import context.DBContext;
import entity.Classmenberandsch;
import entity.ThanhVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;

/**
 *
 * @author duyda
 */
public class DAODSLOP {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<Classmenberandsch> getallthanhvien(int idgv) {
        List<Classmenberandsch> list = new ArrayList<>();
        String query = " select * from Monhoc a , \n"
                + "  (\n"
                + "  select idsc ,idgv,s.classno, ngayhoc ,idmonhoc from Bangphancong s, Thanhvienlophoc c\n"
                + "  where s.classno = c.classno\n"
                + "  ) as d\n"
                + "  where a.idmonhoc = d.idmonhoc and idgv = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, idgv);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Classmenberandsch(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getString(6)
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public Classmenberandsch gettl(String classno) {
        
       String query = " select * from Monhoc a , \n" +
"                  (\n" +
"                  select idsc ,idgv,s.classno, ngayhoc ,idmonhoc from Bangphancong s, Thanhvienlophoc c\n" +
"                  where s.classno = c.classno\n" +
"                  ) as d\n" +
"                  where a.idmonhoc = d.idmonhoc  and classno =?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, classno);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Classmenberandsch(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getString(6)
                
                );
            }
        } catch (Exception e) {
        }
        return null;
    }

    public static void main(String[] args) {
        DAODSLOP dao = new DAODSLOP();
        List<Classmenberandsch> a = dao.getallthanhvien(2);
        for (Classmenberandsch i : a) {
            System.out.println(i);
        }
        Classmenberandsch d = dao.gettl("cnpm");
        System.out.println(d);
    }
}
