/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import daodssv.DAODIEMDANH;
import daodssv.DAODSSV;
import daodssv.DAOKTLOP;
import entity.AttenandSV;
import entity.Attendences;
import entity.SinhVien;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class latetime {

    public String chuyenphut(int n) {
        int hour = 0, minute = 0, second = 0;
        hour = (n / 3600);
        minute = (n % 3660 / 60);
        second = (n % 3600 % 60);
        return (hour + ":" + minute + ":" + second);
    }

    public int timeditre(String startDate, String endDate) {
        DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //PLus 24h
        Calendar cal = Calendar.getInstance();

        cal.setTime(
                new Date());
        cal.add(Calendar.HOUR,
                24);

        Date date1 = null;
        Date date2 = null;
        int getDiff = 0;
        try {
            // calculating the difference b/w startDate and endDate
//            String startDate = "2023-09-5 13:40:00";
//            String endDate = "2023-09-5 13:51:40";

            date1 = simpleDateFormat.parse(startDate);
            date2 = simpleDateFormat.parse(endDate);

            getDiff = (int) ((date2.getTime() - date1.getTime()) / 1000);
//            System.out.println(date2.getTime());
//            System.out.println(date1.getTime());
            // using TimeUnit class from java.util.concurrent package

//            System.out.println(getDiff);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return getDiff;
    }

    public static void main(String[] args) {
        DAOKTLOP daokt = new DAOKTLOP();
        DAODIEMDANH daodd = new DAODIEMDANH();
        ENDLOPHOC e = new ENDLOPHOC();
        latetime late = new latetime();
        oclocknow o = new oclocknow();
        List<AttenandSV> listasv = new ArrayList<>();
        List<AttenandSV> list = e.ListSVDIDUNGGIO("cnpm");
        List<Attendences> listkt = daokt.getAllMSSVINDDlast("cnpm");
        for (AttenandSV i : list) {
            for (Attendences a : listkt) {
                System.out.println(a);
                int check = (late.timeditre(daodd.getschedule(2, "cnpm").getEndtDate(), a.getCheckin()));
                System.out.println(daodd.getschedule(2, "cnpm").getEndtDate());
                System.out.println(a.getCheckin());
                System.out.println(late.chuyenphut(check));
            }
        }
//        for(Attendences a : list){
//            
//              int ta = t.timeditre(dao1.getschedule(2, "cnpm").getStartDate(),a.getCheckin());
//              System.out.println(ta);
//        }
    }
}
