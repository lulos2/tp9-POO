package sitioWebNoticias;

import java.util.ArrayList;
import java.util.List;

public class Noticia {

    private String titulo;
    private ArrayList<String> palabrasClave;
    private String introduccion;
    private String texto;
    private String autor;
    private String linkAsociado;

    public Noticia(String titulo,String palabraClave, String introduccion, String texto, String autor, String linkAsociado) {
        this.titulo = titulo;
        this.palabrasClave.add(palabraClave);
        this.introduccion = introduccion;
        this.texto = texto;
        this.autor = autor;
        this.linkAsociado = linkAsociado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<String> getPalabrasClave() {
        return new ArrayList<>(this.palabrasClave) {
        };
    }

    public void add(String palabraClave){
        this.palabrasClave.add(palabraClave);
    }

    public String getIntroduccion() {
        return introduccion;
    }

    public void setIntroduccion(String introduccion) {
        this.introduccion = introduccion;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getLinkAsociado() {
        return linkAsociado;
    }

    public void setLinkAsociado(String linkAsociado) {
        this.linkAsociado = linkAsociado;
    }

    public int getLongText(){
        return this.texto.length();
    }
}
