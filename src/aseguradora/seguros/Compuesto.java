package aseguradora.seguros;

import aseguradora.calculador.Calculador;
import aseguradora.calculador.PorcentajeValorAsegurado;
import aseguradora.criterios.Criterio;

import java.util.ArrayList;
import java.util.Comparator;

public class Compuesto extends Seguro {


    private ArrayList<Seguro> seguros;

    public Compuesto(int dni){
        super(dni);
        seguros = new ArrayList<Seguro>();
        calculador = new PorcentajeValorAsegurado(10);
    }

    public void setCalculador(Calculador calculador){
        this.calculador = calculador;
    }

    public void addSeguro(Seguro seguro){
        this.seguros.add(seguro);
    }


    public int getPoliza(){
        int result = 0;
        for (Seguro seguro: this.seguros) {
            int aux = seguro.getPoliza();
            if (aux > result){
                result = aux;
            }
        }
        return result;
    }
    
    @Override
    public double getMonto() {
        double montoTotal = 0;
        if(this.seguros.size()>0)
            for (Seguro seguros: this.seguros){
                montoTotal += seguros.getMonto();
            }
        return this.calculador.calucular(montoTotal);
    }
    public ArrayList<Seguro> getSeguros(){
        return new ArrayList<>(this.seguros);
    }
    public int getDni(){
        return this.dni;
    }

    @Override
    public ArrayList<Simple> buscarPor(Criterio criterio, Comparator<Simple>comparator) {
        ArrayList<Simple> result = new ArrayList<>();
        for (Seguro seguro: this.getSeguros()) {
                result.addAll(seguro.buscarPor(criterio,comparator));
            }
        result.sort(comparator);
        return result;
    }
}
