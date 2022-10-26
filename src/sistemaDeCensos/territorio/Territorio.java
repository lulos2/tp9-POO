package sistemaDeCensos.territorio;

import sistemaDeCensos.CriteriosDeBusqueda.Criterio;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class Territorio {

    protected String nombre;


    public abstract String getNombre();

    public abstract int getHabitantes();

    public abstract double getSuperficie();

    public abstract double getIngresos();

    public double getDensidad(){
        return (this.getHabitantes()/this.getSuperficie());
    }

    public double getIngresosPerCapita(){
        return (this.getIngresos()/this.getHabitantes());
    }

    public abstract ArrayList<Simple> buscarPor(Criterio criterio, Comparator<Simple> comparator);

}
