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
public class ExemploStatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno delegado = new Alumno("Pedro", 7.5f);
        delegado.mostrarDatos();
        delegado.setDireccion("123456789", "pedro@gmail.com");
        delegado.mostrarDatos();
    }
    
}
