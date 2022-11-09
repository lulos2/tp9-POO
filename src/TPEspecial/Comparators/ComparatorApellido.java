package TPEspecial.comparators;

import TPEspecial.entidades.Alumno;

import java.util.Comparator;



public class ComparatorApellido implements Comparator<Alumno> {
    private Comparator next;

    public ComparatorApellido(Comparator next) {
        this.next = next;
    }

    @Override
    public int compare(Alumno a1, Alumno a2) {
        if(a1.getApellido().compareTo(a2.getApellido()) == 0)
            return next.compare(a1, a2);
        else
            return a1.getApellido().compareTo(a2.getApellido());
    }
}
