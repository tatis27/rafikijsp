
package Prueba;

import controlador.propiedadesDAO;
import java.util.Scanner;
import modelo.propiedades;

public class PruebapropiedadesActualizar {
    
    public static void main(String[] args) {
    // modificar 
        propiedadesDAO propiedadesDAO = new propiedadesDAO();
        propiedades mispropiedades = new propiedades();
        
        Scanner Leer = new Scanner(System.in);
        
        String nombre ="";
        String direccion ="";
        int valor_alojamiento = 0;
        int numero_personas = 0;
        int numero_baños = 0;
        int numero_habitaciones = 0;
        int cocina = 0;
        int aire_acondicionado = 0;
        int piscina = 0;
        int numero_estacionamiento = 0;

        System.out.println("Por favor corregir el nombre");
        nombre = Leer.nextLine();
        System.out.println("Por favor corregir la direccion");
        direccion = Leer.nextLine();
        System.out.println("Por favor corregir el valor de alojamiento");
        valor_alojamiento = Leer.nextInt();
        System.out.println("Por favor corregir el número de personas");
        numero_personas = Leer.nextInt();
        System.out.println("Por favor corregir el número de baños");
        numero_baños = Leer.nextInt();
        System.out.println("Por favor corregir el número de habitaciones");
        numero_habitaciones = Leer.nextInt();
        System.out.println("Por favor corregir 1 si la propiedad tiene cocina o 0 si no tiene ");
        cocina = Leer.nextInt();
        System.out.println("Por favor corregir 1 si la propiedad tiene aire acondicionado o 0 si no tiene");
        aire_acondicionado = Leer.nextInt();
        System.out.println("Por favor corregir 1 si la propiedad tiene piscina o 0 si no tiene");
        piscina = Leer.nextInt();
        System.out.println("Por favor corregir el numero de estacionamientos");
        numero_estacionamiento = Leer.nextInt();

        mispropiedades.setNombre(nombre);
        mispropiedades.setDireccion(direccion);
        mispropiedades.setValor_alojamiento(valor_alojamiento);
        mispropiedades.setNumero_personas(numero_personas);
        mispropiedades.setNumero_baños(numero_baños);
        mispropiedades.setNumero_habitaciones(numero_habitaciones);
        mispropiedades.setCocina(cocina);
        mispropiedades.setAire_acondicionado(aire_acondicionado);
        mispropiedades.setPiscina(piscina);
        mispropiedades.setNumero_estacionamiento(numero_estacionamiento);
        
        mispropiedades.setIdusuarios(1);
        mispropiedades.setIdtipo_alojamiento(1);
        mispropiedades.setIdestado_propiedad(1);
        mispropiedades.setIdubicacion(1);
        mispropiedades.setIdpropiedades(2);

        
        String respuesta = propiedadesDAO.actualizarpropiedades(mispropiedades);
        
        if (respuesta.length() == 0) {
            System.out.println("Información Actualizada");
        } else {
            System.out.println("Error" + respuesta);
        }
    }
    
}


