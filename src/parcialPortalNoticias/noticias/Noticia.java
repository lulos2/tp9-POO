package parcialPortalNoticias.noticias;

import java.util.ArrayList;

public class Noticia extends ElementoPortal{

    private String contenido;
    private String titulo;
    private String autor;
    private String categoria;
    private ArrayList<String> palabrasClave;

    public Noticia(String contenido, String titulo, String autor, String categoria) {
        this.contenido = contenido;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.palabrasClave = new ArrayList<String>();
    }

    public ArrayList<String> getPalabrasClave(){
        return new ArrayList<String>(this.palabrasClave);
    }

    public String getContenido() {
        return this.contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    @Override
    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
