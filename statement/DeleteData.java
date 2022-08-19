package com.josh.jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteData {
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
                System.out.println("Delete employee data on their EId");
                String query = "delete from employeedetails where EId=" + scanner.nextInt() + ";";
                statement.executeUpdate(query);
                System.out.println("Data deleted");
                System.out.println("press 1 to delete one more employee data \n If not then press other than 1");
                num = scanner.nextInt();
            } while (num == 1);

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
