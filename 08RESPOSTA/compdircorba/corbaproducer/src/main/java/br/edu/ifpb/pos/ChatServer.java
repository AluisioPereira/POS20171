/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos;

import chat.Chat;
import chat.ChatHelper;
import org.omg.CORBA.ORB;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

/**
 *
 * @author ajp
 */
public class ChatServer {

    public static void main(String args[]) {
        try {
//            Properties p = new Properties(System.getProperties());
//            p.put("ORBInitialPort", "1050");
//            p.put("ORBInitialHost", "localhost");

            String[] p1 = {"-ORBInitialPort", "1050", "-ORBInitialHost", "localhost"};
           
            //ORB orb = ORB.init(args, p);
            
// Criação e inicialização do ORB
            ORB orb = ORB.init(p1, System.getProperties());

            // obtém a referência do rootpoa e ativa o POAManager
            POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootpoa.the_POAManager().activate();

            // cria o servant e registra com o ORB
            ChatServerImpl helloImpl = new ChatServerImpl();
            helloImpl.setORB(orb);

            // obtém referência do objeto servant
            org.omg.CORBA.Object ref = rootpoa.servant_to_reference(helloImpl);
            Chat href = ChatHelper.narrow(ref);

            org.omg.CORBA.Object objRef
                    = orb.resolve_initial_references("NameService");
// Especifica o servidor de nomes(INS)
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            // Especifica uma referência de objeto
            String name = "Hello";
            NameComponent path[] = ncRef.to_name(name);
            ncRef.rebind(path, href);

            System.out.println("ChatServer lendo e aguando...");

            // Aguarda a invocação de clientes
            orb.run();
        } catch (Exception e) {
            System.err.println("ERROR: " + e);
            e.printStackTrace(System.out);
        }

        System.out.println("Saindo ChatServer...");

    }

}
