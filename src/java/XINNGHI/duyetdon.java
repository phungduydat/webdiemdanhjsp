/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package XINNGHI;

import daodssv.DAODSLOP;
import daodssv.DAOXINNGHI;
import entity.Classmenberandsch;
import entity.DX_SV;
import entity.Donxin;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author duyda
 */
@WebServlet(name = "duyetdon", urlPatterns = {"/duyetdon"})
public class duyetdon extends HttpServlet {

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
                request.getRequestDispatcher("selcet_class_3.jsp").forward(request, response);
            } else {
                DAOXINNGHI dao1 = new DAOXINNGHI();
                List<DX_SV> donxin = dao1.getallDonxin2(classno);
                request.setAttribute("donxin", donxin);
                request.getRequestDispatcher("Duyetdon.jsp").forward(request, response);
            }
            String masv = request.getParameter("Mssv");
            if (masv != null) {
                DAOXINNGHI dao2 = new DAOXINNGHI();
                dao2.updatexinnghi(masv);
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
