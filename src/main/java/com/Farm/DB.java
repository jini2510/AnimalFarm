package com.Farm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {

    private static final String USERNAME = "AnimalFarm";
    private static final String PASSWORD = "UdM56NheRpyhiucA";
    private static final String CONNECTION = "jdbc:mysql://localhost/School";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(CONNECTION, USERNAME, PASSWORD);
    }
}
