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
public class Concorrente extends Thread {

    @Override
    public void run() {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Informe seu nome de registro e precione Enter: ");
            String name = s.nextLine().trim();
            ChatInterface cliente = new Chat(name);
//            ChatInterface cliente = new Chat();
            Registry registry = LocateRegistry.createRegistry(10999);
            System.out.println("Registrando...");
            registry.bind("ChatPOS", cliente);
            System.out.println("Servidor - pronto para ouvir...");
            Thread t = new Thread();
            t.start();

            while (true) {
                String msg = s.nextLine().trim();
                if (cliente.getClient() != null) {
                    ChatInterface client = cliente.getClient();
                    msg = "[" + cliente.getName() + "] " + msg;
                    client.send(msg);
                }
            }

        } catch (Exception e) {
            System.err.println("Servidor - não foi possível estabelecer comunicação.");
            e.printStackTrace();
        }
    }
}
