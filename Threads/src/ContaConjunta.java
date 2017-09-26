/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRISTAO
 */
public class ContaConjunta {
    private int saldo =100;

    /**
     * @return the saldo
     */
    public int getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public synchronized void sacar(int valor,String cliente) throws InterruptedException {
        
        if(saldo>=valor){
        int saldoOriginal = saldo;
            System.out.println(cliente+" vai sacar");
            System.out.println("Esperando sacar...");
             Thread.sleep(1000);   
            saldo-=valor;  
            String msg= cliente +" SACOU "+valor+" [Saldo original="+saldoOriginal+",Saldo Final ="+saldo+"]";
                    
            System.out.println(msg);
        }else{
            System.out.println("Saldo insuficiente para o "+cliente);
        }
        
    }
    
   
}
