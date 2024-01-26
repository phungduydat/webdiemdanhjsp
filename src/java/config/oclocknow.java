/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author duyda
 */
public class oclocknow {

    public String settimenow() {
        LocalDateTime current = LocalDateTime.now();
        //sử dụng class DateTimeFormatter để định dạng ngày giờ theo kiểu pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        //sử dụng phương thức format() để định dạng ngày giờ hiện tại rồi gán cho chuỗi formatted
        String formatted = current.format(formatter);
        //hiển thị chuỗi formatted ra màn hình
//        System.out.println("\n\nNgày giờ hiện tại: " + formatted);
        return formatted;

    }


 
    public static void main(String[] args) {
        oclocknow o = new oclocknow();
        System.out.println(o.settimenow());
                
    }

    boolean getCheckin() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
