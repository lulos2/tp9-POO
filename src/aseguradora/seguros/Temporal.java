package aseguradora.seguros;

import java.time.LocalDate;

public class Temporal extends Compuesto {

    private LocalDate inicio;
    private LocalDate fin;


    public Temporal(int dni, LocalDate fin) {
        super(dni);
        this.inicio = LocalDate.now();
        this.fin = fin;
    }

    @Override
    public double getMonto() {
        if(LocalDate.now().isAfter(this.fin))
            return super.getMonto();
        else {
            return 0;
        }
    }

}
