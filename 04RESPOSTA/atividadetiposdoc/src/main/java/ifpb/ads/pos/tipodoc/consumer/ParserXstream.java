package ifpb.ads.pos.tipodoc.consumer;


import com.thoughtworks.xstream.XStream;
import ifpb.ads.pos.tipodoc.entidades.Autor;
import ifpb.ads.pos.tipodoc.entidades.Livro;
import java.io.File;

/**
 *
 * @author ajp
 */
public class ParserXstream implements ParserXML {

    private final XStream stream;

    public ParserXstream() {
        this.stream = new XStream();
        this.stream.alias("livro", Livro.class);
        this.stream.alias("autor", Autor.class);
    }

    public void toObject() {
        File file = new File("src/main/java/ifpb/ads/pos/tipodoc/livro.xml");
        Livro livro = (Livro) stream.fromXML(file);
        System.out.println("livro = " + livro);
    }

    public void toXML(Livro livro) {
        String toXML = stream.toXML(livro);
        System.out.println(toXML);
    }
}
