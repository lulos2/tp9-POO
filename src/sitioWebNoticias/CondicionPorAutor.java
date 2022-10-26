package sitioWebNoticias;

public class CondicionPorAutor extends Condicion{
    private String autor;

    public CondicionPorAutor(String autor){
        this.autor = autor;
    }
    @Override
    public boolean cumple(Noticia n) {
        return n.getAutor().equals(autor);
    }
}
