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
public class Alumno {
    private String nombre;
    private float nota;
    public static int numeroPreferencia;
    private Direccion dir = new Direccion("", "");
    
    public Alumno(){
    }
    public Alumno(String nome, float nota){
        this.nombre = nome;
        this.nota = nota;
    }
    
    public void setDireccion(String telefono, String email){
        dir.setTelefono(telefono);
        dir.setEmail(email);
    }
    public String getNome(){
        return nombre;
    }
    public float getNota(){
        return nota;
    }
    public String getTelefono(){
        return dir.getTelefono();
    }
    public String getEmail(){
        return dir.getEmail();
    }
    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre + "\nNota: " + nota 
                + "\nTeléfono: " + dir.getTelefono() + "\nEmail: " 
                + dir.getEmail());
    }
}
