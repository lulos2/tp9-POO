package parcialPortalNoticias.criterio;

import parcialPortalNoticias.noticias.Noticia;

public class CriterioOr extends Criterio{

    private Criterio c1, c2;

    public CriterioOr(Criterio c1, Criterio c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public boolean cumple(Noticia noticia) {
        return (c1.cumple(noticia) || c2.cumple(noticia));
    }
}
