/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author duyda
 */
public class Attendences {
    private String checkin;
    private String MSSVdd;
    private String checkout;

    public Attendences(String checkin, String MSSVdd, String checkout) {
        this.checkin = checkin;
        this.MSSVdd = MSSVdd;
        this.checkout = checkout;
    }

    public Attendences() {
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getMSSVdd() {
        return MSSVdd;
    }

    public void setMSSVdd(String MSSVdd) {
        this.MSSVdd = MSSVdd;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    @Override
    public String toString() {
        return "Attendences{" + "checkin=" + checkin + ", MSSVdd=" + MSSVdd + ", checkout=" + checkout + '}';
    }
    
   

  
}
