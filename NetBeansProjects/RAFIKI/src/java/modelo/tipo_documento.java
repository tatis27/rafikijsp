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
public class tipo_documento {
    
    private int idtipodocumento;
    private String tipodocumento;
    
    public int getIddocumento(){
        return idtipodocumento;
    }
    public void setIddocumento(int idtipodocumento){
        this.idtipodocumento = idtipodocumento;
    } 
        public String getTipodocumento(){
        return tipodocumento;
    }
    public void setTipodocumento(String documento){
        this.tipodocumento = documento;
    }
}

