
package Prueba;

import controlador.actividades_adicionalesDAO;
import java.util.Scanner;
import modelo.actividades_adicionales;


public class Pruebaactividades_adicionalesRegistrar {
    
    public static void main(String[] args) {
        actividades_adicionalesDAO actividades_adicionalesDAO = new actividades_adicionalesDAO();
        actividades_adicionales misactividades_adicionales = new actividades_adicionales();
        
        Scanner Leer = new Scanner (System.in);
        
        String nombre = "";
       
        
        System.out.println("Por favor digite el nombre de la actividad");
        nombre = Leer.next();
         
        misactividades_adicionales.setNombre(nombre);
        misactividades_adicionales.setIdubicacion(4);
        
        String respuesta = actividades_adicionalesDAO.adicionaractividades_adicionales (misactividades_adicionales);
        
        if (respuesta.length()== 0) {
            System.out.println("registrado");
        } else {
            System.out.println("Error" + respuesta);
        }
    }
    
}
