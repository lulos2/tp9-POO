package TPEspecial.comparators;

import TPEspecial.entidades.Alumno;

import java.util.Comparator;

public class ComparatorDNI extends ComparadorAlumnos{

    public ComparatorDNI(Comparator<Alumno>  next){
        super(next);
    }

    @Override
    public int diferencia(Alumno a1, Alumno a2) {
        return a1.getDni() - a2.getDni();
    }


}
