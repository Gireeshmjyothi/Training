package com.josh.jdbc.preparestatement;

import java.sql.*;
import java.util.Scanner;

/*
This class is used to fetch the data from the database
 */
public class RetrieveData {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        System.out.println("enter the number of StudentDetails");
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc", "postgres", "123456");
            System.out.println("Connection establised");
            String query = "select * from studentdetails;";
            preparedStatement = connection.prepareStatement(query);
            System.out.println("PrepareStatement platform created");
            resultSet = preparedStatement.executeQuery();
            System.out.println("Student details");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getInt(3) + "\t" + resultSet.getInt(4));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    preparedStatement.close();
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
