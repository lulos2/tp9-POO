package aseguradora.calculador;

import aseguradora.criterios.Criterio;
import aseguradora.seguros.Seguro;

public class PorcentajeValorAsegurado extends Calculador {

    private double porcentaje;

    public PorcentajeValorAsegurado(double porcentaje){
        this.porcentaje = porcentaje;
    }

    @Override
    public double calucular(double monto) {
        return monto + (monto*(this.porcentaje/100));
    }
}
