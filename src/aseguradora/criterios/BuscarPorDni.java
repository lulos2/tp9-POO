package aseguradora.criterios;

import aseguradora.seguros.Seguro;
import aseguradora.seguros.Simple;

public class BuscarPorDni extends Criterio{

    private int dni;
    public BuscarPorDni(int dni){
        this.dni = dni;
    }
    @Override
    public boolean cumple(Simple seguro) {
        return (seguro.getDni()== this.dni);
    }
}
