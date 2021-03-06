/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.ads.pos.tipodoc.entidades;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author ajp
 */
@XmlType(propOrder = {"titulo", "autor", "data", "ISBN", "editora"})
@XmlRootElement(name = "livro")
public class Livro {

    private String titulo;
    private String ISBN;
    private String editora;
    private String data;
    private Autor autor;

    public Livro() {
    }

    public Livro(String titulo, String ISBN, String editora, String data, Autor autor) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.editora = editora;
        this.data = data;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", ISBN=" + ISBN + ", editora=" + editora + ", data=" + data + ", autor=" + autor + '}';
    }

}
