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
            User user1 = new User("Peter Kiarie", "pkiarie811@gmail.com", "0769916158", "pkiarie811", "peter");
            User user2 = new User("Jane Wairimu", "jane254doe@gmail.com", "0112233459", "admin_2", "admin_2");

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
