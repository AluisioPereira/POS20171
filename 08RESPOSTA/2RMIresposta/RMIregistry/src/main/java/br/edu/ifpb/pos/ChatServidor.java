/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos;

/**
 *
 * @author ajp
 */
public class ChatServidor{

    public static void main(String[] argv) {
        
        Concorrente c = new Concorrente();
        c.start();
    }

}
