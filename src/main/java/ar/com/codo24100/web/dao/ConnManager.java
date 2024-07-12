package ar.com.codo24100.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnManager {
    
    public static Connection conectar() {
        String url = "jdbc:mysql://127.0.0.1:3306/peliculas_db?serverTimeZone=UTC&userSSL=false";
        String user = "root";
        String password = "password";
        String driver = "com.mysql.cj.jdbc.Driver";
        Connection connection = null;

        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            System.err.println("No se a podido conectar a la db: "+ e.getMessage());
        }

        return connection;
    }

    public static void desconectar(Connection connection) {
        try {
            connection.close();
        } catch(Exception e) {
            System.err.println(e);
        }
    }
}
