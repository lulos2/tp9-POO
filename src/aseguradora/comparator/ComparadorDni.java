package aseguradora.comparator;

import aseguradora.seguros.Simple;

import java.util.Comparator;

public class ComparadorDni extends CompareToCompuesto implements Comparator<Simple>{

    public ComparadorDni(Comparator<Simple> ste) {
        super(ste);
    }


    @Override
    public int compare(Simple o1, Simple o2) {
        int aux;
        aux = o1.getDni() - o2.getDni();
        if (aux == 0){
            aux = this.siguiente.compare(o1,o2);
        }
        return aux;
    }
}
