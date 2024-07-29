package com.example.erehab;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil{
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try{
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");

            //Retrieve environment variables
            String dbUrl = System.getProperty("DB_URL");
            String dbUsername = System.getProperty("DB_USERNAME");
            String dbPassword = System.getProperty("DB_PASSWORD");

            //Checking if environment variables are set
            if (dbUrl == null || dbUsername == null || dbPassword == null){
                throw new IllegalArgumentException("Database connection properties are not set.");
            }

            //Setting database connection properties from environment variables
            configuration.setProperty("hibernate.connection.url", dbUrl);
            configuration.setProperty("hibernate.connection.username", dbUsername);
            configuration.setProperty("hibernate.connection.password", dbPassword);

            return configuration.buildSessionFactory();

        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {

        return sessionFactory;
    }
    public static void shutdown(){

        getSessionFactory().close();
    }
    public static void testConnection() {
        Session session = null;

        try {
            session = getSessionFactory().openSession();
            session.createSQLQuery("SELECT 1").uniqueResult();
            System.out.println("Database connection established successfully.");

        } catch (Exception e){
            System.err.println("Failed to establish database connection.");
            e.printStackTrace();

        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
