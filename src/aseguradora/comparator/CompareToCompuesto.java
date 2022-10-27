package aseguradora.comparator;

import aseguradora.seguros.Simple;

import java.util.Comparator;

public abstract class CompareToCompuesto implements Comparator<Simple>{

    protected Comparator<Simple> siguiente;

    public CompareToCompuesto(Comparator<Simple> siguiente){
        this.siguiente = siguiente;
    }
}