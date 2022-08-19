package com.josh.jdbc.statement;

import java.sql.*;
import java.util.Scanner;

/*
This class is used to retrieve the existing data from the database
 */
public class RetrieveData {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        Scanner scanner = new Scanner(System.in);
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc", "postgres", "123456");
            System.out.println("Connection establised");
            statement = connection.createStatement();
            System.out.println("Statement platform created");
            String query = "select * from employeedetails";
            resultSet = statement.executeQuery(query);
            //To execute entire data from the table
            while (resultSet.next()) {
                int Eid = resultSet.getInt(1);
                String EName = resultSet.getString(2);
                int EAge = resultSet.getInt(3);
                String City = resultSet.getString(4);
                System.out.println(Eid + "\t" + EName + "\t" + EAge + "\t" + City);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (connection != null && resultSet != null) {
                    resultSet.close();
                    statement.close();

                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

