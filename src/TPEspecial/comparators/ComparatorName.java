package TPEspecial.comparators;

import TPEspecial.entidades.Alumno;

import java.util.Comparator;

public class ComparatorName implements Comparator<Alumno> {

    private Comparator<Alumno> next;



    public ComparatorName(Comparator<Alumno> next) {
        this.next = next;
    }

    @Override
    public int compare(Alumno a1, Alumno a2) {
        int result = a1.getNombre().compareTo(a2.getNombre());
        if(result != 0){
            return result;
        }
        else {
            return next.compare(a1, a2);
        }
    }
}
