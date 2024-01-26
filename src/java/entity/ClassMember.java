/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;

/**
 *
 * @author duyda
 */
public class ClassMember {

    private String classno;
    private String date ; 

    public ClassMember() {
    }

    public ClassMember(String classno, String date) {
        this.classno = classno;
        this.date = date;
    }

    public String getClassno() {
        return classno;
    }

    public void setClassno(String classno) {
        this.classno = classno;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ClassMember{" + "classno=" + classno + ", date=" + date + '}';
    }

   
}
