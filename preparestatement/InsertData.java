package com.josh.jdbc.preparestatement;

import java.sql.*;
import java.util.Scanner;

/*
This class is used to insert the data into database
 */
public class InsertData {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        System.out.println("enter the number of StudentDetails");
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc", "postgres", "123456");
            System.out.println("Connection establised");
            String query = "insert into studentdetails (SId,SName,ObtainedMarks) values(?,?,?);";
           // String query = "insert into studentBranch (SId,SBranch) values(?,?);";
            preparedStatement = connection.prepareStatement(query);
            System.out.println("PrepareStatement platform created");
            int num = 0;
            do {
                System.out.println("Enter the SId,SName,ObtainedMarks out of 600");
                preparedStatement.setInt(1, scanner.nextInt());
                preparedStatement.setString(2, scanner.next());
                preparedStatement.setInt(3, scanner.nextInt());
                preparedStatement.executeUpdate();
                System.out.println("press 1 to insert one more student data \n If not then press other than 1");
                num = scanner.nextInt();
            } while (num == 1);

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
