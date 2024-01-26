/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author duyda
 */
public class ThanhVien {
    private String MSSV;
    private String classno;

    public ThanhVien() {
    }

    public ThanhVien(String MSSV, String classno) {
        this.MSSV = MSSV;
        this.classno = classno;
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public String getClassno() {
        return classno;
    }

    public void setClassno(String classno) {
        this.classno = classno;
    }

    @Override
    public String toString() {
        return "ThanhVien{" + "MSSV=" + MSSV + ", classno=" + classno + '}';
    }
    
}
