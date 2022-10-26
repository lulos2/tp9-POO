package sistemaDeCensos.territorio;

import java.util.ArrayList;

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
}
