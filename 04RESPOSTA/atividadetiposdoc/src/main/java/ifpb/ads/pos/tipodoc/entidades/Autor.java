/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.ads.pos.tipodoc.entidades;

import javax.xml.bind.annotation.XmlType;


/**
 *
 * @author ajp
 */
@XmlType(propOrder = {"nome", "nascimento"})
public class Autor {

    private String nome;
    private String nascimento;

    public Autor() {
    }

    public Autor(String nome, String nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    @Override
    public String toString() {
        return "Autor{" + "nome=" + nome + ", nascimento=" + nascimento + '}';
    }

}