package Imagenes;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class EnviarDatos {
    private String mensaje = "";
    
    /*public String Insert(Connection con, Cliente clien){
        PreparedStatement pst = null;
        String sql = "INSERT INTO Persona(cc, nombre1, nombre2, apellido1, apellido2, telefono1, telefono2) VALUES (?,?,?,?,?,?,?)";
        
        String sql1 = "INSERT INTO cliente" +
                "(direccion, barrio, email, persona)" +
                "VALUES (?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, clien.getCc());
            pst.setString(2, clien.getNombre1());
            pst.setString(3, clien.getNombre2());
            pst.setString(4, clien.getApellido1());
            pst.setString(5, clien.getApellido2());
            pst.setInt(6, clien.getTelefono1());
            pst.setInt(7, clien.getTelefono2());
            pst.execute();
            pst.close();
            
            pst = con.prepareStatement(sql1);
            pst.setString(1, clien.getDireccion());
            pst.setString(2, clien.getBarrio());
            pst.setString(3, clien.getEmail());
            pst.setInt(4,(int)clien.getCc());
            mensaje = "Guardador correctamente.";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) {
          mensaje = "No se pudo guardar correctamente. \n" + e.getMessage();
        }
        return mensaje;
    }*/
    
    /*public String update(Connection con, Cliente clien){
        PreparedStatement pst = null;
        String sql = "UPDATE Persona SET cc = ?, nombre1 = ?, nombre2 = ?, apellido1 = ?, apellido2 = ?, telefono1 = ?, telefono2 = ?" +
                    "WHERE cc = ?";
        String sql1 = "UPDATE cliente SET direccion = ?, barrio = ?, email = ?" +
                "WHERE persona = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, (int)clien.getCc());
            pst.setString(2, clien.getNombre1());
            pst.setString(3, clien.getNombre2());
            pst.setString(4, clien.getApellido1());
            pst.setString(5, clien.getApellido2());
            pst.setInt(6, (int)clien.getTelefono1());
            pst.setInt(7, (int)clien.getTelefono2());
            pst.setInt(8, (int)clien.getCc());
            pst.execute();
            pst.close();
            
            pst = con.prepareStatement(sql1);
            pst.setString(1, clien.getDireccion());
            pst.setString(2, clien.getBarrio());
            pst.setString(3, clien.getEmail());
            pst.setInt(4,(int)clien.getCc());
            mensaje = "Actualizado correctamente.";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) {
          mensaje = "No se pudo actualizar correctamente. \n" + e.getMessage();
        }
        return mensaje;
    }*/
    
   /* public String delete(Connection con, Cliente clien){
        PreparedStatement pst = null;
        String sql = "DELETE FROM Persona WHERE cc = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, (int)clien.getCc());
            mensaje = "Se ha eliminado correctamente.";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
          mensaje = "No se pudo eliminar correctamente. \n" + e.getMessage();
        }
        return mensaje;
    }*/
    
}
