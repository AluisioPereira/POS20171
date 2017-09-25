package br.edu.ifpb.pos.pos.soap.server.atividade4;

import br.edu.ifpb.pos.pos.soap.server.atividade4.Autor;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-25T10:45:07")
@StaticMetamodel(Livro.class)
public class Livro_ { 

    public static volatile SingularAttribute<Livro, String> titulo;
    public static volatile SingularAttribute<Livro, Long> id;
    public static volatile ListAttribute<Livro, Autor> autores;
    public static volatile SingularAttribute<Livro, String> edicao;
    public static volatile SingularAttribute<Livro, String> descricao;

}