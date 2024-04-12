package tpBosque;

public class Habitat {

    //Atributos
    private String nombre;
    private float area;
    private Especie especie;

    //Constructor
    public Habitat(String nombre, float area, Especie especie) {
        this.nombre = nombre;
        this.area = area;
        this.especie = especie;
    }

    //Getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

}
