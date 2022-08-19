package com.josh.jdbc.preparestatement;

import java.sql.*;

public class CreateTable {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/jdbc";
        String user = "postgres";
        String password = "123456";
//        String query = "CREATE TABLE StudentDetails(" +
//                "   SId INT PRIMARY KEY     NOT NULL," +
//                "   SName           TEXT    NOT NULL," +
//                "   MaxMarks        Numeric Default 600.00," +
//                "   ObtainedMarks   REAL    NOT NULL);";
        String query ="CREATE TABLE StudentBranch("+"SId INT PRIMARY KEY     NOT NULL," + "   SBranch  TEXT    NOT NULL);";
        Connection connection = null;
        PreparedStatement preparestatement = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            preparestatement = connection.prepareStatement(query);
            preparestatement.executeUpdate();
            System.out.println("Table Created");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    preparestatement.close();
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
