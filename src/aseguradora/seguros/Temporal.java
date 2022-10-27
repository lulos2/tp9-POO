package aseguradora.seguros;

import aseguradora.criterios.Criterio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Temporal extends Seguro{

    private Seguro tipo;
    private LocalDate inicio;
    private LocalDate fin;


    public Temporal(int dni, LocalDate fin, Seguro tipo) {
        super(dni);
        this.inicio = LocalDate.now();
        this.fin = fin;
        this.tipo = tipo;
    }

    @Override
    public int getPoliza() {
        return 0;
    }

    @Override
    public double getMonto() {
        if(LocalDate.now().isAfter(this.fin))
            return this.getMonto();
        else {
            return 0;
        }
    }

    @Override
    public ArrayList<Seguro> getSeguros() {
        return null;
    }

    @Override
    public int getDni() {
        return 0;
    }


    @Override
    public ArrayList<Simple> buscarPor(Criterio criterio, Comparator<Simple> comparator) {
        ArrayList<Simple> result = new ArrayList<Simple>();
        if (this.fin.isAfter(LocalDate.now())){
            result = tipo.buscarPor(criterio, comparator);
        }
        return result;
    }
}
