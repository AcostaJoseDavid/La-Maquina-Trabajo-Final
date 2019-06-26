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
    
    private Integer codigoDetalle;
    private Integer cantidad;
    private Producto producto;
    private double precio;

    public Detalle() {
    }

    public Detalle(Integer codigoDetalle, Integer cantidad, Producto producto, double precio) {
        this.codigoDetalle = codigoDetalle;
        this.cantidad = cantidad;
        this.producto = producto;
        this.precio = precio;
    }

    public Detalle(Integer cantidad, Producto producto, double precio) {
        this.cantidad = cantidad;
        this.producto = producto;
        this.precio = precio;
    }

    
    /**
     * @return the codigoDetalle
     */
    public Integer getCodigoDetalle() {
        return codigoDetalle;
    }

    /**
     * @param codigoDetalle the codigoDetalle to set
     */
    public void setCodigoDetalle(Integer codigoDetalle) {
        this.codigoDetalle = codigoDetalle;
    }

    /**
     * @return the cantidad
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the producto
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
