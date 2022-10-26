package sistemaDeCensos.territorio;

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
    public double getDensidad() {
        return (this.habitantes/this.superficie);
    }

    @Override
    public double getIngresosPerCapita() {
        return (this.ingresos/this.habitantes);
    }
}
