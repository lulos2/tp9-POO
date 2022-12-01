package TPEspecial.comparators;

import TPEspecial.entidades.Alumno;

import java.util.Comparator;



public class ComparatorApellido extends ComparadorAlumnos {


    public ComparatorApellido(Comparator<Alumno>  next) {
        super(next);
    }

    @Override
    public int diferencia(Alumno a1, Alumno a2) {
        return a1.getApellido().compareTo(a2.getApellido());
    }


}
