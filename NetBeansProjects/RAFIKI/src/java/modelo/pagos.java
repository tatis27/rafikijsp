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
public class pagos {
    
    private int idpagos;
    private int valor;
    private String fecha_transferencia;
    private int numero_transferencia;
    private String descripcion;
    private int idreservas;
    private int idestado_pago;

    public int getIdpagos() {
        return idpagos;
    }

    public void setIdpagos(int idpagos) {
        this.idpagos = idpagos;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getFecha_transferencia() {
        return fecha_transferencia;
    }

    public void setFecha_transferencia(String fecha_transferencia) {
        this.fecha_transferencia = fecha_transferencia;
    }

    public int getNumero_transferencia() {
        return numero_transferencia;
    }

    public void setNumero_transferencia(int numero_transferencia) {
        this.numero_transferencia = numero_transferencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdreservas() {
        return idreservas;
    }

    public void setIdreservas(int idreservas) {
        this.idreservas = idreservas;
    }

    public int getIdestado_pago() {
        return idestado_pago;
    }

    public void setIdestado_pago(int idestado_pago) {
        this.idestado_pago = idestado_pago;
    }
    
}
