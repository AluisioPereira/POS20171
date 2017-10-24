/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

/**
 *
 * @author ajp
 */
public class ChatCliente {

    private static Registry registry = null;
    private static ChatInterface cliente = null;

    public static void main(String[] argv) {
        try {

            Scanner s = new Scanner(System.in);
            System.out.println("Informe seu nome para registro e precione Enter:");
            String name = s.nextLine().trim();

            cliente = new Chat(name);

            registry = LocateRegistry.getRegistry("localhost", 10999);
            cliente = (ChatInterface) registry.lookup("ChatPOS");

            ChatInterface servidor = (ChatInterface) registry.lookup("ChatPOS");

            String msg = "[" + cliente.getName() + "] conectando...";
            servidor.send(msg);
            System.out.println("Sistema pronto para ler:");
            servidor.setClient(cliente);

            while (true) {
                msg = s.nextLine().trim();
                msg = "[" + cliente.getName() + "] " + msg;
                servidor.send(msg);
            }

        } catch (Exception e) {
            System.out.println("Sistema falhou: " + e);
        }
    }
}
