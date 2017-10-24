package ifpb.ads.pos.tipodoc.consumer;

import ifpb.ads.pos.tipodoc.entidades.Autor;
import ifpb.ads.pos.tipodoc.entidades.Livro;

/**
 *
 * @author ajp
 */
public class Principal {

    public static void main(String[] args) {

        String data = "01/01/2001";
        Autor autor = new Autor("Aluisio", data);
        Livro livro = new Livro("Título do livro", "12345-678", "Nome da editora", data, autor);

// para JaxB
//        ParserXML parser = new ParserJAXB();

// para o Xstream

        ParserXML parser = new ParserXstream();
        parser.toXML(livro);
        parser.toObject();
    }

}
