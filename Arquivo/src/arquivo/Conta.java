/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivo;

/**
 *
 * @author TRISTAO
 */
public class Conta  implements java.io.Serializable{
    
    
    private String cliente;
 /* transient */ private double saldo;//vai impedir a serialização do 
    public Conta(){} 
   
    public Conta(String cliente, double  saldo){
        this.cliente = cliente;
        this.saldo = saldo;
    }
    
    
   public void exibeSaldo(){
        
        System.out.println(cliente+ " seu saldo é de R$"+getSaldo());
    }
    void saca (double valor){       
        setSaldo(getSaldo() - valor);
    }
   public  void deposita(double valor){
        setSaldo(getSaldo() + valor);
        
    }
    public void transferePara(Conta destino, double valor){
        
        this.saca(valor);
        destino.deposita(valor);
    }

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
