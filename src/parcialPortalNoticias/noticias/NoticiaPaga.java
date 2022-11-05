package parcialPortalNoticias.noticias;

import parcialPortalNoticias.criterio.Criterio;

import java.util.ArrayList;

public class NoticiaPaga extends Noticia{

    public NoticiaPaga(String contenido, String titulo, String autor, String categoria) {
        super(contenido, titulo, autor, categoria);
    }

    @Override
    public ArrayList<Noticia> searchFor(Criterio c) {
        ArrayList<Noticia> result = new ArrayList<>();
        result.add(this);
        return result;
    }
}
