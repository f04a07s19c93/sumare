
package javaapplication1;

public class AtividadeP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista lista = new Lista();  
        Fila fila =new Fila();
        Pilha pilha = new Pilha();
        
        
       
     System.out.println("FILA");
        fila.inserir(0);
        fila.inserir(3);
        fila.inserir(66);
        fila.inserir(-6);
        fila.inserir(7);
        fila.inserir(8);
        fila.inserir(11);
        fila.inserir(72);
        fila.inserir(49);
        fila.inserir(40);    
           System.out.println(fila.imprimir());
           System.out.println("FILA. menor = "+fila.menorFila());
           System.out.println("FILA. maior = "+ fila.maiorFila());
           System.out.println("FILA. Media = "+ fila.media());
        //-------------------
       
     System.out.println("PILHA");         
        pilha.inserir(10);
        pilha.inserir(30);
        pilha.inserir(4);
        pilha.inserir(-1);
        pilha.inserir(5);
        pilha.inserir(7);
        pilha.inserir(9);
        pilha.inserir(10);
        pilha.inserir(15);
        pilha.inserir(17);
           System.out.println(pilha.imprimir()) ;
           System.out.println("PILHA. menor = "+pilha.menorPilha());
           System.out.println("PILHA. maior = "+ pilha.maiorPilha());
           System.out.println("PILHA. media = "+pilha.media());
           //--------------------------
        
    System.out.println("LISTA");     
        lista.insereList(-3);
        lista.insereList(6); 
        lista.insereList(5);
        lista.insereList(10);
        lista.insereList(-7);
        lista.insereList(8);
        lista.insereList(9);
        lista.insereList(6);
        lista.insereList(33);
        lista.insereList(40);
          System.out.println(lista.imprimeList()); 
          System.out.println("LISTA. menor = "+lista.menorList());
          System.out.println("LISTA. maior = "+lista.maiorList());
          System.out.println("LISTA. media = "+lista.media());
    }
    
}
