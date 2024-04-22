package tpBosque;

import java.util.Scanner;

public class Menu {

    private ReservaNatural reserva;
    private Scanner scanner;

    public Menu(ReservaNatural reserva) {
        this.reserva = reserva;
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Agregar especie");
            System.out.println("2. Buscar especie");
            System.out.println("3. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    reserva.agregarEspecie();
                    break;
                case 2:
                    System.out.print("Ingrese el nombre de la especie a buscar: ");
                    String nombreEspecie = scanner.nextLine();
                    int cantidad = reserva.buscarEspecie(nombreEspecie);
                    System.out.println("La cantidad de " + nombreEspecie + " en la reserva es: " + cantidad);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
        } while (opcion != 3);
    }

}
