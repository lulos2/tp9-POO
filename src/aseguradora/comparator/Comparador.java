package aseguradora.comparator;

import aseguradora.seguros.Simple;

import java.util.Comparator;

public abstract class Comparador implements Comparator<Simple>{

    private Comparator<Simple> siguiente;
    public Comparador(Comparator<Simple> ste) {
        siguiente = ste;
    }

    public abstract int diferencia(Simple seguro1, Simple seguro2);

    @Override
    public int compare(Simple seguro1, Simple seguro2) {
        int aux = diferencia(seguro1, seguro2);
        if(aux == 0) {
            if (siguiente != null)
                return siguiente.compare(seguro1, seguro2);
        }
        else if (aux > 0 ) {return 1;}
        else if (aux < 0 ) {return -1;}
        return 0;
    }
}