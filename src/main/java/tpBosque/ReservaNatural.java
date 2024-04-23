package tpBosque;

import java.util.ArrayList;
import java.util.Scanner;

public class ReservaNatural {

    //Atributos
    private ArrayList<Habitat> habitats;
    private ArrayList<Especie> especies;
    private ArrayList<Cuidador> cuidadores;
    private Scanner scanner;

    //Constructor
    public ReservaNatural() {
        especies = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public ReservaNatural(ArrayList<Habitat> habitats, ArrayList<Especie> especies,
            ArrayList<Cuidador> cuidadores) {
        this.habitats = habitats;
        this.especies = especies;
        this.cuidadores = cuidadores;
    }

    //Metodos
    public void agregarEspecie() {//Agrega una especie

        System.out.println("Ingrese el nombre de la especie a agregar: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el tipo de la especie planta o animal: ");
        String tipo = scanner.nextLine();

        Especie especie = new Especie(nombre, tipo);

        especies.add(especie);

        System.out.println("-----------------------------------------------");
        System.out.println("La especie " + especie.getNombre() + " del tipo "
                + especie.getTipo() + " fue agregada");
        System.out.println("------------------------------------------------");

    }

    public int buscarEspecie(String nombre) {
        int cantidad = 0;

        for (Especie e : especies) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                cantidad++;
            }
        }

//        System.out.println("La especie " + nombre + " tiene " + cantidad);
//        System.out.println("El array tiene: " + especies.size());
        return cantidad;

    }

    public void calcularPromedio() {

    }

    public void sueldoTotal() {

    }

    public void iniciarMenu() {
        Menu menu = new Menu(this); // Pasamos la instancia actual de ReservaNatural al constructor de Menu
        menu.mostrarMenu(); // Invocamos el método mostrarMenu() de la instancia de Menu
    }
}
