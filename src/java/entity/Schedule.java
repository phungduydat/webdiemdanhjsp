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
public class Schedule {

    private int idc;
    private String startDate;
    private String endtDate;
    private int idgv;
    private int idmonhoc;
    private String ClassNo;

    public Schedule() {
    }

    public Schedule(int idc, String startDate, String endtDate, int idgv, int idmonhoc, String ClassNo) {
        this.idc = idc;
        this.startDate = startDate;
        this.endtDate = endtDate;
        this.idgv = idgv;
        this.idmonhoc = idmonhoc;
        this.ClassNo = ClassNo;
    }

    public int getIdc() {
        return idc;
    }

    public void setIdc(int idc) {
        this.idc = idc;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndtDate() {
        return endtDate;
    }

    public void setEndtDate(String endtDate) {
        this.endtDate = endtDate;
    }

    public int getIdgv() {
        return idgv;
    }

    public void setIdgv(int idgv) {
        this.idgv = idgv;
    }

    public int getIdmonhoc() {
        return idmonhoc;
    }

    public void setIdmonhoc(int idmonhoc) {
        this.idmonhoc = idmonhoc;
    }

    public String getClassNo() {
        return ClassNo;
    }

    public void setClassNo(String ClassNo) {
        this.ClassNo = ClassNo;
    }

    @Override
    public String toString() {
        return "Schedule{" + "idc=" + idc + ", startDate=" + startDate + ", endtDate=" + endtDate + ", idgv=" + idgv + ", idmonhoc=" + idmonhoc + ", ClassNo=" + ClassNo + '}';
    }

    

}
