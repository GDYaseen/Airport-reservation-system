package com.example.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection c=null;

    private DBConnection(){
        //connection avec la base de donnees (JDBC)
        try {
            c=DriverManager.getConnection(null, null, null);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getInstance(){
        if(c==null) new DBConnection();
        return c;
    }

}
