package aseguradora.criterios;

import aseguradora.seguros.Simple;

public class ConcatenadorCriterios extends Criterio{

    Criterio[] criterios;

    public ConcatenadorCriterios(Criterio... criterio){
        this.criterios = criterio;
    }

    public boolean cumple(Simple seguro) {
        int i = 0;
        boolean cumpliendo = true;
        while ((this.criterios.length > i) && (cumpliendo)) {
            cumpliendo = criterios[i].cumple(seguro);
            i++;
        }
        return cumpliendo;
    }
}
