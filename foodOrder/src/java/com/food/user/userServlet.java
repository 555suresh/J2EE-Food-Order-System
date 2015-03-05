
package com.food.user;

import com.food.connection.DBConn;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpCookie;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.catalina.ha.ClusterSession;

/**
 *
 * @author NImesh Chathuranga
 */
@WebServlet(name = "userServlet", urlPatterns = {"/userServlet"})
public class userServlet extends HttpServlet {
    private Object ucontril;

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
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet userServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet userServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
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
        //processRequest(request, response);
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
        //processRequest(request, response);
        PrintWriter out = response.getWriter();
        user user=new user();
        usercontrol uControl=new usercontrol();
        
        int status;
        
        
        user.setCusfname(request.getParameter("cusfname"));
        user.setCuslname(request.getParameter("cuslname"));
        user.setCusaddress(request.getParameter("cusaddr"));
        user.setCustel(request.getParameter("custel"));
        user.setCusemail(request.getParameter("email"));
        user.setAccpsw(request.getParameter("Password"));
               
        try
        {
          status=uControl.saveUser(user);
          if(status>0)
          {
            
          HttpSession userSecssion=request.getSession();
          userSecssion.setAttribute("username",request.getParameter("cusfname"));
          Cookie userCookie=new Cookie("username",request.getParameter("cusfname"));
          userCookie.setMaxAge(100);
          response.addCookie(userCookie);
          response.sendRedirect("index.jsp");
          }
          else
          {
           response.sendRedirect("error.jsp");
          }
        }
        catch(Exception ex)
        {
            out.println(ex);
        }
        
        
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
