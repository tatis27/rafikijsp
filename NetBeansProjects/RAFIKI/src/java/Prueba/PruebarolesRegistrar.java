
package Prueba;

import controlador.rolesDAO;
import java.util.Scanner;
import modelo.roles;


public class PruebarolesRegistrar {
    
    public static void main(String[] args) {
        rolesDAO rolesDAO = new rolesDAO();
        roles misroles = new roles();
        
        Scanner Leer = new Scanner (System.in);
        
        String nombre = "";
        
        System.out.println("Por favor digite el rol");
        nombre = Leer.next();
        
        misroles.setNombre(nombre);
        
        String respuesta = rolesDAO.adicionarroles (misroles);
        
        if (respuesta.length()== 0) {
            System.out.println("registrado");
        } else {
            System.out.println("Error" + respuesta);
        }
    }
    
}
