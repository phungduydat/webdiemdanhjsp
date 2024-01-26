/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author duyda
 */
public class Donxin {

    private String lydo;
    private int duyet;
    private String mssv;
    private String classno;

    public Donxin(String lydo, int duyet, String mssv, String classno) {
        this.lydo = lydo;
        this.duyet = duyet;
        this.mssv = mssv;
        this.classno = classno;
    }

    public Donxin() {
    }

    @Override
    public String toString() {
        return "Donxin{" + "lydo=" + lydo + ", duyet=" + duyet + ", mssv=" + mssv + ", classno=" + classno + '}';
    }

    public String getLydo() {
        return lydo;
    }

    public void setLydo(String lydo) {
        this.lydo = lydo;
    }

    public int getDuyet() {
        return duyet;
    }

    public void setDuyet(int duyet) {
        this.duyet = duyet;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getClassno() {
        return classno;
    }

    public void setClassno(String classno) {
        this.classno = classno;
    }


}
