
package Prueba;

import controlador.estado_propiedadDAO;
import java.util.Scanner;
import modelo.estado_propiedad;

public class Pruebaestado_propiedadActualizar {
    
    public static void main(String[] args) {
    // modificar 
        estado_propiedadDAO estado_propiedadDAO = new estado_propiedadDAO();
        estado_propiedad misestado_propiedad = new estado_propiedad();
        
        Scanner Leer = new Scanner(System.in);
        
        String tipoestado_propiedad ="";
        
        System.out.println("Por favor corriga el tipo de estado de propiedad");
        tipoestado_propiedad = Leer.nextLine();
        misestado_propiedad.setTipoestado_propiedad(tipoestado_propiedad);
        
        misestado_propiedad.setIdestado_propiedad(5);
        
        String respuesta = estado_propiedadDAO.actualizarestado_propiedad(misestado_propiedad);
        
        if (respuesta.length() == 0) {
            System.out.println("Información Actualizada");
        } else {
            System.out.println("Error" + respuesta);
        }
    }
    
}