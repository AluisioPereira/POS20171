/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author ajp
 */
public class Cliente {

    private static Socket servidor = null;
    private static ObjectOutputStream output = null;

    public static void main(String[] args) throws IOException {

        //abrindo comunicação com servidor
        servidor = new Socket("localhost", 10999);
        //enviando o objeto
        output = new ObjectOutputStream(servidor.getOutputStream());

        Scanner s = new Scanner(System.in);
        System.out.print("Informe seu nome no chat e pecione Enter:");
        String name = s.nextLine().trim();
        Mensagem msg = new Mensagem();
        int escolha = 1;

        while (escolha == 1) {
            System.out.print("Mensagem: ");
            String m = s.nextLine().trim();
            if (m != null) {
                msg = new Mensagem(name, m);
                output.writeObject(msg);
                output.flush();
                System.out.println("mensagem enviada \n --------------->");           
            } else {
                System.out.println("Mensagem vazia.");
            }
        }
        output.close();
        servidor.close();

    }

}
