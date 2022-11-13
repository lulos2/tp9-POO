package TPEspecial.comparators;

import TPEspecial.entidades.Alumno;

import java.util.Comparator;

public class ComparatorDNI implements Comparator<Alumno> {

    public ComparatorDNI(){
    }

    @Override
    public int compare(Alumno a1, Alumno a2) {
        return a1.getDni() - a2.getDni();
    }
}
