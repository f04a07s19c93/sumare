/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatofhall;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author TRISTAO
 */
public class Servidor {
      List<PrintWriter> escritores = new ArrayList<>();
      
      public Servidor() throws IOException{
             ServerSocket server = new ServerSocket(5000);
        Scanner leitor;
        //
        while (true) {

            Socket socket = server.accept();
            new Thread(new EscutaCliente(socket)).start();
            PrintWriter p = new PrintWriter(socket.getOutputStream());
            escritores.add(p);
        }
      }
      private class EscutaCliente implements Runnable {

        Scanner leitor;

        public EscutaCliente(Socket socket) {
            try {
                leitor = new Scanner(socket.getInputStream());
            } catch (Exception e) {
            }
        }

        @Override
        public void run() {
            try {
                String texto;
                while ((texto = leitor.nextLine()) != null) {
                    System.out.println(texto);
                    EncaminharParaTodos(texto);
                }
            } catch (Exception e) {
            }
        }

    }
    
      //-------------
          private void EncaminharParaTodos(String texto) {
        
            for (PrintWriter w : escritores) {
                try {
                w.println(texto);
                w.flush();
                } catch (Exception e) {}
            }
    }
      
      
     public static void main(String[] args) throws IOException {
        new Servidor();

    }
}
