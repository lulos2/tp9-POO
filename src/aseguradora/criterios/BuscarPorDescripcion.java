package aseguradora.criterios;

import aseguradora.seguros.Simple;

public class BuscarPorDescripcion extends Criterio{

    private String descripcion;

    public BuscarPorDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    @Override
    public boolean cumple(Simple seguro) {

        return seguro.getDescripcion().contains(this.descripcion);
    }
}
