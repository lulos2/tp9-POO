package TPEspecial.entidades;

import java.util.ArrayList;

public class Grupo extends EntidadUniversitaria{

    private ArrayList<EntidadUniversitaria> entidades;

    public Grupo(){
        this.entidades = new ArrayList<EntidadUniversitaria>();
    }


    public void addEntidad(EntidadUniversitaria e) {
        this.entidades.add(e);
    }


    @Override
    public int getCant() {
       int result = 0;
        for (EntidadUniversitaria entidad : this.entidades) {
            result += entidad.getCant();
        }
        return result;
    }

    public String toString() {
        return this.entidades.toString();
    }
}
