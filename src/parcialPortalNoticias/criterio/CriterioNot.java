package parcialPortalNoticias.criterio;

import parcialPortalNoticias.noticias.Noticia;

public class CriterioNot extends Criterio{

    private Criterio c1;

    public CriterioNot(Criterio c1) {
        this.c1 = c1;
    }

    public boolean cumple(Noticia noticia) {
        return (!c1.cumple(noticia));
    }

}
