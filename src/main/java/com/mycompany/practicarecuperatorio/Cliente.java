package com.mycompany.practicarecuperatorio;

import java.util.ArrayList;

public class Cliente {

    //Atributos
    private Integer id;
    private String nombre;
    private ArrayList<Producto> listaDeComprados;

    //Constructores
    public Cliente() {
    }

    public Cliente(Integer id, String nombre) throws IdClienteInvalidoException {
        if (id <= 0) {
            throw new IdClienteInvalidoException("Id del cliente invalido: " + id);
        }
        this.id = id;
        this.nombre = nombre;
        this.listaDeComprados = new ArrayList<>();
    }

    //Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodos
    public void comprarProducto(Producto producto, int cantidad) throws StockInsuficienteException {
        if (producto instanceof Vendible) {
            ((Vendible) producto).vender(cantidad);
            for (int i = 0; i < cantidad; i++) {
                listaDeComprados.add(producto);
            }
        } else {
            throw new IllegalArgumentException("El producto no es vendible");
        }
    }

    public double calcularPromedioPrecios() {
        double suma = 0;
        for (Producto p : listaDeComprados) {
            suma += p.precio;
        }
        return listaDeComprados.isEmpty() ? 0 : suma / listaDeComprados.size();

    }

    public String toString() {
        return "Cliente{ "
                + ", id: " + id
                + ", nombre: "
                + nombre + " / "
                + ", Lista de Comprados: "
                + listaDeComprados + "}";
    }

}
