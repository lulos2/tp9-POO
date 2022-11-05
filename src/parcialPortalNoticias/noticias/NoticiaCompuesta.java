package parcialPortalNoticias.noticias;

import parcialPortalNoticias.criterio.Criterio;

import java.util.ArrayList;

public class NoticiaCompuesta extends ElementoPortal{

    private String defecto;
    private ArrayList<ElementoPortal> noticias;
    private int posElemento;

    public NoticiaCompuesta(int pos){
        this.posElemento = pos;
        this.defecto = "sin definir";
    }

    public void setDefecto(String defecto){
        this.defecto = defecto;
    }

    public void addNoticias(ArrayList<Noticia> noticias){
        this.noticias.addAll(noticias);
    }

    public int getPosElemento(){
        return this.posElemento;
    }

    public String getCategoria(){
        int i = 0;
        String result = this.defecto;
        for (ElementoPortal noticias: this.noticias) {
            i++;
            if(i == getPosElemento()){
                result = noticias.getCategoria();
                return result;
            }
        }
        return result;
    }

    public ArrayList<String> getPalabrasClave(){
        ArrayList<String> result = new ArrayList<>();
        for (ElementoPortal n : this.noticias){
            ArrayList<String> aux = n.getPalabrasClave();
            for (String palabras: aux) {
                if (!result.contains(palabras)){
                    result.add(palabras);
                }
            }
        }
        return result;
    }

    @Override
    public ArrayList<Noticia> searchFor(Criterio c) {
        ArrayList<Noticia> result = new ArrayList<Noticia>();
        for (ElementoPortal elemento: this.noticias){
            result.addAll(elemento.searchFor(c));
        }
        return result;
    }
}
