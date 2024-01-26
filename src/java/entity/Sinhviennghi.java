/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author duyda
 */
  public class Sinhviennghi {

    private String lydo;
    private int duyet;
    private String mssv;
    private String classno;
    private String Malop;
    private String Tensv;

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

    public String getMalop() {
        return Malop;
    }

    public void setMalop(String Malop) {
        this.Malop = Malop;
    }

    public String getTensv() {
        return Tensv;
    }

    public void setTensv(String Tensv) {
        this.Tensv = Tensv;
    }

    public Sinhviennghi(String lydo, int duyet, String mssv, String classno, String Malop, String Tensv) {
        this.lydo = lydo;
        this.duyet = duyet;
        this.mssv = mssv;
        this.classno = classno;
        this.Malop = Malop;
        this.Tensv = Tensv;
    }

    @Override
    public String toString() {
        return "Sinhviennghi{" + "lydo=" + lydo + ", duyet=" + duyet + ", mssv=" + mssv + ", classno=" + classno + ", Malop=" + Malop + ", Tensv=" + Tensv + '}';
    }
    
}
