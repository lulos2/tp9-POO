package parcialPortalNoticias.criterio;

import parcialPortalNoticias.noticias.Noticia;

public class CriterioAnd extends Criterio{

    private Criterio c1 , c2;

    public CriterioAnd(Criterio c1, Criterio c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public boolean cumple(Noticia noticia) {
        return (c2.cumple(noticia) && c1.cumple(noticia));
    }
}
