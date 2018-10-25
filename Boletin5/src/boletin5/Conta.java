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
public class Conta {
    //Atributos
    private String nome;
    private String numero;
    private double saldo;
    //Constructores
    public Conta(){}
    public Conta(String nome, String numero, double saldo){
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
    }
    //Getters y setters
    public String getNome(){
        return nome;
    }
    public String getNumero(){
        return numero;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    //Método ingreso
    public boolean ingreso(double x){
        boolean comprobar;
        if(x>=0){
            saldo += x;
            comprobar = true;
        }
        else{
            System.out.println("Cantidad errónea");
            comprobar = false;
        }
        return comprobar;
    }
    //Método reintegro
    public boolean reintegro(double x){
        boolean comprobar;
        if(x>=0){
            saldo -= x;
            comprobar = true;
        }
        else{
            System.out.println("Cantidad errónea");
            comprobar = false;
        }
        return comprobar;
    }
    //Método visualizar
    public void visualizar(){
        System.out.println("Nome: " + nome + "\nNúmero: " + numero 
                + "\nSaldo: " + saldo);
    }
    //Método transferencia
    public void transferencia(Conta c, double x){
        if(this.saldo >= x){
            this.saldo -= x;
            c.saldo += x;
        }
        else{
            System.out.println("La cuenta no posee dinero suficiente"
                    + " para la transferencia");
        }
    }
}
