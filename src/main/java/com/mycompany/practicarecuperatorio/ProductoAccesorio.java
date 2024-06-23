package com.mycompany.practicarecuperatorio;

public class ProductoAccesorio extends Producto implements Vendible {

    //Atributos
    private String compatibleCon;

    //Constructores
    public ProductoAccesorio() {
    }

    public ProductoAccesorio(String compatibleCon, Integer codigo, String nombre,
            Double precio, Integer cantidadStock) {
        super(codigo, nombre, precio, cantidadStock);
        this.compatibleCon = compatibleCon;
    }

    //Getters and Setters
    public String getCompatibleCon() {
        return compatibleCon;
    }

    public void setCompatibleCon(String compatibleCon) {
        this.compatibleCon = compatibleCon;
    }

    //Metodos
    @Override
    public String toString() {
        return super.toString() + ", Compatible con: " + compatibleCon;
    }

    @Override
    public void vender(int cantidad) throws StockInsuficienteException {
        if (cantidad > this.cantidadStock) {
            throw new StockInsuficienteException("Stock insuficiente para el producto: " + this.nombre);
        }
        this.cantidadStock -= cantidad;
    }

}
