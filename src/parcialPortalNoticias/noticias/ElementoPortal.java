package parcialPortalNoticias.noticias;

import parcialPortalNoticias.criterio.Criterio;

import java.util.ArrayList;

public abstract class ElementoPortal {

    public abstract String getCategoria();
    public abstract ArrayList<String> getPalabrasClave();

    public abstract ArrayList<Noticia> searchFor(Criterio c);
}
