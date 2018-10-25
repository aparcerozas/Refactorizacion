/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplostatic;

/**
 *
 * @author aparcerozas
 */
public class Direccion {
    private String telefono;
    private String email;
    
    public Direccion(){}
    public Direccion(String telefono, String email){
        this.telefono = telefono;
        this.email = email;
    }
    
    public String getTelefono(){
        return telefono;
    }
    public String getEmail(){
        return email;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public void setEmail(String email){
        this.email = email;
    }
}
