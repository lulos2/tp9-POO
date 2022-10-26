package aseguradora.seguros;

import aseguradora.calculador.Calculador;
import aseguradora.calculador.MontoFijo;
import aseguradora.criterios.Criterio;
import aseguradora.seguros.Seguro;

import java.util.ArrayList;

public class Simple extends Seguro {

    private int nPoliza;

    private String descripcion;
    private double monto;

    public Simple(int nPoliza, double monto, int dni, String descripcion){
        this.nPoliza = nPoliza;
        this.monto = monto;
        this.dni = dni;
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
    public ArrayList<Seguro> buscarPor(Criterio criterio) {
        ArrayList<Seguro> result = new ArrayList<>();
        if(criterio.cumple(this)){
            result.add(this);
        }
        return result;
    }
    public ArrayList<Seguro> getSeguros(){
        return null;
    }
}
