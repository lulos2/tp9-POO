package sitioWebNoticias;

public class CondicionLargoTextoMin extends Condicion{

    private int largoMin;

    public CondicionLargoTextoMin(int largoMin){
        this.largoMin = largoMin;
    }
    @Override
    public boolean cumple(Noticia n) {
        return (n.getLongText() > largoMin);
    }
}
