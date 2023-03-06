package org.example.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonConnection {

    private static Connection maConnection = null;

    static {
        try {
            Class.forName("org.sqlite.JDBC");
            maConnection = DriverManager.getConnection("url", "user","password");
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        return maConnection;
    }
}
