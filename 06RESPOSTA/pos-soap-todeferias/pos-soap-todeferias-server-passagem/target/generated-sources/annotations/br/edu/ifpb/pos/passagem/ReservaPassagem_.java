package br.edu.ifpb.pos.passagem;

import br.edu.ifpb.pos.passagem.domain.ClienteId;
import br.edu.ifpb.pos.passagem.domain.PassagemId;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-18T14:07:06")
@StaticMetamodel(ReservaPassagem.class)
public class ReservaPassagem_ { 

    public static volatile SingularAttribute<ReservaPassagem, PassagemId> passagem;
    public static volatile SingularAttribute<ReservaPassagem, ClienteId> cliente;
    public static volatile SingularAttribute<ReservaPassagem, Integer> id;

}