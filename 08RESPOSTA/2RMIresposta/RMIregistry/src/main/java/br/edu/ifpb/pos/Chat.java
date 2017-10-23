/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author ajp
 */
public class Chat extends UnicastRemoteObject implements ChatInterface {

    public String name;
    public ChatInterface client = null;

    public Chat(String n) throws RemoteException {
        this.name = n;
    }

    public Chat() throws RemoteException {
        super();
    }

    public String getName() throws RemoteException {
        return this.name;
    }

    public void setClient(ChatInterface c) {
        client = c;
    }

    public ChatInterface getClient() {
        return client;
    }

    public void send(String s) throws RemoteException {
        System.out.println(s);
    }
}
