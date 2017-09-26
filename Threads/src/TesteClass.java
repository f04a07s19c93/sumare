/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRISTAO
 */
public class TesteClass {

    private int litros = 1_000;

    /**
     * @return the litros
     */
    public int getLitros() {
        return litros;
    }
    
     public void setLitros(int litros) {
        this.litros = litros;
    }
    

    /**
     * @param litros the litros to set
     */
    public synchronized void beber(int quantidade, String pessoa) throws InterruptedException {
     int encherGarrafa=1;
        if (litros >= quantidade) {
            int litrosOriginal = litros;
            System.out.println(" -" + pessoa + " Vai beber");
            System.out.println("Enchendo o copo...");
            Thread.sleep(1000);
            litros -= quantidade;
            String msg = pessoa + " bebeu " + quantidade + "ml [Quantidade antes=" + litrosOriginal + "ml,Quantidade Final =" + litros + "ml]";

            System.out.println(msg);
        } else {
            System.out.println("O vinho acabou para o " + pessoa);
    
        }
           
            /*
                      if(litros<50){  
                          System.err.println("Dono Colocou mais 200ml pela"+encherGarrafa+"° vez.");
                   litros=litros+200;
                   encherGarrafa++;
                }
                */

    }

}
