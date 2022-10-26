package sitioWebNoticias;

public class CondicionPalabraClave extends Condicion{
    private String palabraClave;
    @Override
    public boolean cumple(Noticia noticia){
        return noticia.getPalabrasClave().contains(palabraClave);
    }
}
