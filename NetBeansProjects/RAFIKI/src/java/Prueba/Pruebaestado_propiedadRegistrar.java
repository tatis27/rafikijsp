
package Prueba;

import controlador.estado_propiedadDAO;
import java.util.Scanner;
import modelo.estado_propiedad;


public class Pruebaestado_propiedadRegistrar {
    
    public static void main(String[] args) {
        estado_propiedadDAO estado_propiedadDAO = new estado_propiedadDAO();
        estado_propiedad misestado_propiedad = new estado_propiedad();
        
        Scanner Leer = new Scanner (System.in);
        
        String tipoestado_propiedad = "";
        
        System.out.println("Por favor digite el Estado de la Propiedad");
        tipoestado_propiedad = Leer.next();
        
        misestado_propiedad.setTipoestado_propiedad(tipoestado_propiedad);
        
        String respuesta = estado_propiedadDAO.adicionarestado_propiedad (misestado_propiedad);
        
        if (respuesta.length()== 0) {
            System.out.println("registrado");
        } else {
            System.out.println("Error" + respuesta);
        }
    }
    
}
