package com.mycompany.practicarecuperatorio;

import java.util.LinkedList;
import java.util.ArrayList;

public class TestTienda {

    public static void main(String[] args) {
        // Crear inventario
        LinkedList<Producto> inventario = new LinkedList<>();

        // Agregar productos al inventario
        inventario.add(new ProductoElectronico(12, 4400, "Laptop", 100.0, 100));
        inventario.add(new ProductoElectronico(6, 6600, "Celular", 100.0, 100));
        inventario.add(new ProductoAccesorio("PC", 777, "Mouse", 50.0, 50));
        inventario.add(new ProductoAccesorio("PlayStation", 111, "Joystick", 20.0, 40));

        // Crear clientes
        ArrayList<Cliente> clientes = new ArrayList<>();
        try {
            clientes.add(new Cliente(1, "Alice"));
            clientes.add(new Cliente(2, "Bob"));
        } catch (IdClienteInvalidoException e) {
            System.out.println(e.getMessage());
        }

        // Simular ventas
        try {
            Cliente cliente1 = clientes.get(0);
            cliente1.comprarProducto(inventario.get(0), 2);
            cliente1.comprarProducto(inventario.get(2), 5);

            Cliente cliente2 = clientes.get(1);
            cliente2.comprarProducto(inventario.get(1), 1);
            cliente2.comprarProducto(inventario.get(3), 3);
        } catch (StockInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        // Listar inventario
        System.out.println("Inventario completo:");
        for (Producto producto : inventario) {
            System.out.println(producto);
        }

        // Mostrar promedio de compras hechas por los clientes
        for (Cliente cliente : clientes) {
            System.out.println("Promedio de compras de " + cliente.getNombre() + ": " + cliente.calcularPromedioPrecios());
        }

        // Buscar un producto
        Producto productoBuscado = Producto.buscarProductoPorNombre(inventario, "Laptop");
        System.out.println("Producto buscado: " + productoBuscado);
    }

}
