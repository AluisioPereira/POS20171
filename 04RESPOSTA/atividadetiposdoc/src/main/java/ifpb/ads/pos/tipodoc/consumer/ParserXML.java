package ifpb.ads.pos.tipodoc.consumer;

import ifpb.ads.pos.tipodoc.entidades.Livro;

/**
 *
 * @author ajp
 */
public interface ParserXML {

    public void toXML(Livro livro);

    public void toObject();

}
