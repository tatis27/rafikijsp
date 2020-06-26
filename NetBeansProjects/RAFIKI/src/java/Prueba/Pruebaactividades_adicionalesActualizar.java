
package Prueba;

import controlador.actividades_adicionalesDAO;
import java.util.Scanner;
import modelo.actividades_adicionales;

public class Pruebaactividades_adicionalesActualizar {
    
    public static void main(String[] args) {
    // modificar 
        actividades_adicionalesDAO actividades_adicionalesDAO = new actividades_adicionalesDAO();
        actividades_adicionales misactividades_adicionales = new actividades_adicionales();
        
        Scanner Leer = new Scanner(System.in);
        
        String nombre ="";
        
        System.out.println("Por favor corregir la actividad adicional");
        nombre = Leer.nextLine();
       
        misactividades_adicionales.setNombre(nombre);
        misactividades_adicionales.setIdubicacion(4);
        misactividades_adicionales.setIdactividades_adicionales(5);
        
        String respuesta = actividades_adicionalesDAO.actualizaractividades_adicionales(misactividades_adicionales);
        
        if (respuesta.length() == 0) {
            System.out.println("Información Actualizada");
        } else {
            System.out.println("Error" + respuesta);
        }
    }
    
}


