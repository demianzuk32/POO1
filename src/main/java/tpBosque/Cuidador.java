package tpBosque;

public class Cuidador {

    private String nombre;
    private int legajo;
    private Double sueldo;
    private Especie especie;

    //Constructor
    public Cuidador() {
    }

    public Cuidador(String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public Cuidador(String nombre, int legajo, Double sueldo) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.sueldo = sueldo;
    }

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public Double setSueldo(Double sueldo) {
        this.sueldo = sueldo;
        return sueldo;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

}
