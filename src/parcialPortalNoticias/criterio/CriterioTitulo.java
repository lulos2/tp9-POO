package parcialPortalNoticias.criterio;

import parcialPortalNoticias.noticias.Noticia;

public class CriterioTitulo extends Criterio{

    private String titulo;

    public CriterioTitulo(String titulo){
        this.titulo = titulo;
    }

    @Override
    public boolean cumple(Noticia n) {
        return n.getTitulo().contains(this.titulo);
    }
}
