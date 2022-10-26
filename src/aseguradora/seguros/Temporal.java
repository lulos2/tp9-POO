package aseguradora.seguros;

import aseguradora.criterios.Criterio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Temporal extends Seguro{

    private LocalDate inicio;
    private LocalDate fin;


    public Temporal(int dni, LocalDate fin) {
        super(dni);
        this.inicio = LocalDate.now();
        this.fin = fin;
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
    public ArrayList<Seguro> buscarPor(Criterio criterio) {
        return null;
    }

}
