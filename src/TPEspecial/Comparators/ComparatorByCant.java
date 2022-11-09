package TPEspecial.comparators;

import TPEspecial.entidades.EntidadUniversitaria;

import java.util.Comparator;

public class ComparatorByCant implements Comparator<EntidadUniversitaria> {

    @Override
    public int compare(EntidadUniversitaria e1, EntidadUniversitaria e2) {
        return e1.getCant() - e2.getCant();
    }
}
