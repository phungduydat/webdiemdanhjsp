/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import com.sun.imageio.plugins.jpeg.JPEG;
import daodssv.DAODIEMDANH;
import daodssv.DAODSSV;
import daodssv.DAOSV;
import entity.AttenandSV;
import entity.Attendences;
import entity.SinhVien;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author duyda
 */
public class BDDIEMDANH {

    public List<AttenandSV> getAllSVNOTINDS(String classno) {
        List<AttenandSV> list = new ArrayList<>();
        try {
            DAODIEMDANH dao1 = new DAODIEMDANH();
            DAODSSV dao = new DAODSSV();
            DAOSV daodssv = new DAOSV();
            List<Attendences> listdssv = dao1.getAllMSSVNOTINCLASSINDD(classno);
            List<SinhVien> listsv = daodssv.getAllDSSV();
            for (Attendences ia : listdssv) {
                for (SinhVien i : listsv) {
                    if (i.getMSSV().equals(ia.getMSSVdd())) {
                        list.add(new AttenandSV(
                                i.getMSSV(),
                                ia.getCheckin(),
                                i.getTensv(),
                                i.getEmail(),
                                i.getFristname(),
                                i.getLastname(),
                                i.getDiachi(),
                                i.getMalop(),
                                null));
                    }
                }
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<AttenandSV> getAllMSSVINDS(String classno) {
        List<AttenandSV> list = new ArrayList<>();
        try {
            DAODIEMDANH dao1 = new DAODIEMDANH();
            DAODSSV dao = new DAODSSV();
            DAOSV daodssv = new DAOSV();
            List<Attendences> listdssv = dao1.getAllMSSVINDD(classno);
            List<SinhVien> listsv = daodssv.getAllDSSV();
            for (Attendences ia : listdssv) {
                for (SinhVien i : listsv) {
                    if (i.getMSSV().equals(ia.getMSSVdd())) {
                        list.add(new AttenandSV(
                                i.getMSSV(),
                                i.getTensv(),
                                ia.getCheckin(),
                                i.getEmail(),
                                i.getFristname(),
                                i.getLastname(),
                                i.getDiachi(),
                                i.getMalop(),
                                null));
                    }
                }
            }
        } catch (Exception e) {
        }
        return list;
    }
    

    public static void main(String[] args) {
        BDDIEMDANH ss = new BDDIEMDANH();

        List<AttenandSV> list2 = ss.getAllMSSVINDS("cnpm");
        for (AttenandSV i : list2) {
            System.out.println(i);
        }
        List<AttenandSV> list1 = ss.getAllSVNOTINDS("cnpm");
        System.out.println(list1.size());
        for (AttenandSV i : list1) {
            System.out.println(i);
        }

//        for (AttenandSV i : list2) {
//            System.out.println(i);
//        }
    }
}
