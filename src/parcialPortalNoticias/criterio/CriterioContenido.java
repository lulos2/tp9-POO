package parcialPortalNoticias.criterio;

import parcialPortalNoticias.noticias.Noticia;

public class CriterioContenido extends Criterio{

    private String contenido;

    public CriterioContenido(String contenido){
        this.contenido = contenido;
    }

    public boolean cumple(Noticia noticia){
        return noticia.getContenido().contains(this.contenido);
    }
}
