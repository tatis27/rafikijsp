
package Prueba;

import java.sql.Connection;
import controlador.Conexion;

public class PruebaConexion {
    
    public static void main(String[] args) {
        Conexion con = new Conexion(); 
        
        Connection reg = con.getConn(); 
    };
}
