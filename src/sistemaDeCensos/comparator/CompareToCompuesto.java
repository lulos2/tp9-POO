package sistemaDeCensos.comparator;

import sistemaDeCensos.territorio.Territorio;

import java.util.Comparator;

public abstract class CompareToCompuesto implements Comparator<Territorio> {

    protected final Comparator<Territorio> siguiente;

    public CompareToCompuesto(Comparator<Territorio> siguiente){
        this.siguiente = siguiente;
    }
}
