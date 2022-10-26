package sistemaDeCensos.CriteriosDeBusqueda;

import sistemaDeCensos.territorio.Simple;

public class CriterioNot extends Criterio{

    private Criterio criterio;

    public CriterioNot(Criterio c){
        this.criterio = c;
    }

    public boolean cumple(Simple territorio){
        return (!this.criterio.cumple(territorio));
    }
}
