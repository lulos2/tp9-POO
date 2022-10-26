package sistemaDeCensos.comparator;

import sistemaDeCensos.territorio.Territorio;

import java.util.Comparator;

public class CompareToByNombre extends CompareToCompuesto implements Comparator<Territorio> {


    public CompareToByNombre(Comparator<Territorio> siguiente){
        super(siguiente);
    }
    @Override
    public int compare(Territorio o1, Territorio o2) {
        int aux;
        aux = o1.getNombre().compareTo(o2.getNombre());
        if(aux == 0){
            return this.siguiente.compare(o1, o2);
        }
        return aux;
    }
}
