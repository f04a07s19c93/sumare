/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivo_texto;

/**
 *
 * @author rolfi.gomes
 */
import java.io.*;   

public class Arquivo_Texto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       criarDocumento();
       lerDocumento();
       
    
        
    }
    public static void lerDocumento()
    {
        try{
             String caminho=
         "C://Users//rolfi.gomes//Documents//";
         caminho=caminho + "teste.txt";
            File file=new File(caminho);
            FileReader ler=new FileReader(file);
            
            BufferedReader leitor = 
             new BufferedReader(ler); 
            
            String linha="";//leitor.readLine(); 
            //System.out.println(linha);
            int contador=0;
            while( (linha=leitor.readLine()) !=null)
            { 
               
                String nome,idade,sexo,email;
           
            // RETORNA O VALOR DO CARACTER
            //System.out.println( linha.indexOf("Masculino"));
            // RETORNA OS CARACTERES DO INTERVALO
           // System.out.println(linha.substring(2,5));
            
            nome = linha.substring(0, linha.indexOf("#"));
            System.out.println("Código:"+(contador++));
            
            System.out.println("Nome:"+nome);
            idade = linha.substring(
                    linha.indexOf("#")+1,
                    linha.indexOf("(")
                    );
            System.out.println("Idade:"+ idade);
            sexo = linha.substring( linha.indexOf("(")+1,
                    linha.indexOf(")"));
            System.out.println("Sexo:"+ sexo);
            email= linha.substring( linha.indexOf(")")+1,
                    linha.length());
            System.out.println("Email:"+email);
               
                 
            }
            
            
            //SPLIT - QUEBRA COM MESMO SÍMBOLO
            //String dados[]=new String[4];
            //dados = linha.split("#");
            //System.out.println("Nome:"+dados[0]);
            //System.out.println("Idade:"+dados[1]);
            //System.out.println("Sexo:"+dados[2]);
            //System.out.println("Email:"+dados[3]);
            
            ler.close();
            
        }catch(Exception e)
        {
            System.out.println("Erro:"+e);
        }
        
    }
    
    
    public static void criarDocumento()
    {
         try{
            FileWriter arq ;
            String caminho= "C://Users//rolfi.gomes//Documents//";
            caminho=caminho + "teste.txt";
            arq= new FileWriter(caminho,true);
            
            arq.write("\nJosé#");
            arq.write("18(");
            arq.write("Masculino)");
            arq.write("teste@teste.com.br");
            
            arq.close();
        
        }catch(Exception e)
        {
            System.out.println("Erro:"+e);
        }
    }
}

/*  
    javax.swing.JFileChooser chooser = new javax.swing.JFileChooser();    
     if(chooser.showOpenDialog(null) ==
            javax.swing.JFileChooser.APPROVE_OPTION) 
       System.out.println("aberto:"+ chooser.getSelectedFile().getName());
 */
