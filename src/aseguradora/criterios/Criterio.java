package aseguradora.criterios;

import aseguradora.seguros.Seguro;
import aseguradora.seguros.Simple;

public abstract class Criterio {

    public abstract boolean cumple(Simple seguro);
}
