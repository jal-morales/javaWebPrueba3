/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author CETECOM
 */
public class Conexion {
    private final static String serverName = "localhost:3306";
    
    private final static String userName = "root";
    private final static String password = "";
   
    public Connection getConnection(String dbName) throws SQLException, 
            ClassNotFoundException 
    {
        Connection conn = null;
        Properties connectionProps = new Properties();
        connectionProps.put("user", userName);
        connectionProps.put("password", password);
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://" 
                + serverName + "/"  + dbName, connectionProps);
        System.out.println("¡Conexión Exitosa!");
        return conn;
        
    }
}
