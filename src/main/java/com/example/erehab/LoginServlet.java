package com.example.erehab;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "loginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("form method='POST' action='login'");
        out.println("Username: <input type='text' name='username'><br>");
        out.println("Password: <input type='password' name='password'><br>");
        out.println("<input type='submit' value='login'>");
        out.println("</form>");
        out.println("</body></html>");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //Authentication logic
        response.sendRedirect("index.jsp");
    }


}