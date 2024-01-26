/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import daodssv.DAODIEMDANH;
import daodssv.DAODSSV;
import daodssv.DAOKTLOP;
import daodssv.DAOSV;
import daodssv.DAOXINNGHI;
import entity.AttenandSV;
import entity.Attendences;
import entity.Donxin;
import entity.SinhVien;
import entity.Sinhviennghi;
import entity.ThanhVien;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author duyda
 */
public class ENDLOPHOC {
//THONG KE SINH VIEN

    public List<AttenandSV> ListSVDIDUNGGIO(String classno) {
        
        DAOSV daosv = new DAOSV();
        DAODSSV daodssv = new DAODSSV();
        DAODIEMDANH daodd = new DAODIEMDANH();
        latetime late = new latetime();
        DAODIEMDANH dao = new DAODIEMDANH();
        //lay sinh vien cua lop
        List<ThanhVien> listsv = daodssv.getallthanhvien(classno);
        List<Attendences> list = dao.getAllMSSVINAT(classno);
        List<AttenandSV> listasv = new ArrayList<>();
        List<SinhVien> listtt = daosv.getAllDSSV();
        for (Attendences o : list) {
            int check = (late.timeditre(daodd.getschedule(2, classno).getStartDate(), o.getCheckin()));
            if (check < 0) {
                for (ThanhVien i : listsv) {
                    if (i.getMSSV().equals(o.getMSSVdd())) {
                        for (SinhVien s : listtt) {
                            if (i.getMSSV().equals(s.getMSSV())) {
                                listasv.add(new AttenandSV(
                                        i.getMSSV(),
                                        s.getTensv(),
                                        o.getCheckin(),
                                        s.getEmail(),
                                        s.getFristname(),
                                        s.getLastname(),
                                        null,
                                        s.getMalop(), null));
                            }
                        }

                    }
                }
            }
        }
        return listasv;
    }

    public List<AttenandSV> ListSVDITRE(String classno) {
        DAOSV daosv = new DAOSV();

        DAODSSV daodssv = new DAODSSV();
        DAODIEMDANH daodd = new DAODIEMDANH();
        latetime late = new latetime();
        DAODIEMDANH dao = new DAODIEMDANH();
        //lay sinh vien cua lop
        List<ThanhVien> listsv = daodssv.getallthanhvien(classno);
        List<Attendences> list = dao.getAllMSSVINAT(classno);
        List<AttenandSV> listasv = new ArrayList<>();
        List<SinhVien> listtt = daosv.getAllDSSV();
        for (Attendences o : list) {
            int check = (late.timeditre(daodd.getschedule(2, "cnpm").getStartDate(), o.getCheckin()));
            if (check > 0) {
                for (ThanhVien i : listsv) {
                    if (i.getMSSV().equals(o.getMSSVdd())) {
                        for (SinhVien s : listtt) {
                            if (i.getMSSV().equals(s.getMSSV())) {
                                listasv.add(new AttenandSV(
                                        i.getMSSV(),
                                        s.getTensv(),
                                        o.getCheckin(),
                                        s.getEmail(),
                                        s.getFristname(),
                                        s.getLastname(),
                                        null,
                                        s.getMalop(), null));
                            }
                        }
                    }
                }
            }
        }
        return listasv;
    }

    public List<AttenandSV> SVNGHIHOC(String classno) {
        DAOSV daosv = new DAOSV();
        DAODSSV daodssv = new DAODSSV();
        DAODIEMDANH daodd = new DAODIEMDANH();
        latetime late = new latetime();
        DAODIEMDANH dao = new DAODIEMDANH();
        //lay sinh vien cua lop
        List<ThanhVien> listsv = daodssv.getallthanhvien(classno);
        List<Attendences> list = dao.getAllMSSVNOTINCLASSINAT(classno);
        List<AttenandSV> listasv = new ArrayList<>();
        List<SinhVien> listtt = daosv.getAllDSSV();
        for (Attendences o : list) {
            for (ThanhVien i : listsv) {
                if (i.getMSSV().equals(o.getMSSVdd())) {
                    for (SinhVien s : listtt) {
                        if (i.getMSSV().equals(s.getMSSV())) {
                            listasv.add(new AttenandSV(
                                    i.getMSSV(),
                                    s.getTensv(),
                                    o.getCheckin(),
                                    s.getEmail(),
                                    s.getFristname(),
                                    s.getLastname(),
                                    null,
                                    s.getMalop(),
                                    null));
                        }
                    }
                }
            }
        }
        return listasv;
    }

    public List<Donxin> SVXINNGHI(String classno) {
        DAODSSV daodssv = new DAODSSV();
        DAOXINNGHI dao = new DAOXINNGHI();
        List<Donxin> a = dao.getallDonxin(classno);
        return a;
    }

    public List<Sinhviennghi> Hocend(String classno) {
        String mssv = null;
        List<Sinhviennghi> list = new ArrayList<>();
        ENDLOPHOC e = new ENDLOPHOC();
        List<AttenandSV> listnghi = e.SVNGHIHOC(classno);
        List<Donxin> listsvxinphep = e.SVXINNGHI(classno);
        for (AttenandSV n : listnghi) {
            if (listsvxinphep.size() >= 0) {
                for (Donxin d : listsvxinphep) {
                    if (n.getMSSV().equals(d.getMssv())) {
                        mssv = d.getMssv();
                        list.add(new Sinhviennghi(
                                d.getLydo(),
                                d.getDuyet(),
                                n.getMSSV(),
                                d.getClassno(),
                                n.getMalop(),
                                n.getName()
                        ));
                    }
                }
                if (!(n.getMSSV().equals(mssv))) {
                    list.add(new Sinhviennghi(
                            null,
                            -1,
                            n.getMSSV(),
                            classno,
                            n.getMalop(),
                            n.getName()
                    ));
                }
            }
        }
        return list;
    }
// ve dung gio

    public List<AttenandSV> ListSVDIHOCDAYDU(String classno) {
        DAOKTLOP daokt = new DAOKTLOP();
        DAODIEMDANH daodd = new DAODIEMDANH();
        ENDLOPHOC e = new ENDLOPHOC();
        latetime late = new latetime();
        List<AttenandSV> listasv = new ArrayList<>();
        List<AttenandSV> list = e.ListSVDIDUNGGIO(classno);
        List<Attendences> listkt = daokt.getAllMSSVINDDlast(classno);
        for (AttenandSV i : list) {
            for (Attendences a : listkt) {
                if (i.getMSSV().equals(a.getMSSVdd())) {
                    int check = (late.timeditre(daodd.getschedule(2, classno).getEndtDate(), a.getCheckout()));
                                        System.out.println(check);

                    if (check > 0 && check < 900) {
                        listasv.add(new AttenandSV(
                                i.getMSSV(),
                                i.getName(),
                                i.getCheckin(),
                                i.getEmail(),
                                i.getFristname(),
                                i.getLastname(),
                                null,
                                i.getMalop(),
                                a.getCheckout()
                        ));
                    }
                }
            }
        }
        return listasv;
    }
//sai
    public List<AttenandSV> ListSVDIHOCTREKETTHUCDUNG(String classno) {
        DAOKTLOP daokt = new DAOKTLOP();
        DAODIEMDANH daodd = new DAODIEMDANH();
        ENDLOPHOC e = new ENDLOPHOC();
        latetime late = new latetime();
        List<AttenandSV> listasv = new ArrayList<>();
        List<AttenandSV> list = e.ListSVDITRE(classno);
        List<Attendences> listkt = daokt.getAllMSSVINDDlast(classno);
        for (AttenandSV i : list) {
            for (Attendences a : listkt) {
                if (i.getMSSV().equals(a.getMSSVdd())) {
                    int check = (late.timeditre(daodd.getschedule(2, classno).getEndtDate(), a.getCheckout()));
                    if (check > 0 && check < 900) {
                        listasv.add(new AttenandSV(
                                i.getMSSV(),
                                i.getName(),
                                i.getCheckin(),
                                i.getEmail(),
                                i.getFristname(),
                                i.getLastname(),
                                null,
                                i.getMalop(),
                                a.getCheckout()
                        ));
                    }
                }
            }
        }
        return listasv;
    }

    public List<AttenandSV> ListSVDIHOCVESOM(String classno) {
        DAOKTLOP daokt = new DAOKTLOP();
        DAODIEMDANH daodd = new DAODIEMDANH();
        ENDLOPHOC e = new ENDLOPHOC();
        latetime late = new latetime();
        List<AttenandSV> listasv = new ArrayList<>();
        List<AttenandSV> list = e.ListSVDIDUNGGIO(classno);
        List<Attendences> listkt = daodd.getAllMSSVINAT(classno);
        for (AttenandSV i : list) {
            for (Attendences a : listkt) {
                if (i.getMSSV().equals(a.getMSSVdd())) {
                    if (a.getCheckout() == null) {
                        listasv.add(new AttenandSV(
                                i.getMSSV(),
                                i.getName(),
                                i.getCheckin(),
                                i.getEmail(),
                                i.getFristname(),
                                i.getLastname(),
                                null,
                                i.getMalop(),
                                a.getCheckin()
                        ));
                    }
                }
            }
        }
        return listasv;
    }

    public List<AttenandSV> ListSVDIHOCNGHIHOC(String classno) {
        DAOKTLOP daokt = new DAOKTLOP();
        DAODIEMDANH daodd = new DAODIEMDANH();
        DAOSV daosv = new DAOSV();
        ENDLOPHOC e = new ENDLOPHOC();
        latetime late = new latetime();
        List<AttenandSV> listasv = new ArrayList<>();
        List<SinhVien> listtt = daosv.getAllDSSV();
        List<Attendences> listkt = daokt.getAllMSSVNOTINCLASSINDDlast(classno);
        for (SinhVien i : listtt) {
            for (Attendences a : listkt) {
                if (i.getMSSV().equals(a.getMSSVdd())) {
                    listasv.add(new AttenandSV(
                            i.getMSSV(),
                            i.getTensv(),
                            null,
                            i.getEmail(),
                            i.getFristname(),
                            i.getLastname(),
                            null,
                            i.getMalop(),
                            a.getCheckin()
                    ));
                }
            }
        }
        return listasv;
    }

    public List<AttenandSV> ListSVDESNOMVESOM(String classno) {
        DAOKTLOP daokt = new DAOKTLOP();
        DAODIEMDANH daodd = new DAODIEMDANH();
        ENDLOPHOC e = new ENDLOPHOC();
        latetime late = new latetime();
        List<AttenandSV> listasv = new ArrayList<>();
        List<AttenandSV> list = e.ListSVDIHOCVESOM(classno);
        List<Attendences> listkt = daodd.getAllMSSVINAT(classno);
        for (AttenandSV i : list) {
            for (Attendences a : listkt) {
                if (i.getMSSV().equals(a.getMSSVdd())) {
                    if (a.getCheckout() == null) {
                        listasv.add(new AttenandSV(
                                i.getMSSV(),
                                i.getName(),
                                i.getCheckin(),
                                i.getEmail(),
                                i.getFristname(),
                                i.getLastname(),
                                null,
                                i.getMalop(),
                                a.getCheckin()
                        ));
                    }
                }
            }
        }
        return listasv;
    }
    public void setcheckout(String classno){
        DAOKTLOP dao = new DAOKTLOP();
        List<Attendences> a = dao.getAllMSSVINDDlast("cnpm");
        for (Attendences i : a) {
            dao.setAcheckout(i.getCheckout(),"cnpm", i.getMSSVdd());
        }
    }
    public static void main(String[] args) {
        //TEST 1
        ENDLOPHOC e = new ENDLOPHOC();
        System.out.println("SINH VIEN  di hoc LOP ");
//        List<AttenandSV> listasv = e.ListSVDIHOCkhongketthuc("cnpm");
//        for (AttenandSV i : listasv) {
//            System.out.println(i);
//        } List<AttenandSV> listasv1 = e.ListSVDIHOCVESOM("cnpm");
        List<AttenandSV> listasv3 = e.ListSVDIHOCDAYDU("cnpm");
        for (AttenandSV i : listasv3) {
            System.out.println(i);
        }
        System.out.println("SINH VIEN DI TRE asdsadasd ");
        List<Sinhviennghi> listasv2 = e.Hocend("cnpm");
        for (Sinhviennghi i : listasv2) {
            System.out.println(i);
        }
        System.out.println("SINH VIEN di hoc ve tre");
        List<AttenandSV> listasv6 = e.ListSVDIHOCVESOM("cnpm");
        for (AttenandSV i : listasv6) {
            System.out.println(i);
        }
           List<AttenandSV> listasv5 = e.ListSVDIHOCTREKETTHUCDUNG("cnpm");
        for (AttenandSV i : listasv5) {
            System.out.println(i);
        }
    }
}
