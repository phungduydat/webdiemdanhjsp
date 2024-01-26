/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package THONGKE;

import config.ENDLOPHOC;
import daodssv.DAODSLOP;
import entity.AttenandSV;
import entity.Classmenberandsch;
import entity.Sinhviennghi;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author duyda
 */
@WebServlet(name = "ThongkeControl", urlPatterns = {"/thongke"})
public class ThongkeControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        ENDLOPHOC end = new ENDLOPHOC();
        DAODSLOP dao = new DAODSLOP();
        List<Classmenberandsch> a = dao.getallthanhvien(2);
        String classno = request.getParameter("classno");
        if (classno == null) {
            request.setAttribute("listclass", a);
            request.getRequestDispatcher("selcet_class_1.jsp").forward(request, response);
        } else {
            Classmenberandsch d = dao.gettl("cnpm");
            request.setAttribute("classno", d);
            end.setcheckout(classno);
            List<AttenandSV> list1 = end.ListSVDIHOCDAYDU(classno);
            request.setAttribute("list1", list1);
            //sv di tre 
            List<AttenandSV> list2 = end.ListSVDIHOCTREKETTHUCDUNG(classno);
            request.setAttribute("list2", list2);
            //sv nghi hoc
            List<Sinhviennghi> list3 = end.Hocend(classno);
            request.setAttribute("list3", list3);
            //sv ve sớm
            List<AttenandSV> list4 = end.ListSVDESNOMVESOM(classno);
            request.setAttribute("list4", list4);

            request.getRequestDispatcher("ThongKeCuoiGioGV.jsp").forward(request, response);
        }
        //SV di som 

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
