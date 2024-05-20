package tpBosque;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//        //Crea una instancia de reserva natural
//        ReservaNatural reserva = new ReservaNatural();
        //Crea el Array de Cuidadores
        ArrayList<Cuidador> cuidadores = new ArrayList<>();

        //Crea el Array de Habitats
        ArrayList<Habitat> habitats = new ArrayList<>();

        //Crea el Array de Especies
        ArrayList<Especie> especies = new ArrayList<>();

        //Agrega cuidadores a la reserva
        cuidadores.add(new Cuidador("Juan", 001, 250.0));
        cuidadores.add(new Cuidador("Diego", 010, 300.0));
        cuidadores.add(new Cuidador("Valentina", 011, 300.0));
        cuidadores.add(new Cuidador("Rodrigo", 100, 200.0));

        //Agrega un habitat a la reserva
        habitats.add(new Habitat("Selva", 100));
        habitats.add(new Habitat("Acuario", 50));

        //Agrega una especie a la reserva
        especies.add(new Especie("leon", "Animal", 5));
        especies.add(new Especie("gato", "Animal", 10));
        especies.add(new Especie("mono", "Animal", 15));

        //Crea una reserva con los objetos fabricados
        ReservaNatural reserva = new ReservaNatural(habitats, cuidadores, especies);

        

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
