package tpBosque;

import java.util.Scanner;
import java.util.ArrayList;

public class Menu {

    private ReservaNatural reserva;
    private Scanner scanner;
    private ArrayList<Especie> especies;

    public Menu(ReservaNatural reserva) {
        this.reserva = reserva;
        Scanner scanner = new Scanner(System.in);
        this.scanner = scanner;

    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("Menu:");
            System.out.println("1. Agregar especie");
            System.out.println("2. Buscar especie");
            System.out.println("3. Calcular Promedio");
            System.out.println("4. Calcular sueldo total de cuidadores");
            System.out.println("5. Mostrar especies en la reserva");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    reserva.agregarEspecie();
                    break;

                case 2:
                    System.out.print("Ingrese el nombre de la especie a buscar: ");
                    String nombreEspecie = scanner.nextLine();
                    Especie especieEncontrada = reserva.buscarEspecie(nombreEspecie);
                    if (especieEncontrada != null) {
                        System.out.println("La especie " + nombreEspecie + " se encuentra "
                                + "en la reserva y tiene " + especieEncontrada.getCantidad() + " especimenes");
                        System.out.println("-------------------------------------------");
                    } else {
                        System.out.println("La especie " + nombreEspecie + " no se encuentra en la reserva");
                        System.out.println("-------------------------------------------");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el nombre de la especie a calcular: ");
                    String especieCalcular = scanner.nextLine();

                    double especieCalculada = reserva.calcularPromedio(especieCalcular);
                    System.out.println("El promedio de " + especieCalcular + " en la reserva es: " + especieCalculada);

                    break;

                case 4:
                    Double sumaSueldos = reserva.sueldoTotal();
                    System.out.println("El sueldo total de los Cuidadores es: " + sumaSueldos);
                    break;

                case 5:
                    String especiesEnLaReserva = reserva.toString();
                    System.out.println(especiesEnLaReserva);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
        } while (opcion != 0);
    }

}
