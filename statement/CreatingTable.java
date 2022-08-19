package com.josh.jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatingTable {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/jdbc";
        String user = "postgres";
        String password = "123456";
        String query = "CREATE TABLE EmployeeDetails(" +
                "   EId INT PRIMARY KEY     NOT NULL," +
                "   EName           TEXT    NOT NULL," +
                "   EAge            INT     NOT NULL," +
                "   City        CHAR(50));";
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    statement.close();
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

