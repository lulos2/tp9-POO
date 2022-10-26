package aseguradora.seguros;

import aseguradora.calculador.Calculador;
import aseguradora.criterios.Criterio;

import java.util.ArrayList;

public abstract class Seguro {

    protected Calculador calculador;
    protected int dni;


    public abstract int getPoliza();
    public abstract double getMonto();
    public abstract ArrayList<Seguro> getSeguros();
    public abstract int getDni();
    public abstract ArrayList<Seguro> buscarPor(Criterio criterio);

}
