package parcialPortalNoticias.noticias;

import sistemaDeCensos.CriteriosDeBusqueda.Criterio;

import java.util.ArrayList;

public abstract class ElementoPortal {

    public abstract String getCategoria();
    public abstract ArrayList<String> getPalabrasClave();

    public abstract ArrayList<Noticia> buscarPor(Criterio c);
}
