package parcialPortalNoticias.noticias;

import java.util.ArrayList;
import java.util.Collection;

public class NoticiaCompuestaEspecial extends NoticiaCompuesta {

    private int numPalabrasClave;

    public NoticiaCompuestaEspecial(int pos, int palabrasClave) {
        super(pos);
        this.numPalabrasClave = palabrasClave;
    }

    private int getNumPalabrasClave(){
        return this.numPalabrasClave;
    }
    @Override
    public ArrayList<String> getPalabrasClave() {
        ArrayList<String> aux = super.getPalabrasClave();
        aux.sort(String::compareTo);
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; (i < this.getNumPalabrasClave()&&(i< aux.size())); i++){
            result.add(aux.get(i));
        }
        return result;
    }
}
