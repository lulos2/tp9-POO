package sitioWebNoticias;

import java.util.ArrayList;

public abstract class Contenido {

   public abstract int getCantidadNoticias();

   public abstract ArrayList<Noticia> searchFor(Condicion c);


}
/*
    El modelo presentado debe proveer servicios que permitan obtener la cantidad de noticias que
    contiene una categoría, y la cantidad de noticias que contiene una sección, sub-sección,*/
