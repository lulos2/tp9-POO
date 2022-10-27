package aseguradora.criterios;

import aseguradora.seguros.Simple;

public class CriterioAnd extends Criterio{

    Criterio criterio1;
    Criterio criterio2;

    public CriterioAnd(Criterio c1, Criterio c2){
        this.criterio1 = c1;
        this.criterio2 = c2;
    }

    @Override
    public boolean cumple(Simple seguro) {
        return criterio1.cumple(seguro) && criterio2.cumple(seguro);
    }
}
