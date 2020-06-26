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
public class reservas {
    
    private int idreservas;
    private String fecha_inicio;
    private String fecha_final;
    private String fecha_estadoreserva;
    private int idusuarios;
    private int idestado_reserva;
    private int idpropiedades;

    public int getIdreservas() {
        return idreservas;
    }

    public void setIdreservas(int idreservas) {
        this.idreservas = idreservas;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_final() {
        return fecha_final;
    }

    public void setFecha_final(String fecha_final) {
        this.fecha_final = fecha_final;
    }

    public String getFecha_estadoreserva() {
        return fecha_estadoreserva;
    }

    public void setFecha_estadoreserva(String fecha_estadoreserva) {
        this.fecha_estadoreserva = fecha_estadoreserva;
    }

    public int getIdusuarios() {
        return idusuarios;
    }

    public void setIdusuarios(int idusuarios) {
        this.idusuarios = idusuarios;
    }

    public int getIdestado_reserva() {
        return idestado_reserva;
    }

    public void setIdestado_reserva(int idestado_reserva) {
        this.idestado_reserva = idestado_reserva;
    }

    public int getIdpropiedades() {
        return idpropiedades;
    }

    public void setIdpropiedades(int idpropiedades) {
        this.idpropiedades = idpropiedades;
    }
    
}
