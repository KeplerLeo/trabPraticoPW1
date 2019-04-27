package dao;

import java.sql.*;

/**
 *
 * @author silviacb
 */
public class ConnectionFactory {

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String urlBD = "jdbc:mysql://localhost:3307/pw1trab";
        return DriverManager.getConnection(urlBD, "root", "usbw");
    }
}
