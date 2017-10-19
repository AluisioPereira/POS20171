package br.edu.ifpb.pos.agencia;

import br.edu.ifpb.pos.agencia.Pacote;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-19T11:10:22")
@StaticMetamodel(Agencia.class)
public class Agencia_ { 

    public static volatile SingularAttribute<Agencia, String> nome;
    public static volatile ListAttribute<Agencia, Pacote> pacote;
    public static volatile SingularAttribute<Agencia, Long> id;
    public static volatile SingularAttribute<Agencia, String> cnpj;

}