package com.example.erehab;

import io.github.cdimascio.dotenv.Dotenv;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import java.util.logging.Logger;

public class AppContextListener implements ServletContextListener {
    private static final Logger logger = Logger.getLogger(AppContextListener.class.getName());

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try {
            Dotenv dotenv = Dotenv.load();

            String dbUrl = dotenv.get("DB_URL");
            String dbUsername = dotenv.get("DB_USERNAME");
            String dbPassword = dotenv.get("DB_PASSWORD");

            if (dbUrl == null || dbUsername == null || dbPassword == null) {
                throw new IllegalArgumentException("Database connection properties are not set");
            }

            System.setProperty("DB_URL", dbUrl);
            System.setProperty("DB_USERNAME", dbUsername);
            System.setProperty("DB_PASSWORD", dbPassword);

            // HibernateUtil.testConnection();
        } catch (Exception e) {
            logger.severe("Failed to initialize context: " + e.getMessage());
            throw e;
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // Cleanup code if necessary
    }
}