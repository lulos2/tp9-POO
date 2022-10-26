package sistemaDeCensos.territorio;

import sistemaDeCensos.CriteriosDeBusqueda.Criterio;
import sistemaDeCensos.comparator.CompareToByNombre;
import sistemaDeCensos.comparator.CompareToCompuesto;

import java.util.ArrayList;
import java.util.Comparator;

public class Compuesto extends Territorio{

    ArrayList<Territorio> territorios;

    public Compuesto(String nombre){
        this.nombre = nombre;
        this.territorios = new ArrayList<>();
    }


    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public int getHabitantes() {
        int habitantes = 0;
        for (Territorio territorio: this.territorios) {
            habitantes += territorio.getHabitantes();
        }
        return habitantes;
    }

    @Override
    public double getSuperficie() {
        double superficieTotal = 0;
        for (Territorio territorio: this.territorios) {
            superficieTotal += territorio.getSuperficie();
        }
        return superficieTotal;
    }

    @Override
    public double getIngresos() {
        double ingresos = 0;
        for (Territorio territorio: this.territorios) {
            ingresos += territorio.getIngresos();
        }
        return ingresos;
    }

    @Override
    public ArrayList<Simple> buscarPor(Criterio criterio, Comparator<Simple> comparator) {
        ArrayList<Simple> result = new ArrayList<>();
        for (Territorio territorio: this.territorios) {
            result.addAll(territorio.buscarPor(criterio,comparator));
            }
        CompareToCompuesto c = new CompareToByNombre(new CompareToByNombre(new CompareToByNombre(new CompareToByNombre(null))));
        result.sort(comparator);
        return result;
    }
}
