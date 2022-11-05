package parcialPortalNoticias.criterio;

import parcialPortalNoticias.noticias.Noticia;

public class CriterioCategoria extends Criterio{

    private String categoria;

    public CriterioCategoria(String categoria){
        this.categoria = categoria;
    }

    public boolean cumple(Noticia noticia){
        return noticia.getCategoria().equals(this.categoria);
    }
}
