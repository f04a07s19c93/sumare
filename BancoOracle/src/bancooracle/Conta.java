/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancooracle;

/**
 *
 * @author TRISTAO
 */
public class Conta {
    int numero;
    String cliente;
    double saldo;
    public Conta(int numero, String cliente, double saldo){
        this.numero=numero;
        this.cliente= cliente;
        this.saldo=saldo;
    }
    public String toString(){
        return numero+","+cliente+","+saldo;
    }
}
