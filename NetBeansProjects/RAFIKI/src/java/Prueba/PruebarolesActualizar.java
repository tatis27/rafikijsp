
package Prueba;

import controlador.rolesDAO;
import java.util.Scanner;
import modelo.roles;

public class PruebarolesActualizar {
    
    public static void main(String[] args) {
    // modificar 
        rolesDAO rolesDAO = new rolesDAO();
        roles misroles = new roles();
        
        Scanner Leer = new Scanner(System.in);
        
        String nombre ="";
        
        System.out.println("Por favor corriga el rol");
        nombre = Leer.nextLine();
        misroles.setNombre(nombre);
        
        misroles.setIdroles(5);
        
        String respuesta = rolesDAO.actualizarroles(misroles);
        
        if (respuesta.length() == 0) {
            System.out.println("Información Actualizada");
        } else {
            System.out.println("Error" + respuesta);
        }
    }
    
}
