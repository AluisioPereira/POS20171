/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.ads.pos.tipodoc.entidades;

import com.thoughtworks.xstream.XStream;
import java.io.File;

/**
 *
 * @author ajp
 */
public class LivroJAXB {
    public static void main(String[] args) {
        objetoxml();
        //objetoparaXML();
    }

    private static void objetoxml() {
        File file = new File ("src/main/java/ads/pos/xml/livro.xml");
        XStream stream = new XStream();
        
        
    }
    
}

