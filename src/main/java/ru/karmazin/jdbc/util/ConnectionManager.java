package ru.karmazin.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Vladislav Karmazin
 */
public final class ConnectionManager {
    private static final String URL = "db.url";
    private static final String USERNAME = "db.username";
    private static final String PASSWORD = "db.password";

    public ConnectionManager() {
    }

    public static Connection open(){
        try{
            return DriverManager.getConnection(
                    PropertiesUtil.get(URL),
                    PropertiesUtil.get(USERNAME),
                    PropertiesUtil.get(PASSWORD));
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}
