package TPEspecial.comparators;

import TPEspecial.entidades.Alumno;

import java.util.Comparator;

public class ComparatorName implements Comparator<Alumno> {

    private Comparator next;

    public ComparatorName(Comparator next) {
        this.next = next;
    }

    @Override
    public int compare(Alumno o1, Alumno o2) {
        int result = o1.getNombre().compareTo(o2.getNombre());
        if(result != 0){
            return result;
        }
        else {
            return next.compare(o1, o2);
        }
    }
}
