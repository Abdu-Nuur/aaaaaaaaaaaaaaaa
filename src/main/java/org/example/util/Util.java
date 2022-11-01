package org.example.util;

import org.example.etity.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
    public class Util {
        private static final String user = "postgres";
        private static final String password = "abdunuur";
        private static final String url = "jdbc:postgresql://localhost:5432/postgres";

        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(url, user, password);
        }

        public static SessionFactory getSessionFactory(){
            Properties properties = new Properties();
            properties.put(Environment.DRIVER, "org.postgresql.Driver");
            properties.put(Environment.URL, "jdbc:postgresql://localhost:5432/postgres");
            properties.put(Environment.USER, "postgres");
            properties.put(Environment.PASS, "abdunuur");
            properties.put(Environment.HBM2DDL_AUTO, "update");
            properties.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQL9Dialect");
            properties.put(Environment.SHOW_SQL, "false");
            Configuration configuration = new Configuration();
            configuration.addProperties(properties);
            configuration.addAnnotatedClass(Person.class);
            configuration.addAnnotatedClass(Car.class);
            configuration.addAnnotatedClass(SocialMedia.class);
            configuration.addAnnotatedClass(Company.class);
            configuration.addAnnotatedClass(Garage.class);
            return configuration.buildSessionFactory();
        }
    }

