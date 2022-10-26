package sistemaDeCensos.CriteriosDeBusqueda;

import sistemaDeCensos.territorio.Simple;

public class CriterioDensidadMin extends Criterio{

    private double densidadMin;

    public CriterioDensidadMin(double densidadMin){
        this.densidadMin = densidadMin;
    }
    @Override
    public boolean cumple(Simple territorio) {
        return (territorio.getDensidad() > this.densidadMin);
    }
}
