package aseguradora.comparator;

import aseguradora.seguros.Simple;

import java.util.Comparator;

public class ComparadorDni extends Comparador{

    public ComparadorDni(Comparator<Simple> ste) {
        super(ste);
    }

    @Override
    public int diferencia(Simple seguro1, Simple seguro2) {
        return seguro1.getDni() - seguro1.getDni();
    }
}
