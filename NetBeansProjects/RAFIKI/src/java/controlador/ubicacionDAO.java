
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import modelo.ubicacion;

public class ubicacionDAO {
    
    //Adicionar 
    //conexion a la base de datos 
    
    public String adicionarubicacion(ubicacion ubicacion) {
        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
    //sentecia     
        PreparedStatement sentencia;
    //try-catch   
        try {
    // consulta         
            String Query = "INSERT INTO ubicacion (Departamento,municipio)"
                    + "VALUES (?,?)";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1,ubicacion.getDepartamento());
            sentencia.setString(2,ubicacion.getMunicipio());
            
            sentencia.execute();
            miRespuesta = "";
        } catch (Exception ex){
            miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un problea en ubicacionDAO\n " + ex.getMessage());
        }
        
        return miRespuesta;
    }
    
    //Actualizar 
    
    public String actualizarubicacion (ubicacion ubicacion){
        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        PreparedStatement sentencia;
        try {
            String Query = "update ubicacion set departamento=?, municipio=? where idubicacion=?";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1,ubicacion.getDepartamento());
            sentencia.setString(2,ubicacion.getMunicipio());
            sentencia.setInt(3, ubicacion.getIdubicacion());
            
            sentencia.executeUpdate();
            miRespuesta = "";
            
        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un error en ubicacionDAO\n" + ex.getMessage());
        }
        return miRespuesta;
    }
   
}
