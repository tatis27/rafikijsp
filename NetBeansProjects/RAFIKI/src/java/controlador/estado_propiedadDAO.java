package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import modelo.estado_propiedad;

public class estado_propiedadDAO {
    
    //Adicionar 
    //conexion a la base de datos 
    
    public String adicionarestado_propiedad(estado_propiedad estado_propiedad) {
        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
    //sentecia     
        PreparedStatement sentencia;
    //try-catch   
        try {
    // consulta         
            String Query = "INSERT INTO estado_propiedad (tipoestado_propiedad)"
                    + "VALUES (?)";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1,estado_propiedad.getTipoestado_propiedad());
            
            sentencia.execute();
            miRespuesta = "";
        } catch (Exception ex){
            miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un problea en estado_propiedadDAO\n " + ex.getMessage());
        }
        
        return miRespuesta;
    }
    
    //Actualizar 
    
    public String actualizarestado_propiedad (estado_propiedad estado_propiedad){
        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        PreparedStatement sentencia;
        try {
            String Query = "update estado_propiedad set tipoestado_propiedad=? where idestado_propiedad=?";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1,estado_propiedad.getTipoestado_propiedad());
            sentencia.setInt(2, estado_propiedad.getIdestado_propiedad());
            
            sentencia.executeUpdate();
            miRespuesta = "";
            
        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un error en estado_propiedadDAO\n" + ex.getMessage());
        }
        return miRespuesta;
    }
    
}
