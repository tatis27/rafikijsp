
package Prueba;

import controlador.ubicacionDAO;
import java.util.Scanner;
import modelo.ubicacion;


public class PruebaubicacionRegistrar {
    
    public static void main(String[] args) {
        ubicacionDAO ubicacionDAO = new ubicacionDAO();
        ubicacion misubicacion = new ubicacion();
        
        Scanner Leer = new Scanner (System.in);
        
        String departamento = "";
        String municipio = "";
        
        System.out.println("Por favor digite la Departamento");
        departamento = Leer.next();
        
        System.out.println("por favor digite el Municipio");
        municipio = Leer.next();
        
        misubicacion.setDepartamento(departamento);
        misubicacion.setMunicipio(municipio);
        
        String respuesta = ubicacionDAO.adicionarubicacion (misubicacion);
        
        if (respuesta.length()== 0) {
            System.out.println("registrado");
        } else {
            System.out.println("Error" + respuesta);
        }
    }
    
}