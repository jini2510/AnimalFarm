package com.Farm;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    public static void main(String [] args){
        Connection conn = null;
        try {
            String userName = "AnimalFarm1";
            String password = "4nVVzNNcF9nT5865";
            String url = "jdbc:mysql://localhost/School";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url, userName, password);
            System.out.println("Database connection established");

        } catch (Exception e) {
            System.err.println("Cannot connect to database server");
            e.printStackTrace();
        }
    }
}
