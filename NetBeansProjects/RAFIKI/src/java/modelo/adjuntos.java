/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author tatianagomez
 */
public class adjuntos {
    
    private int idadjuntos;
    private String tipo_archivo;
    private String ruta_archivo;
    private String descripcion;
    private int idpropiedades;

    public int getIdadjuntos() {
        return idadjuntos;
    }

    public void setIdadjuntos(int idadjuntos) {
        this.idadjuntos = idadjuntos;
    }

    public String getTipo_archivo() {
        return tipo_archivo;
    }

    public void setTipo_archivo(String tipo_archivo) {
        this.tipo_archivo = tipo_archivo;
    }

    public String getRuta_archivo() {
        return ruta_archivo;
    }

    public void setRuta_archivo(String ruta_archivo) {
        this.ruta_archivo = ruta_archivo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdpropiedades() {
        return idpropiedades;
    }

    public void setIdpropiedades(int idpropiedades) {
        this.idpropiedades = idpropiedades;
    }
}
