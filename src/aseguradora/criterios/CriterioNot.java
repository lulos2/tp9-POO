package aseguradora.criterios;

import aseguradora.seguros.Simple;

public class CriterioNot extends Criterio{

    Criterio criterio;

    public CriterioNot(Criterio criterio){
        this.criterio = criterio;
    }
    public boolean cumple(Simple seguro){
        return (!criterio.cumple(seguro));
    }
}
