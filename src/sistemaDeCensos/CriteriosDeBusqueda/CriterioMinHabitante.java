package sistemaDeCensos.CriteriosDeBusqueda;

import sistemaDeCensos.territorio.Simple;

public class CriterioMinHabitante extends Criterio{

    private int habitantesMin;

    public CriterioMinHabitante(int habitante){
        this.habitantesMin = habitante;
    }
    @Override
    public boolean cumple(Simple territorio) {
        return (territorio.getHabitantes() > this.habitantesMin);
    }
}
/*
    Todas las comarcas con más de 100.000 habitantes*/
