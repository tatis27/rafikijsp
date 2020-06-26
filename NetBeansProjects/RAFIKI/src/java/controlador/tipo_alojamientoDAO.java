package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import modelo.tipo_alojamiento;

public class tipo_alojamientoDAO {
    
    //Adicionar 
    //conexion a la base de datos 
    
    public String adicionartipo_alojamiento(tipo_alojamiento tipo_alojamiento) {
        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
    //sentecia     
        PreparedStatement sentencia;
    //try-catch   
        try {
    // consulta         
            String Query = "INSERT INTO tipo_alojamiento (tipo_alojamiento)"
                    + "VALUES (?)";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1,tipo_alojamiento.getTipo_alojamiento());
            
            sentencia.execute();
            miRespuesta = "";
        } catch (Exception ex){
            miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un problea en tipo_alojamientoDAO\n " + ex.getMessage());
        }
        
        return miRespuesta;
    }
    
    //Actualizar 
    
    public String actualizartipo_alojamiento (tipo_alojamiento tipo_alojamiento){
        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        PreparedStatement sentencia;
        try {
            String Query = "update tipo_alojamiento set tipo_alojamiento=? where idtipo_alojamiento=?";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1,tipo_alojamiento.getTipo_alojamiento());
            sentencia.setInt(2, tipo_alojamiento.getIdtipo_alojamiento());
            
            sentencia.executeUpdate();
            miRespuesta = "";
            
        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un error en rolesDAO\n" + ex.getMessage());
        }
        return miRespuesta;
    }
    
}
