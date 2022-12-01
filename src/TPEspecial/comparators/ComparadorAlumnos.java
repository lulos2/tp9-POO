package TPEspecial.comparators;

import TPEspecial.entidades.Alumno;
import TPEspecial.entidades.EntidadUniversitaria;


import java.util.Comparator;

public abstract class ComparadorAlumnos implements Comparator<Alumno>{

    private Comparator<Alumno> siguiente;
    public ComparadorAlumnos(Comparator<Alumno> ste) {
        siguiente = ste;
    }

    public abstract int diferencia(Alumno a1, Alumno a2);

    @Override
    public int compare(Alumno a1, Alumno a2) {
        int aux = diferencia(a1, a2);
        if(aux == 0) {
            if (siguiente != null)
                return siguiente.compare(a1, a2);
        }
        else if (aux > 0 ) {return 1;}
        else if (aux < 0 ) {return -1;}
        return 0;
    }
}