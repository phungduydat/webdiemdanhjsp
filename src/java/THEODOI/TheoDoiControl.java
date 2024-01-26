/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package THEODOI;

import config.BDDIEMDANH;
import daodssv.DAODIEMDANH;
import daodssv.DAODSLOP;
import entity.AttenandSV;
import entity.Classmenberandsch;
import entity.Schedule;
import entity.SinhVien;
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
@WebServlet(name = "TheoDoiControl", urlPatterns = {"/theodoi"})
public class TheoDoiControl extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            DAODSLOP dao = new DAODSLOP();
            List<Classmenberandsch> a = dao.getallthanhvien(2);
            String classno = request.getParameter("classno");
            if (classno == null) {
                request.setAttribute("listclass", a);
                request.getRequestDispatcher("selcet_class.jsp").forward(request, response);
            } else {
                 Classmenberandsch d = dao.gettl("cnpm");
            request.setAttribute("classno", d);
                DAODIEMDANH DAO = new DAODIEMDANH();
                Schedule s =DAO.getschedule(2, classno);
                request.setAttribute("s",s);
                
                HttpSession session = request.getSession();
                session.setAttribute("classno", classno);
                BDDIEMDANH SS = new BDDIEMDANH();
                List<AttenandSV> listsvinclass = SS.getAllMSSVINDS(classno);
                int svi = listsvinclass.size();
                request.setAttribute("listsvin", listsvinclass);
                request.setAttribute("index", svi);
                List<AttenandSV> listsvoutclass = SS.getAllSVNOTINDS(classno);
                int svo = listsvoutclass.size();
                request.setAttribute("index2", svo);
                request.setAttribute("listsvout", listsvoutclass);
                request.getRequestDispatcher("TheoDoiGV.jsp").forward(request, response);
            }
        }
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
