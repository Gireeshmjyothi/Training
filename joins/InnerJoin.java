package com.josh.jdbc.joins;

import java.sql.*;
import java.util.Scanner;

/*
This class is used to fetch the data using inner join
 */
public class InnerJoin {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        System.out.println("enter the number of StudentDetails");
        Scanner scanner = new Scanner(System.in);
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc", "postgres", "123456");
            System.out.println("Connection establised");
            String query = "SELECT" + "SId," + "SName," + "SId," + "SBranch" + "FROM" + "Studentdetails" + "INNER JOIN StudentBranch" + "ON SId = SId;";
            preparedStatement = connection.prepareStatement(query);
            System.out.println("PrepareStatement platform created");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1));
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
