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
    private String nome;
    private float nota;
    public static int numPreferencia;
    private Direccion dir = new Direccion("", "");
    
    public Alumno(){
        this.dir = dir;
    }
    public Alumno(String nome, float nota){
        this.nome = nome;
        this.nota = nota;
        this.dir = dir;
    }
    
    public void setDireccion(String telefono, String email){
        this.dir.setTelefono(telefono);
        this.dir.setEmail(email);
    }
    public String getNome(){
        return nome;
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
    public void Datos(){
        System.out.println("Nome: " + nome + "\nNota: " + nota 
                + "\nTeléfono: " + dir.getTelefono() + "\nEmail: " 
                + dir.getEmail());
    }
}
