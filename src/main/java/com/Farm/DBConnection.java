package com.Farm;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

    public static void main(String[] args) throws SQLException {

        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;

        try {
            connection = DB.getConnection();
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            System.out.println("Connected!");



        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
