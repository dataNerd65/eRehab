package com.example.erehab;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

@WebServlet(name = "loginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //Authentication logic
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try{
            transaction = session.beginTransaction();
            User user = (User) session.createQuery("FROM User U WHERE U.username = :username")
                    .setParameter("username", username)
                    .uniqueResult();

            if (user != null && user.getPassword().equals(password)) {
                response.sendRedirect("welcome.jsp");
            }else{
                response.sendRedirect("login.jsp?error=true");
            }

            transaction.commit();
        } catch(Exception e){
            if(transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        response.sendRedirect("index.jsp");
    }


}