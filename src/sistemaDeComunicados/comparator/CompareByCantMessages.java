package sistemaDeComunicados.comparator;

import sistemaDeComunicados.entidad.Empleado;

import java.util.Comparator;

public class CompareByCantMessages implements Comparator<Empleado> {


    @Override
    public int compare(Empleado o1, Empleado o2) {
        return o1.cantMessages() - o2.cantMessages();
    }
}
