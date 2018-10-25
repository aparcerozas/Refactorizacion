/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5;

/**
 *
 * @author aparcerozas
 */
public class Boletin5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta cuentaABanca = new Cuenta("Pedro", "1234", 500);
        Cuenta cuentaSantander = new Cuenta("Marta", "5678", 420);
        cuentaABanca.visualizar();
        cuentaSantander.visualizar();
        cuentaABanca.ingreso(-30);
        cuentaSantander.reintegro(20);
        System.out.println(cuentaABanca.getSaldo());
        System.out.println(cuentaSantander.getSaldo());
        cuentaABanca.transferencia(cuentaSantander, 50);
        System.out.println(cuentaABanca.getSaldo());
        System.out.println(cuentaSantander.getSaldo());
    }
    
}
