package com.example.erehab;

import io.github.cdimascio.dotenv.Dotenv;

public class Main {
    public static void main(String[] args) {
        //loading environment variables in main
        Dotenv dotenv = Dotenv.load();
        String dbUrl = dotenv.get("DB_URL");
        String dbUsername = dotenv.get("DB_USERNAME");
        String dbPassword = dotenv.get("DB_PASSWORD");

        //Checking if environment variables are set
        if (dbUrl == null || dbUsername == null || dbPassword == null) {
            throw new IllegalArgumentException("Database connection properties are not set");
        }
        System.setProperty("DB_URL", dbUrl);
        System.setProperty("DB_USERNAME", dbUsername);
        System.setProperty("DB_PASSWORD", dbPassword);

        HibernateUtil.testConnection();
        DummyDataInserter.insertDummyData();
    }
}
