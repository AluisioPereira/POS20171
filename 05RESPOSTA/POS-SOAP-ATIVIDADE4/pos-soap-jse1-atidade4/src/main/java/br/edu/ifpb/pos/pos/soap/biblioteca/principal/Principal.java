/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.pos.soap.biblioteca.principal;

import br.edu.ifpb.pos.biblioteca.Autor;
import br.edu.ifpb.pos.biblioteca.Biblioteca;
import br.edu.ifpb.pos.biblioteca.BibliotecaService;
import br.edu.ifpb.pos.biblioteca.Livro;
import java.util.ArrayList;

/**
 *
 * @author ajp
 */
public class Principal {

    public static void main(String[] args) {
        BibliotecaService proxy = new BibliotecaService();
        Biblioteca service = proxy.getBibliotecaPort();
        Autor a = new Autor();
        a.setNome("DisciplinaPOS");
        a.setEmail("pos@gmail.com");
        a.setAbreviacao("POS");
        Livro l = new Livro();
        l.setTitulo("Titulo do livro");
        l.setDescricao("Descrição do livro");
        l.setEdicao("Edição do livro");

        ArrayList<Autor> autores1 = new ArrayList<Autor>();
        autores1.add(a);

        Autor a2 = new Autor();
        a2.setNome("DisciplinaPOS2");
        a2.setEmail("pos@gmail.com2");
        a2.setAbreviacao("POS2");

        Autor a3 = new Autor();
        a3.setNome("DisciplinaPOS3");
        a3.setEmail("pos@gmail.com3");
        a3.setAbreviacao("POS3");

        autores1.add(a2);
        autores1.add(a3);

        Livro l2 = new Livro();
        l2.setAutores(autores1);
        
        l2.setTitulo("Titulo do livro2");
        l2.setDescricao("Descrição do livro2");
        l2.setEdicao("Edição do livro2");
        
       // imprimir autores gerados
       //autores1.forEach(aa->System.out.println(aa.getNome()));

        //service.salvarAutor(a);
        service.salvarLivro(l2);

        service.listarTodasAutor().forEach(a0 -> System.out.println(a0.getId()));
        service.listarTodasLivro().forEach(l1 -> System.out.println(l1.getDescricao()));
        
        

    }
}
