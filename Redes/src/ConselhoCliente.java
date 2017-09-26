
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRISTAO
 */
public class ConselhoCliente {
    
    public static void main(String[] args) throws Exception {
        //65_535 mil portas disponiveis
        //as portas 0 a 1023 nao devem ser usadas, pois são reservados para serviços como internet, email, ftp e etc...
        Socket socket = new Socket("192.168.1.103",5000); 
        Scanner s = new Scanner(socket.getInputStream());
        System.out.println("Mensagem: "+s.nextLine());
        s.close();
    }
}
