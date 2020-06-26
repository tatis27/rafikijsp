
package Prueba;

import controlador.ubicacionDAO;
import java.util.Scanner;
import modelo.ubicacion;

public class PruebaubicacionActualizar {
    
    public static void main(String[] args) {
    // modificar 
        ubicacionDAO ubicacionDAO = new ubicacionDAO();
        ubicacion misubicacion = new ubicacion();
        
        Scanner Leer = new Scanner(System.in);
        
        String departamento = "";
        String municipio = "";
        
        System.out.println("Por favor actualice el Departamento");
        departamento = Leer.nextLine();
        misubicacion.setDepartamento(departamento);
        
        System.out.println("Por favor actualice el Municipio");
        municipio = Leer.next();
        misubicacion.setMunicipio(municipio);
        
        
        misubicacion.setIdubicacion(123);
        
        String respuesta = ubicacionDAO.actualizarubicacion(misubicacion);
        
        if (respuesta.length() == 0) {
            System.out.println("Información Actualizada");
        } else {
            System.out.println("Error" + respuesta);
        }
    }
    
}
