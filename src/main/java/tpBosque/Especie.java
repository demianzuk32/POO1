package tpBosque;

public class Especie {

    //Atributos
    private String nombre;
    private String tipo;
    private int cantidad;
    private Habitat habitat;

    //Constructor
    public Especie() {
    }

    public Especie(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Especie(String nombre, String tipo, int cantidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }

    //Metodos
    public String toString() {
        int cantidadEspecies = 0;

        return "Especie: " + nombre + ", tipo: " + tipo;
    }

}
