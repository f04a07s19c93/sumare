/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refinado;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.animation.Animation;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author TRISTAO
 */
public class Aninhamento extends JFrame{
    JButton botao;
    
    public Aninhamento(){
    super("Anhinhamento");
    
   
    botao = new JButton("Ok");
    botao.addActionListener(new ListenerAninhado());  //classe aninhada
     botao.addActionListener(new ActionListener() {//classe anonima
        @Override
        public void actionPerformed(ActionEvent ae) {
           System.out.println("Classe anônima processa "+botao.getText());
        }
    }); 
      getContentPane().add(botao);      
    
    
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }
    
    
    
    //classe aninhada
    public class ListenerAninhado implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("Classe aninhada processa "+botao.getText());
        }
        
    }
    
    public static void main(String[] args) {
        Aninhamento janela = new Aninhamento();
        Aninhamento.ListenerAninhado listenter = janela.new ListenerAninhado();//classe envolvente
    }
    
}
