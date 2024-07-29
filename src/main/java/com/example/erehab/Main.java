package com.example.erehab;

import io.github.cdimascio.dotenv.Dotenv;

public class Main {
    public static void main(String[] args) {
        //loading environment variables in main
        Dotenv dotenv = Dotenv.load();
        System.setProperty("DB_NAME", dotenv.get("DB_NAME"));
        System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME"));
        System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));

        HibernateUtil.testConnection();
        DummyDataInserter.insertDummyData();
    }
}
