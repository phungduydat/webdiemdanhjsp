/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author duyda
 */
public class Classmenberandsch {
    public int idmonhoc;
    public String name;
    public int idsc;
    public int idgv;
    public String classno;
    public String ngayhoc;

    public Classmenberandsch(int idmonhoc, String name, int idsc, int idgv, String classno, String ngayhoc) {
        this.idmonhoc = idmonhoc;
        this.name = name;
        this.idsc = idsc;
        this.idgv = idgv;
        this.classno = classno;
        this.ngayhoc = ngayhoc;
    }

    public Classmenberandsch() {
    }

 

    public int getIdgv() {
        return idgv;
    }

    public void setIdgv(int idgv) {
        this.idgv = idgv;
    }
    public int getIdmonhoc() {
        return idmonhoc;
    }

    public void setIdmonhoc(int idmonhoc) {
        this.idmonhoc = idmonhoc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdsc() {
        return idsc;
    }

    public void setIdsc(int idsc) {
        this.idsc = idsc;
    }

    public String getClassno() {
        return classno;
    }

    public void setClassno(String classno) {
        this.classno = classno;
    }

    public String getNgayhoc() {
        return ngayhoc;
    }

    public void setNgayhoc(String ngayhoc) {
        this.ngayhoc = ngayhoc;
    }

    @Override
    public String toString() {
        return "Classmenberandsch{" + "idmonhoc=" + idmonhoc + ", name=" + name + ", idsc=" + idsc + ", classno=" + classno + ", ngayhoc=" + ngayhoc + '}';
    }
    
}
