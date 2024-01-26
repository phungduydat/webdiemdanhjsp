/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author duyda
 */
public class Subject {
    private int idmonhoc;
    private String name;

    public Subject(int idmonhoc, String name) {
        this.idmonhoc = idmonhoc;
        this.name = name;
    }

    public Subject() {
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

    @Override
    public String toString() {
        return "Subject{" + "idmonhoc=" + idmonhoc + ", name=" + name + '}';
    }

  
    
}
