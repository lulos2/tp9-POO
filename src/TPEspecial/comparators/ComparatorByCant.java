package TPEspecial.comparators;

import TPEspecial.entidades.EntidadUniversitaria;

import java.util.Comparator;

public class ComparatorByCant implements Comparator<EntidadUniversitaria> {

    @Override
    public int compare(EntidadUniversitaria e1, EntidadUniversitaria e2) {
        return e2.getCant() - e1.getCant();
    }
}
