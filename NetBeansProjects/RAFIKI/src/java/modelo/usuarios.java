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
public class usuarios {
    private int idusuarios;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String email;
    private String contraseña;
    private int cedula;
    private int idtipodocumento;
    private int idroles;
    
    public int getIdusuarios(){
        return idusuarios;
    }
    public void setIdusuarios(int idusuarios){
        this.idusuarios = idusuarios;
    }
    
    public String getNombres () {
        return nombres;
    }
        
    public void setNombres (String nombres){
        this.nombres = nombres;
    }
    
    public String getApellidos () {
        return apellidos;
    }
        
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    
    public String getTelefono () {
        return telefono;
    }
        
    public void setTelefono (String telefono){
        this.telefono = telefono;
    }
    
    public String getEmail () {
        return email;
    }
        
    public void setEmail (String email){
        this.email = email;
    }
    
    public String getContraseña () {
        return contraseña;
    }
        
    public void setContraseña (String contraseña){
        this.contraseña = contraseña;
    }
    
        public int getCedula(){
        return cedula;
    }
    public void setCedula(int cedula){
        this.cedula = cedula;
    }
    
        public int getIdtipodocumento(){
        return idtipodocumento;
    }
    public void setIdtipodocumento(int idtipodocumento){
        this.idtipodocumento = idtipodocumento;
    }
    
        public int getIdroles(){
        return idroles;
    }
    public void setIdroles(int idroles){
        this.idroles = idroles;
    }
}

