package sistemaDeCensos.CriteriosDeBusqueda;

import sistemaDeCensos.territorio.Simple;

public class CriterioAnd extends Criterio{

    Criterio c1 , c2;

    public CriterioAnd(Criterio c1, Criterio c2){
        this.c1 = c1;
        this.c2 = c2;
    }
    @Override
    public boolean cumple(Simple territorio) {
        return (c1.cumple(territorio) && c2.cumple(territorio));
    }
}
