package TPEspecial.comparators;

import TPEspecial.entidades.Alumno;

import java.util.Comparator;

public class ComparatorName extends ComparadorAlumnos {


    public ComparatorName(Comparator<Alumno> next) {
        super(next);
    }

    @Override
    public int diferencia(Alumno a1, Alumno a2) {
        return a1.getNombre().compareTo(a2.getNombre());
    }


}
