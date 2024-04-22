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

        System.out.println("La especie " + especie.getNombre() + " del tipo "
                + especie.getTipo() + " fue agregada");

    }

    public int buscarEspecie(String nombre) {
        int cantidad = 0;

        for (Especie e : especies) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                cantidad = e.getCantidad();
                break; // Romper el bucle una vez que se encuentra la especie
            }
        }
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

    public static void main(String[] args) {
        
        //Crea una instancia de reserva natural
        ReservaNatural reserva = new ReservaNatural();
        
        Menu menu = new Menu(reserva);
        menu.mostrarMenu();
        

        //Crea una instancia de especie
        Especie especie = new Especie("Tigre", "Felino");

        //Agregar la especie a la reserva
        reserva.agregarEspecie();
    }

}
