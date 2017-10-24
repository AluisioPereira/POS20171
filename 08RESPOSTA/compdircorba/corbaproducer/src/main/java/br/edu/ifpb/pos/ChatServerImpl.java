/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos;

import chat.ChatPOA;
import org.omg.CORBA.ORB;

/**
 *
 * @author ajp
 */
public class ChatServerImpl extends ChatPOA {

    private ORB orb;

    public void setORB(ORB orb_val) {
        orb = orb_val;
    }

    // implementação do método sayHello()
    public String chamar() {
        return "\nHello world !!\n";
    }

    // implementação do método shutdown()
    public void shutdown() {
        orb.shutdown(false);
    }
}


