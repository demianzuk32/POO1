package com.mycompany.practicarecuperatorio;

public interface Vendible {

    void vender(int cantidad) throws StockInsuficienteException;

}
