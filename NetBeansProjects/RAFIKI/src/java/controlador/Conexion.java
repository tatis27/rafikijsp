
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

  
public class Conexion {
    
    private Connection conn; // se crea un objeto conn de tipo Connection
    private String  driver = "com.mysql.cj.jdbc.Driver"; //java date base conectio- parametros de conexion con la BD
    private String user = "root";
    private String password = "M4f4ld4.";
    private String baseDatos = "rafiki";
    private String url = "jdbc:mysql://localhost:3306/"+baseDatos+"?useTimezone=true&serverTimezone=UTC";
    // se crea el metodo constructo el cual le ponemos el nombre de la clase 
    public Conexion() {
        conn = null;
        try {
            Class.forName(driver);
            //parametros DriverMaager
            conn = DriverManager.getConnection(url, user, password);
            if (conn == null) {
                System.out.println("No se establecio conexió"+url);
                
            } else {
                System.out.println("Conexión establecida ok");
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    
    public Connection getConn() {
        return conn;
    }
    
    public void CerrarConexion() throws SQLException {
        if (conn != null) {
            conn.close();
        };
    }
    
    
}

