package TPEspecial.comparators;

import TPEspecial.entidades.Alumno;
import TPEspecial.entidades.EntidadUniversitaria;

import java.util.Comparator;

public class ComparatorAlfabetico implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        return s1.compareTo(s2);
    }
}
