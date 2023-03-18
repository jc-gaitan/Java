package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConectionDB {

    // Declaramos la conexion a mysql
    private Connection con;
    private Statement stmt;
    private ResultSet rs;

    // Declaramos los datos de conexion a la bd
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "root";
    private static final String url = "jdbc:mysql://localhost:3306/prueba";//prueba es el nombre de la base de datos

    // Funcion que va conectarse a mi bd de mysql
    public String conector() {
        // Reseteamos a null la conexion a la bd
        con = null;
        try {
            Class.forName(driver);
            // Nos conectamos a la bd
            con = DriverManager.getConnection(url,user,pass);
            // Si la conexion fue exitosa mostramos un mensaje de conexion exitosa
            if (con != null) {
                return "Conexion establecida";
            }
        } // Si la conexion NO fue exitosa mostramos un mensaje de error
        catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            return "Error de conexion" + e;
        }
        
        return "Error de conexion";
    }

}
