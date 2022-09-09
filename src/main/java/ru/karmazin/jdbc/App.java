package ru.karmazin.jdbc;

import org.postgresql.Driver;
import ru.karmazin.jdbc.util.ConnectionManager;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws SQLException {
        Class<Driver> driverClass = Driver.class;
        try (var connection = ConnectionManager.open()) {
            System.out.println(connection.getTransactionIsolation());
        }

    }
}
