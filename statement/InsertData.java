package com.josh.jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertData {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/jdbc";
        String user = "postgres";
        String password = "123456";
        Connection connection = null;
        Statement statement = null;
        System.out.println("enter the number of EmployeesDetails");
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection establised");
            statement = connection.createStatement();
            System.out.println("Statement platform created");
            System.out.println("enter the number of employees");
            int num = 0;
            do {
                System.out.println("Enter the Eid,EName,EAge and City");
                String query = "insert into employeedetails(EId,EName,EAge,City)values(" + scanner.nextInt() + ",'" + scanner.next() + "'," + scanner.nextInt() + ",'" + scanner.next() + "');";
                statement.executeUpdate(query);
                System.out.println("press 1 to insert one more employee data \n If not then press other than 1");
                num = scanner.nextInt();
            } while (num == 1);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                    statement.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
