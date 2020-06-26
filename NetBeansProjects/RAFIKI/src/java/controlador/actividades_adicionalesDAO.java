
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import modelo.actividades_adicionales;

public class actividades_adicionalesDAO {
    
    //Adicionar 
    //conexion a la base de datos 
    
    public String adicionaractividades_adicionales(actividades_adicionales actividades_adicionales) {
        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
    //sentecia     
        PreparedStatement sentencia;
    //try-catch   
        try {
    // consulta         
            String Query = "INSERT INTO actividades_adicionales (nombre,idubicacion)"
                    + "VALUES (?,?)";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1,actividades_adicionales.getNombre());
            sentencia.setInt(2,actividades_adicionales.getIdubicacion());
            
            sentencia.execute();
            miRespuesta = "";
            
        } catch (Exception ex){
            miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un problea en actividades_adicionalesDAO\n " + ex.getMessage());
        }
        
        return miRespuesta;
    }
    
    //Actualizar 
    
    public String actualizaractividades_adicionales (actividades_adicionales actividades_adicionales){
        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        PreparedStatement sentencia;
        try {
            String Query = "update actividades_adicionales set nombre=?, idubicacion=? where idactividades_adicionales=?";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1,actividades_adicionales.getNombre());
            sentencia.setInt(2,actividades_adicionales.getIdubicacion());
            sentencia.setInt(3,actividades_adicionales.getIdactividades_adicionales());
          
            
            sentencia.executeUpdate();
            miRespuesta = "";
            
        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un error en actividades_adicionalesDAO\n" + ex.getMessage());
        }
        return miRespuesta;
    }
    
}

