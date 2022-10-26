package aseguradora.criterios;

import aseguradora.seguros.Seguro;
import aseguradora.seguros.Simple;

public class CriterioOr extends Criterio{

    Criterio criterio1 , criterio2;

    public CriterioOr(Criterio c1, Criterio c2){
        this.criterio1 = c1;
        this.criterio2 = c2;
    }

    public boolean cumple(Simple seguro){
        return criterio1.cumple(seguro) || criterio2.cumple(seguro);
    }
}
