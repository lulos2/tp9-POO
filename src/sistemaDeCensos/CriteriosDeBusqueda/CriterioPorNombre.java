package sistemaDeCensos.CriteriosDeBusqueda;

import sistemaDeCensos.territorio.Simple;

public class CriterioPorNombre extends Criterio {

    private String nombre;

    public CriterioPorNombre(String nombre){
        this.nombre = nombre;
    }
    @Override
    public boolean cumple(Simple territorio) {
        return territorio.getNombre().equals(this.nombre);
    }
}
