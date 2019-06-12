/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;


/**
 *
 * @author Jose
 */
public class Detalle {
    private int numeroFactura;
    private Integer cantidad;
    private String Producto;
    private double precio;
    private double subTotal;

    public Detalle() {
        
    }

    public Detalle(int numeroFactura, Integer cantidad, String Producto, double precio, double subTotal) {
        this.numeroFactura = numeroFactura;
        this.cantidad = cantidad;
        this.Producto = Producto;
        this.precio = precio;
        this.subTotal = subTotal;
    }
    
}
