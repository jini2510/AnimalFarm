package com.Farm;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.SQLException;
import java.util.Properties;

public class JDBcConnection {

    public static JdbcTemplate getJdbcTemplate(Properties properties) throws SQLException {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.driver");

        dataSource.setUrl((String) properties.get("database.db.connection"));
        dataSource.setUsername((String) properties.get("database.db.user"));
        dataSource.setPassword((String) properties.get("database.db.password"));
        return new JdbcTemplate(dataSource);
    }

    public static void main(String [] args) throws SQLException {

        Properties uatDatabase = new Properties();

        uatDatabase.put("database.db.connection","jdbc:mysql://localhost/School");
        uatDatabase.put("database.db.user","AnimalFarm1");
        uatDatabase.put("database.db.password","4nVVzNNcF9nT5865");

        JdbcTemplate template = getJdbcTemplate(uatDatabase);

        long startSelectCount = System.currentTimeMillis();
        int result = template.queryForObject("SELECT COUNT(*) FROM students", Integer.class);
        long endSelectCount = System.currentTimeMillis();
        System.out.println(endSelectCount - startSelectCount);

    }
}
