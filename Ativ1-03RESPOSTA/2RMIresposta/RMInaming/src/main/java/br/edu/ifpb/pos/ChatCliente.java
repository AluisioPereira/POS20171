/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.util.Scanner;

/**
 *
 * @author ajp
 */
public class ChatCliente {

    public static void main(String[] argv) {
        try {
            System.setSecurityManager(new RMISecurityManager());
            Scanner s = new Scanner(System.in);
            System.out.println("Informe seu nome para registro e precione Enter:");
            String name = s.nextLine().trim();
            ChatInterface client = new Chat(name);

            ChatInterface server = (ChatInterface) Naming.lookup("rmi://localhost/POS");
            String msg = "[" + client.getName() + "] conectando...";
            server.send(msg);
            System.out.println("Sistema pronto para ler:");
            server.setClient(client);

            while (true) {
                msg = s.nextLine().trim();
                msg = "[" + client.getName() + "] " + msg;
                server.send(msg);
            }

        } catch (Exception e) {
            System.out.println("Sistema falhou: " + e);
        }
    }
}
