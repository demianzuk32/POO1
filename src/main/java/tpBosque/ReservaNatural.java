package tpBosque;

import java.util.Scanner;

public class ReservaNatural {

    //Atributos
    private Especie especie;
    private Cuidador cuidador;
    private Habitat habitat;

    //Constructor
    public ReservaNatural() {
    }

    public ReservaNatural(Especie especie, Cuidador cuidador, Habitat habitat) {
        this.especie = especie;
        this.cuidador = cuidador;
        this.habitat = habitat;
    }

    //Metodos
    public void agregarEspecie(Especie especie) {

        System.out.println("Se agrego la especie: " + especie.getNombre());

    }

    public int buscarEspecie(String nombre) {
        
        

    }

}
