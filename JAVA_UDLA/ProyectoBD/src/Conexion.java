
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
    private static Connection conn = null;
    private static String user; /*= "admin";*/
    private static String password; /*= "admin";*/
    private static String url = "jdbc:oracle:thin:@localhost:1521:xe";//para conectar a la base de datos
    
    public Conexion(String user, String password){
        this.user = user;
        this.password = password;
    }
    
    public static Connection getConnection(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url, user, password);
            conn.setAutoCommit(false);
            if(conn != null){
                System.out.println("Conexion Exitosa");
            }else{
                System.out.println("Conexion Fallida");
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexion erronea: " + e.getMessage());
            return null;
        }
        return conn;
    }
    
    public void desconexion(){
        try {
            conn.close();
        } catch (Exception e) {
            System.out.println("Error al desconectar" + e.getMessage());
        }
    }
    /*
    Toca exportar el driver de conexion de oracle 
    */
}
