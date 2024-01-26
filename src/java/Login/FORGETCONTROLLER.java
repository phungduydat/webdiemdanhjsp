/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Login;

import config.SendEmail;
import daodssv.DAOSV;
import entity.SinhVien;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author duyda
 */
@WebServlet(name = "FORGETCONTROLLER", urlPatterns = {"/forget"})
public class FORGETCONTROLLER extends HttpServlet {

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
            String MSSV = request.getParameter("mssv");
            String email = request.getParameter("email");
            SinhVien a = new SinhVien();
            DAOSV dao = new DAOSV();
            a = dao.LAYLAIPASS(email, MSSV);
//        SendEmail send = new SendEmail();
//        send.send(a.getEmail(), a.getPasswordsv());
            if (a == null) {
                request.getRequestDispatcher("FORGETPASS.jsp").forward(request, response);
            } else {
//            HttpSession session = request.getSession();
                dao.RESETPASS(MSSV);
                SinhVien a1 = dao.LAYLAIPASS(email, MSSV);
                SendEmail send = new SendEmail();
                send.send(a1.getEmail(), a1.getPassword());
                response.sendRedirect("login");
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
