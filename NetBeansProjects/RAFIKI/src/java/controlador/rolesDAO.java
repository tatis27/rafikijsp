
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import modelo.roles;

public class rolesDAO {
    
    //Adicionar 
    //conexion a la base de datos 
    
    public String adicionarroles(roles roles) {
        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
    //sentecia     
        PreparedStatement sentencia;
    //try-catch   
        try {
    // consulta         
            String Query = "INSERT INTO roles (nombre)"
                    + "VALUES (?)";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1,roles.getNombre());
            
            sentencia.execute();
            miRespuesta = "";
        } catch (Exception ex){
            miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un problea en rolesDAO\n " + ex.getMessage());
        }
        
        return miRespuesta;
    }
    
    //Actualizar 
    
    public String actualizarroles (roles roles){
        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        PreparedStatement sentencia;
        try {
            String Query = "update roles set nombre=? where idroles=?";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1,roles.getNombre());
            sentencia.setInt(2, roles.getIdroles());
            
            sentencia.executeUpdate();
            miRespuesta = "";
            
        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un error en rolesDAO\n" + ex.getMessage());
        }
        return miRespuesta;
    }
    
}
