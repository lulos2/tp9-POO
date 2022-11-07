package TPEspecial;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private String apellido;
    private int dni;
    private int edad;
    private ArrayList<String> interes;

    public Alumno(String nombre, String apellido, int dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.interes = new ArrayList<String>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void addInteres(String interes) {
        this.interes.add(interes);
    }

    public ArrayList<String> getInteres() {
        ArrayList<String> aux = new ArrayList<String>(this.interes);
        return aux;
    }

    public void setInteres(ArrayList<String> interes) {
        this.interes = interes;
    }

    public String toString(){
        return "Nombre " + this.getNombre() + " Apellido " + this.getApellido() + " Dni " + this.getDni() + " Edad " + this.getEdad() + " Intereses " + this.getInteres();
    }
}
