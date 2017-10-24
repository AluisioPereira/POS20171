/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author ajp
 */
public class Concorrente extends Thread {

    private static ServerSocket servidor = null;
    private static Socket cliente = null;
    private static ObjectInputStream input = null;

    @Override
    public void run() {
        try {

            // abrindo a porta de conexão.
            servidor = new ServerSocket(10999);
            //se conectando ao cliente
            System.out.println("Servidor esperando cliente...");

            cliente = servidor.accept();
            System.out.println("conexao estabelecedia");
            //lendo objeto recebido
            System.out.println("-------> \n aguardando mensagens... \n");
            input = new ObjectInputStream(cliente.getInputStream());

            while (true) {
                Mensagem msg = (Mensagem) input.readObject();

                if (msg != null) {
                    System.out.println("[" + msg.getIdetidade() + "] " + msg.getTexto());
                    System.out.println("------->");
                } else {
                    System.out.println("envio vázio");
                }
            }

        } catch (IOException e) {
            System.out.println("Sistema falhou - exceção.");
            e.printStackTrace();

        } catch (ClassNotFoundException ex) {
            System.out.println("Sistema falhou - classe não existe.");
            ex.printStackTrace();
        }
    }

}
