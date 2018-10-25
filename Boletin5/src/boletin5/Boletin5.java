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
        Conta conta1 = new Conta("Pedro", "1234", 500);
        Conta conta2 = new Conta("Marta", "5678", 420);
        conta1.visualizar();
        conta2.visualizar();
        conta1.ingreso(-30);
        conta2.reintegro(20);
        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());
        conta1.transferencia(conta2, 50);
        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());
    }
    
}
