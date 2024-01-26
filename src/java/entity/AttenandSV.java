/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author duyda
 */
public class AttenandSV {

    private String MSSV;
    private String Name;
    private String checkin;
    private String email;
    private String fristname;
    private String lastname;
    private String diachi;
    private String malop;
    private String checkout;

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    public AttenandSV(String MSSV, String Name, String checkin, String email, String fristname, String lastname, String diachi, String malop, String checkout) {
        this.MSSV = MSSV;
        this.Name = Name;
        this.checkin = checkin;
        this.email = email;
        this.fristname = fristname;
        this.lastname = lastname;
        this.diachi = diachi;
        this.malop = malop;
        this.checkout = checkout;
    }

    public AttenandSV() {
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
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
        return malop;
    }

    public void setMalop(String malop) {
        this.malop = malop;
    }

    @Override
    public String toString() {
        return "AttenandSV{" + "MSSV=" + MSSV + ", Name=" + Name + ", checkin=" + checkin + ", email=" + email + ", fristname=" + fristname + ", lastname=" + lastname + ", diachi=" + diachi + ", malop=" + malop + ", checkout=" + checkout + '}';
    }

}
