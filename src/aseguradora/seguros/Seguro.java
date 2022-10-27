package aseguradora.seguros;

import aseguradora.calculador.Calculador;
import aseguradora.criterios.Criterio;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class Seguro {

    protected Calculador calculador;
    protected int dni;

    public Seguro(int dni){
        this.dni = dni;
    }


    public abstract int getPoliza();
    public abstract double getMonto();
    public abstract ArrayList<Seguro> getSeguros();
    public abstract int getDni();
    public abstract ArrayList<Simple> buscarPor(Criterio criterio, Comparator<Simple> comparator);

}
