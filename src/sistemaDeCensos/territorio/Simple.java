package sistemaDeCensos.territorio;

import sistemaDeCensos.CriteriosDeBusqueda.Criterio;

import java.util.ArrayList;
import java.util.Comparator;

public class Simple extends Territorio{

    private double ingresos , superficie;
    private int habitantes;



    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public int getHabitantes() {
        return this.habitantes;
    }

    @Override
    public double getSuperficie() {
        return this.superficie;
    }

    @Override
    public double getIngresos() {
        return this.ingresos;
    }

    @Override
    public ArrayList<Simple> buscarPor(Criterio criterio, Comparator<Simple> comparator) {
        ArrayList<Simple> result = new ArrayList<>();
        if(criterio.cumple(this)){
            result.add(this);
        }
        return result;
    }
}
