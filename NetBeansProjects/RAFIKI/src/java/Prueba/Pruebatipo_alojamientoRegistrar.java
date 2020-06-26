
package Prueba;

import controlador.tipo_alojamientoDAO;
import java.util.Scanner;
import modelo.tipo_alojamiento;


public class Pruebatipo_alojamientoRegistrar {
    
    public static void main(String[] args) {
        tipo_alojamientoDAO tipo_alojamientoDAO = new tipo_alojamientoDAO();
        tipo_alojamiento mistipo_alojamiento = new tipo_alojamiento();
        
        Scanner Leer = new Scanner (System.in);
        
        String tipo_alojamiento = "";
        
        System.out.println("Por favor digite el tipo de alojamiento");
        tipo_alojamiento = Leer.next();
        
        mistipo_alojamiento.setTipo_alojamiento(tipo_alojamiento);
        
        String respuesta = tipo_alojamientoDAO.adicionartipo_alojamiento (mistipo_alojamiento);
        
        if (respuesta.length()== 0) {
            System.out.println("registrado");
        } else {
            System.out.println("Error" + respuesta);
        }
    }
    
}
