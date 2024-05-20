package tpBosque;

import java.util.ArrayList;
import java.util.Scanner;

public class ReservaNatural {

    //Atributos
    private ArrayList<Habitat> habitats;
    private ArrayList<Cuidador> cuidadores;
    private ArrayList<Especie> especies;

    //Constructor
    public ReservaNatural() {
        Scanner scanner = new Scanner(System.in);
        especies = new ArrayList<>();
        scanner = new Scanner(System.in);

    }

    public ReservaNatural(ArrayList<Habitat> habitats, ArrayList<Cuidador> cuidadores, ArrayList<Especie> especies) {
        this.habitats = habitats;
        this.cuidadores = cuidadores;
        this.especies = especies;
    }

    //Metodos
    public void agregarEspecie() {//Agrega una especie

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la especie a agregar: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el tipo de la especie planta o animal: ");
        String tipo = scanner.nextLine();

        System.out.println("Ingrese la cantidad de especies en la reserva: ");
        Integer cantidad = scanner.nextInt();

        Especie especie = new Especie(nombre, tipo, cantidad);

        especies.add(especie);

        System.out.println("-----------------------------------------------");
        System.out.println("La especie " + especie.getNombre() + " del tipo "
                + especie.getTipo() + " y con " + especie.getCantidad()
                + " especimenes, fue agregada");

        System.out.println("------------------------------------------------");

    }

    public Especie buscarEspecie(String nombre) {

        for (Especie e : especies) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return e;

            }
        }

        return null;

    }

    public double calcularPromedio(String nombre) {

        double contador = 0;
        double cantidadEspecie;

        for (Especie e : especies) {
            contador += e.getCantidad();
        }

        for (Especie c : especies) {
            if (nombre.equalsIgnoreCase(c.getNombre())) {
                cantidadEspecie = c.getCantidad();

                double promedio;
                promedio = cantidadEspecie / contador;

                System.out.println(contador);

                return promedio;
            }
        }

        return 0;
    }

    public Double sueldoTotal() {
        Double sumaSueldos = 0.0;
        for (Cuidador e : cuidadores) {
            sumaSueldos += e.getSueldo();
        }

        return sumaSueldos;
    }

    public String toString() {
        String resultado = "Especies en la reserva: \n";
        for (Especie e : especies) {
            resultado += e.toString() + " " + especies.size() + " \n";
        }
        return resultado;
    }

    public void iniciarMenu() {
        Menu menu = new Menu(this); // Pasamos la instancia actual de ReservaNatural al constructor de Menu
        menu.mostrarMenu(); // Invocamos el método mostrarMenu() de la instancia de Menu
    }
}
