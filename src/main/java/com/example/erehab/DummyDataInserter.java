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
            User user1 = new User("Caroline Wambui1", "carol_254@gmail.com", "0769988654", "carol81", "carol2");
            User user2 = new User("Brian Kinyanjui2", "kinya_12@gmail.com", "0745494545", "admin_4", "admin_4");

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
