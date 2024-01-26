/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author duyda
 */
public class GiaoVien {

    private int idgv;
    private String MAGV;
    private String TenGV;
    private String PASS;
    private String email;
    private String fristname;
    private String lastname;

    public GiaoVien() {
    }

    public GiaoVien(int id, String MAGV, String TenGV, String PASS, String email, String fristname, String lastname) {
        this.idgv = id;
        this.MAGV = MAGV;
        this.TenGV = TenGV;
        this.PASS = PASS;
        this.email = email;
        this.fristname = fristname;
        this.lastname = lastname;
    }

    public int getIdgv() {
        return idgv;
    }

    public void setId(int idgv) {
        this.idgv = idgv;
    }

    public String getMAGV() {
        return MAGV;
    }

    public void setMAGV(String MAGV) {
        this.MAGV = MAGV;
    }

    public String getTenGV() {
        return TenGV;
    }

    public void setTenGV(String TenGV) {
        this.TenGV = TenGV;
    }

    public String getPASS() {
        return PASS;
    }

    public void setPASS(String PASS) {
        this.PASS = PASS;
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

    @Override
    public String toString() {
        return "GiaoVien{" + "idgv=" + idgv + ", MAGV=" + MAGV + ", TenGV=" + TenGV + ", PASS=" + PASS + ", email=" + email + ", fristname=" + fristname + ", lastname=" + lastname + '}';
    }
    
}
