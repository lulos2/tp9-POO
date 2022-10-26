package sitioWebNoticias;

import java.util.ArrayList;

public class Compuesto extends  Contenido{

    private ArrayList<Contenido> contenidos;
    private ArrayList<Noticia> noticias;
    private String descripcion;
    private String imagen;

    public Compuesto(Noticia noticia, String descripcion, String imagen){
        noticia = new Noticia("titulo","clave","intro","texto", "autor" , "link");
        this.noticias.add(noticia);
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public void add(Compuesto compuesto){
        this.contenidos.add(compuesto);
    }

    public void add(Noticia noticia){
        this.noticias.add(noticia);
    }

    @Override
    public int getCantidadNoticias() {
        return noticias.size();
    }

    public ArrayList<Noticia> searchFor(Condicion condicion){
        ArrayList<Noticia> result = new ArrayList<>();
        return result;
    }

    public ArrayList<Noticia> getNoticias(){
        return new ArrayList<>(this.noticias);
    }


}
