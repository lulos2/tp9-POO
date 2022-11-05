package parcialPortalNoticias.criterio;

import parcialPortalNoticias.noticias.Noticia;

public class CriterioAutor extends Criterio {

    private String autor;

    public CriterioAutor(String autor) {
        this.autor = autor;
    }

    public boolean cumple(Noticia noticia) {
        return noticia.getAutor().equals(this.autor);
    }
}
