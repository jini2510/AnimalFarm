package com.Farm;

import java.sql.*;

public class DatabaseConnection {

    public static void main(String [] args) throws SQLException {
        Connection conn = null;
        try {
            String userName = "AnimalFarm1";
            String password = "4nVVzNNcF9nT5865";
            String url = "jdbc:mysql://localhost/School";
            conn = DriverManager.getConnection(url, userName, password);
            System.out.println("Database connection established");

        } catch (Exception e) {
            System.err.println("Cannot connect to database server");
            e.printStackTrace();
        }
    }
}