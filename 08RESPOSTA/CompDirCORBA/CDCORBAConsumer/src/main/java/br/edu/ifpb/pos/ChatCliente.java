/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos;

import chat.Chat;
import chat.ChatHelper;
import org.omg.CORBA.ORB;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

/**
 *
 * @author ajp
 */
public class ChatCliente {

    static Chat chatImpl;

    public static void main(String args[]) {
        try {
            String[] p1 = {"-ORBInitialPort", "1050", "-ORBInitialHost", "localhost"};

            ORB orb = ORB.init(p1, System.getProperties());

            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");

            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            String name = "Hello";
            chatImpl = ChatHelper.narrow(ncRef.resolve_str(name));
            System.out.println("Obtained a handle on server object: " + chatImpl);
            System.out.println(chatImpl.chamar());

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

}
