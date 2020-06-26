
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import modelo.propiedades;

public class propiedadesDAO {
    
    //Adicionar 
    //conexion a la base de datos 
    
    public String propiedades(propiedades propiedades) {
        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
    //sentecia     
        PreparedStatement sentencia;
    //try-catch   
        try {
    // consulta         
            String Query = "INSERT INTO propiedades (nombre,direccion,valor_alojamiento,numero_personas,numero_baños,numero_habitaciones,cocina,aire_acondicionado,piscina,numero_estacionamiento,idusuarios,idtipo_alojamiento,idestado_propiedad,idubicacion)"
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1,propiedades.getNombre());
            sentencia.setString(2,propiedades.getDireccion());
            sentencia.setInt(3,propiedades.getValor_alojamiento());
            sentencia.setInt(4,propiedades.getNumero_personas());
            sentencia.setInt(5,propiedades.getNumero_baños());
            sentencia.setInt(6,propiedades.getNumero_habitaciones());
            sentencia.setInt(7,propiedades.getCocina());
            sentencia.setInt(8,propiedades.getAire_acondicionado());
            sentencia.setInt(9,propiedades.getPiscina());
            sentencia.setInt(10,propiedades.getNumero_estacionamiento());
            sentencia.setInt(11,propiedades.getIdusuarios());
            sentencia.setInt(12,propiedades.getIdtipo_alojamiento());
            sentencia.setInt(13,propiedades.getIdestado_propiedad());
            sentencia.setInt(14,propiedades.getIdubicacion());
            
            sentencia.execute();
            miRespuesta = "";
            
        } catch (Exception ex){
            miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un problea en propiedadesDAO\n " + ex.getMessage());
        }
        
        return miRespuesta;
    }
    
    //Actualizar 
    
    public String actualizarpropiedades (propiedades propiedades){
        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        PreparedStatement sentencia;
        try {
            String Query = "update propiedades set nombre=?, direccion=?, valor_alojamiento=?, numero_personas=?, numero_baños=?, numero_habitaciones=?, cocina=?, aire_acondicionado=?, piscina=?, numero_estacionamiento=?, idusuarios=?, idtipo_alojamiento=?, idestado_propiedad=?, idubicacion=? where idpropiedades=?";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1,propiedades.getNombre());
            sentencia.setString(2,propiedades.getDireccion());
            sentencia.setInt(3,propiedades.getValor_alojamiento());
            sentencia.setInt(4,propiedades.getNumero_personas());
            sentencia.setInt(5,propiedades.getNumero_personas());
            sentencia.setInt(6,propiedades.getNumero_habitaciones());
            sentencia.setInt(7,propiedades.getCocina());
            sentencia.setInt(8,propiedades.getAire_acondicionado());
            sentencia.setInt(9,propiedades.getPiscina());
            sentencia.setInt(10,propiedades.getNumero_estacionamiento());
            sentencia.setInt(11,propiedades.getIdusuarios());
            sentencia.setInt(12,propiedades.getIdtipo_alojamiento());
            sentencia.setInt(13,propiedades.getIdestado_propiedad());
            sentencia.setInt(14,propiedades.getIdubicacion());
            sentencia.setInt(15,propiedades.getIdpropiedades());
          
            
            sentencia.executeUpdate();
            miRespuesta = "";
            
        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un error en propiedadesDAO\n" + ex.getMessage());
        }
        return miRespuesta;
    }
    
}


