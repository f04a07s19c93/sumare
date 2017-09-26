/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package projeto_integrado_pfl;

import java.util.Scanner;

public class AulaVetor {

    public int idade[];
    
    AulaVetor(){
        idade=new int[10];
    }
        
    
    public  void imprimir()
    {
       
        for(int i=0; i < idade.length ; i++)
            System.out.println(idade[i]);
    }
    
    
    public  void ordenar()
    {
        for(int i=0; i < idade.length ; i++)
        for(int j=i+1; j < idade.length ; j++)
        {
            if(idade[i]> idade[j])
            {
                int aux=idade[i];
                idade[i]=idade[j];
                idade[j]=aux;
             }
        }
    }
    
    public  void setvetor()
    {
         Scanner leitura=new Scanner(System.in);
         
          for(int i=0; i < idade.length ; i++)
           {   
               System.out.println("Digite a "+(i+1)+"º idade");
               idade[i]=leitura.nextInt();
           }
        
    }
    
        
    public void setPosicao()
    {
        Scanner leitura=new Scanner(System.in);
        System.out.println("Digite a posição do vetor entre 0 e 9");
        int posicao= leitura.nextInt();
        
        System.out.println("Digite o valor da posição");
        int valor=leitura.nextInt();
        
        idade[posicao]=valor;
    }
    
    
    public void setDeletar()
    {
        Scanner leitura=new Scanner(System.in);
        System.out.println("Digite a posição do vetor entre 0 e 9");
        int posicao= leitura.nextInt();
        
        idade[posicao]=0;
    }
    
    
    
}
