package tpBosque;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Crea una instancia de reserva natural
        ReservaNatural reserva = new ReservaNatural();
        Menu menu = new Menu(reserva);
        reserva.iniciarMenu();

//        //Crea una instancia de Scanner
//        Scanner scanner = new Scanner(System.in);
//
//        reserva.agregarEspecie();
//        reserva.agregarEspecie();
//        reserva.agregarEspecie();
//        reserva.agregarEspecie();
//
//        System.out.println("Ingrese el nombre de la especie a buscar: ");
//        String nombre = scanner.nextLine();
//
//        reserva.buscarEspecie(nombre);
//        

    }

}
