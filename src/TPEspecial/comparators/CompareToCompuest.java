package TPEspecial.comparators;

import TPEspecial.entidades.EntidadUniversitaria;


import java.util.Comparator;

public abstract class CompareToCompuest implements Comparator<EntidadUniversitaria> {
        protected final Comparator<EntidadUniversitaria> siguiente;

        public CompareToCompuest(Comparator<EntidadUniversitaria> siguiente) {
            this.siguiente = siguiente;
        }
    }

