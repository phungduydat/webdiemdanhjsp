/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author duyda
 */
public class CLASS {
    private int id;
    private String Malop;
    private String Tenlop;

    public CLASS() {
    }

    public CLASS(int id, String Malop, String Tenlop) {
        this.id = id;
        this.Malop = Malop;
        this.Tenlop = Tenlop;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMalop() {
        return Malop;
    }

    public void setMalop(String Malop) {
        this.Malop = Malop;
    }

    public String getTenlop() {
        return Tenlop;
    }

    public void setTenlop(String Tenlop) {
        this.Tenlop = Tenlop;
    }

    @Override
    public String toString() {
        return "CLASS{" + "id=" + id + ", Malop=" + Malop + ", Tenlop=" + Tenlop + '}';
    }
    
}
