/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author duyda
 */
public class SinhVien {

    private String MSSV;
    private String Tensv;
    private String Password;
    private String email;
    private String fristname;
    private String lastname;
    private String diachi;
    private String Malop;

    public SinhVien() {
    }

    public SinhVien(String MSSV, String Tensv, String Password, String email, String fristname, String lastname, String diachi, String Malop) {
        this.MSSV = MSSV;
        this.Tensv = Tensv;
        this.Password = Password;
        this.email = email;
        this.fristname = fristname;
        this.lastname = lastname;
        this.diachi = diachi;
        this.Malop = Malop;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "MSSV=" + MSSV + ", Tensv=" + Tensv + ", Password=" + Password + ", email=" + email + ", fristname=" + fristname + ", lastname=" + lastname + ", diachi=" + diachi + ", Malop=" + Malop + '}';
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public String getTensv() {
        return Tensv;
    }

    public void setTensv(String Tensv) {
        this.Tensv = Tensv;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFristname() {
        return fristname;
    }

    public void setFristname(String fristname) {
        this.fristname = fristname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDiachi() {
        return diachi;
    }

        public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getMalop() {
        return Malop;
    }

    public void setMalop(String Malop) {
        this.Malop = Malop;
    }

}
