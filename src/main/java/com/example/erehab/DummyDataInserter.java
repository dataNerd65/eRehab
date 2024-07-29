package com.example.erehab;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class DummyDataInserter {
    public static void insertDummyData() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try{
            transaction = session.beginTransaction();

            //Inserting dummy data
            User user1 = new User("John Doe", "johndoe@gmail.com", "0112233445", "jon_doe", "password123");
            User user2 = new User("Jane Doe", "janedoe@gmail.com", "0112233455", "admin", "admin");

            session.save(user1);
            session.save(user2);

            transaction.commit();
            System.out.println("Dummy data inserted successfully.");
        }catch(Exception e) {
            if (transaction != null) {
                transaction.rollback();

            }
            e.printStackTrace();
        }finally{
            session.close();
        }
    }
}
