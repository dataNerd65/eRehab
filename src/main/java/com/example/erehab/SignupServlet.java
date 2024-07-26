package com.example.erehab;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "signupServlet", value = "/signup")
public class SignupServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<form method='POST' action='signup'>");
        out.println("Full name: <input type='text' name='fullname'><br>");
        out.println("Email: <input type='email' name='email'><br>");
        out.println("Phone Number: <input type='number' name='phoneNumber'><br>");
        out.println("Username: <input type='text' name='username'><br>");
        out.println("Password: <input type='password' name='password'><br>");
        out.println("Confirm Password: <input type='password' name='password'><br>");
        out.println("<input type='submit' value='Signup'>");
        out.println("</form>");
        out.println("</body></html>");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        String fullname = request.getParameter("fullname");
        String email = request.getParameter("email");
        String phoneNumber = request.getParameter("phoneNumber");
        String username  = request.getParameter("username");
        String password = request.getParameter("password");
        //User registration logic
        response.sendRedirect("index.jsp");
    }

}
