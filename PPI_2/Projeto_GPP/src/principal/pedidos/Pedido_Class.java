package principal.pedidos;

import insercao.BD_tratamentos;
import insercao.Control;
import java.awt.Label;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class Pedido_Class {
   

    
    BD_tratamentos busca_banco = new BD_tratamentos();
   Pedido_balcao teste =  new Pedido_balcao();
   ArrayList<String> dadosPedido =  new ArrayList<String>();

    int cod_produto;
    int quant;
    String nome_Produto;
    String nome, endereco, telefone;
    String tipo_pag;
    double valor_total;
    String tamanho = null;
    String hora;
    String data;
    String usuario;
    
    public  String nome_produto(String x){//metodo para dar nome apartir do codigo
        
      String nome = null;
        switch (x){   
            
           case "1":
               nome = "P. Calabresa";  
               
               
           break;
              
           case "2":
             nome = "P. Queijo"; 
                
           break;
            
           case "3":
            nome = "P. Frango"; 
                
           break;
                
           case "4":
            
                nome = "P. Carne"; 
           break; 
                
           case "5":
            
                nome = "P. Portuguesa";
           break;
               
           case "6":
            
                nome = "P. Baiana";
            break; 
               
           case "7":
            
                nome = "Napolitana";
            break;  
               
           case "8":
            
                nome = "Coca Cola";
            break; 
                    
            case "9":
            
                nome = "Guarana";
            break; 
          
               
               
               
            default:
                JOptionPane.showMessageDialog(null, "PRODUTO NAO CADASTRADO!");
             break;   
     
    }
   this.nome_Produto = nome;
    return nome; 

    }
    

    
    public String calcula_Pizza(String cod, String quant, String tamanho){//metodo para calcular o preço
    double result= 0;
   
    
     int quantidade = Integer.parseInt(quant);
     
    switch (cod){
        
            case "1"://
               result = 25 * quantidade ;  
               
               
           break;
              
           case "2"://queijo
             result = 25 * quantidade ;  
                
           break;
            
           case "3":
            result = 25 * quantidade ;   
                
           break;
                
           case "4":
            
               result = 25 * quantidade ;  
           break; 
                
           case "5":
            
                result = 30 * quantidade ;  
           break;
               
           case "6":
            
               result = 30 * quantidade ;  
            break; 
               
           case "7":
            
             result = 25 * quantidade ;  
            break;
               
           case "8":
            
             result = 7 * quantidade ;  
            break;

           case "9":
            
             result = 6 * quantidade ;  
            break;
     
    }
    switch(tamanho){
        
        case "P":
        result = (result/2)-1;
        break;
            
        case "Med":
        result= result;
        break;
            
        case "G":
        result = result+ 5;
        break;   
        
        case "Meio":    
        result = (result/2)+1; 
        break;    
    }

    this.valor_total =+ result;
    return result+"";
    
    }
    
    public void ProdutoVendido(String id_venda, String id_produto,String tamanho,String quant, String valor) throws Exception{
    
        try{
        BD_tratamentos.conecta();
        ArrayList<String> venda_id = new ArrayList<String>(); 
            venda_id.add(id_venda);
        ArrayList<String> produto_id =  new ArrayList<String>();
            produto_id.add(id_produto);
        ArrayList<String> tmnho =  new ArrayList<String>();
            tmnho.add(tamanho);
        ArrayList<String> qunt =  new ArrayList<String>();
            qunt.add(quant);
        ArrayList<String> vlor =  new ArrayList<String>();
            vlor.add(valor);
         
       BD_tratamentos.produtoVendido(id_venda.toString(), id_produto.toString(), tamanho.toString(), quant.toString(), valor.toString());
      }catch(Exception e){
    JOptionPane.showMessageDialog(null,"erro na classe pedido_classe!!!");
           }
     
     }
    
   
    
    
    
   /* 
    public String calcula_Bebida(String cod, String quant, String tamanho){
        double result= 0;
        int quantidade = Integer.parseInt(quant);
          switch (cod){
              case "8":
              result = 6 * quantidade;
              break;
              case "9":
              result= 5 * quantidade;
              break;    
          }
          
          switch(tamanho){
        
        case "P":
        result =result-2;
        break;
            
        case "Med":
        result= result;
        break;
            
        case "G":
        result = result+5;
        break;   
        
        case "Meio":    
        result = result-1; 
        break;    
    }

    this.valor_total =+ result;
    return result+"";
          
        
    
    }*/
    
   
   
  
    
    
    public ArrayList<String> pedidosJanela(JTable x){//metodo para inserir na tabela
        
           int indiceLinha = x.getSelectedRow();
   for(int i=0;i<x.getRowCount();i=+5){
        
            dadosPedido.add("Codigo produto: "+x.getValueAt(indiceLinha, i).toString()
                    +" Produto: "+x.getValueAt(indiceLinha, i+1).toString()
                    +" Quant: "+x.getValueAt(indiceLinha, i+2).toString()
                    +" Preço: "+x.getValueAt(indiceLinha, i+3).toString()        
                    +" Obs: "+x.getValueAt(indiceLinha, i+4).toString()
                            );
         
   }
   return dadosPedido;
    }
    
   

    
    
}

    
    
   
    
    
       
    

    

    
