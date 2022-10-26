package aseguradora.calculador;

public class MontoFijo extends Calculador{

    private double montoFijo;

    public MontoFijo(double montoFijo){
        this.montoFijo = montoFijo;
    }
    @Override
    public double calucular(double monto) {
        return this.montoFijo;
    }
}
