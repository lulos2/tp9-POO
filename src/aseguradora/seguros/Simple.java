package aseguradora.seguros;

import aseguradora.calculador.Calculador;
import aseguradora.calculador.MontoFijo;
import aseguradora.criterios.Criterio;

import java.util.ArrayList;
import java.util.Comparator;

public class Simple extends Seguro {

    private int nPoliza;

    private String descripcion;
    private double monto;
    private Calculador calculador;

    public Simple(int nPoliza, double monto, int dni, String descripcion){
        super(dni);
        this.nPoliza = nPoliza;
        this.monto = monto;
        this.descripcion = descripcion;
        this.calculador = new MontoFijo(300);
    }

    public void setCalculador(Calculador calculador) {
        this.calculador = calculador;
    }

    public String getDescripcion() {
        return this.descripcion;
    }
    public int getDni(){
        return this.dni;
    }

    public int getPoliza(){
        return this.nPoliza;
    }

    @Override
    public double getMonto() {
        return this.monto;
    }

    @Override
    public ArrayList<Simple> buscarPor(Criterio criterio, Comparator<Simple> comparator) {
        ArrayList<Simple> result = new ArrayList<>();
        if(criterio.cumple(this)){
            result.add(this);
        }
        return result;
    }
    public ArrayList<Seguro> getSeguros(){
        ArrayList<Seguro> result = new ArrayList<>();
        result.add(this);
        return result;
    }
}
