/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysqlconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AdminSena
 */
public class Mysqlconnect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String usuario = "root";
        String clave = "root";
        String url = "jdbc:mysql://localhost:3306/prueba";
        Connection con;
        Statement stmt;
        ResultSet rs;
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Mysqlconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            con = DriverManager.getConnection(url,usuario,clave);
            stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO usuario VALUES(null,'Jose','jp@mail.com','123')");
            rs = stmt.executeQuery("SELECT * FROM usuario");
            rs.next();
            do{
                System.out.println(rs.getString("a")+" Nombre: "+rs.getString("nombre")+" Correo: "+rs.getString("email")+" Contraseña: "+rs.getString("num"));
            }while(rs.next());
        } catch (SQLException ex) {
            Logger.getLogger(Mysqlconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
