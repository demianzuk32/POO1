package com.mycompany.practicarecuperatorio;

import java.util.LinkedList;

public abstract class Producto implements Comparable<Producto> {

    //Atributos
    protected Integer codigo;
    protected String nombre;
    protected Double precio;
    protected int cantidadStock;

    //Constructores
    public Producto() {
    }

    public Producto(Integer codigo, String nombre, Double precio, int cantidadStock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }

    //Getters and Setters
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    //Metodos
    public static Producto buscarProductoPorNombre(LinkedList<Producto> inventario,
            String nombre) {

        for (Producto p : inventario) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }

        return null;
    }

    public String toString() {
        return "Codigo: " + codigo + ", Nombre: " + nombre + ",Precio: " + precio;
    }
    
    public int compareTo(Producto otro){
        return Double.compare(this.precio, otro.precio);
    }

}
