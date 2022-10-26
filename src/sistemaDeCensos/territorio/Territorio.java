package sistemaDeCensos.territorio;

public abstract class Territorio {

    protected String nombre;


    public abstract String getNombre();

    public abstract int getHabitantes();

    public abstract double getSuperficie();

    public abstract double getIngresos();

    public abstract double getDensidad();

    public abstract double getIngresosPerCapita();

}
