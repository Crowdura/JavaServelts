/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Se.PackServerlt;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 *
 * @author cuerv
 */
@WebServlet(name = "ServerltPrim", urlPatterns = {"/ServerltPrim"})
public class ServerltPrim extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServerltPrim</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServerltPrim at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        PrintWriter output = response.getWriter();
        
        output.println("<html><body>");
        output.println("<h1 style='text-align:center'>Prueba servlet</h1>");
        output.println("");
        output.println("");
        output.println("");
        output.println("");
        output.println("Fecha y hora actual: " + new Date());
        output.println("<form>");
        output.println("</form>");
        output.println("</body></html>");
        
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
        PrintWriter output = response.getWriter();
        
        String name = request.getParameter("name");
        String namel = request.getParameter("namel");
        String email = request.getParameter("email");
        String tel = request.getParameter("tel");
        String pass = request.getParameter("pass");
        
        output.println("<html>");
        output.println("Información pasada");
        output.println("");
        output.println("<h1>"+name+"</h1>");
        output.println("");
        output.println("<h1>"+namel+"</h1>");
        output.println("<h1>"+email+"</h1>");
        output.println("<h1>"+tel+"</h1>");
        output.println("<h1>"+pass+"</h1>");
        output.println("</html>");
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
