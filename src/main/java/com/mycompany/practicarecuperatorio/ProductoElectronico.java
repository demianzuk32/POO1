package com.mycompany.practicarecuperatorio;

public class ProductoElectronico extends Producto implements Vendible {

    //Atributos
    private Integer garantia;

    //Constructores
    public ProductoElectronico() {
    }

    public ProductoElectronico(Integer garantia, Integer codigo, String nombre,
            Double precio, Integer cantidadStock) {
        super(codigo, nombre, precio, cantidadStock);
        this.garantia = garantia;
    }

    //Getters and Setters
    public Integer getGarantia() {
        return garantia;
    }

    public void setGarantia(Integer garantia) {
        this.garantia = garantia;
    }

    //Metodos
    @Override
    public String toString() {
        return super.toString() + ", Garantia por: " + garantia + " meses";
    }

     @Override
    public void vender(int cantidad) throws StockInsuficienteException {
        if (cantidad > this.cantidadStock) {
            throw new StockInsuficienteException("Stock insuficiente para el producto: " + this.nombre);
        }
        this.cantidadStock -= cantidad;
    }

}
