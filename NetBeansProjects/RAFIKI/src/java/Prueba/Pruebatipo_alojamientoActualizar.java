
package Prueba;

import controlador.tipo_alojamientoDAO;
import java.util.Scanner;
import modelo.tipo_alojamiento;

public class Pruebatipo_alojamientoActualizar {
    
    public static void main(String[] args) {
    // modificar 
        tipo_alojamientoDAO tipo_alojamientoDAO = new tipo_alojamientoDAO();
        tipo_alojamiento mistipo_alojamiento = new tipo_alojamiento();
        
        Scanner Leer = new Scanner(System.in);
        
        String tipo_alojamiento ="";
        
        System.out.println("Por favor corregir el Tipo de Alojamiento");
        tipo_alojamiento = Leer.nextLine();
        mistipo_alojamiento.setTipo_alojamiento(tipo_alojamiento);
        
        mistipo_alojamiento.setIdtipo_alojamiento(4);
        
        String respuesta = tipo_alojamientoDAO.actualizartipo_alojamiento(mistipo_alojamiento);
        
        if (respuesta.length() == 0) {
            System.out.println("Información Actualizada");
        } else {
            System.out.println("Error" + respuesta);
        }
    }
    
}

