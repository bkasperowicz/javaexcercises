package com.javaexcercises.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBInsertExample {
    public static void main(String[] args) {
        Connection connection = null;

        try {
            connection = DBUtils.connectToDatabase();

            if(connection != null) {
                // połączenie udane
                Statement insertStatement = connection.createStatement();
                int numberOfRowsInserted = insertStatement.executeUpdate("INSERT INTO Persons(LastName, FirstName, Age, Address, City) VALUES ('Kasperowicz', 'Justyna', 31, 'Żytnia 4A', 'Banino');");
                System.out.println("Wstawiono " + numberOfRowsInserted + " wierszy.");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DBUtils.Close(connection);
        }
    }
}
