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
public class Producto {
    private Integer codigoProducto;
    private String nombreProducto;
    private Integer stock;
    private double precioProducto;
    private boolean estadoProducto;

    public Producto() {
    }

    public Producto(boolean estadoProducto, String nombreProducto, Integer stock, double precioProducto) {
        this.estadoProducto = estadoProducto;
        this.nombreProducto = nombreProducto;
        this.stock = stock;
        this.precioProducto = precioProducto;
    }

    public Producto(String nombreProducto, double precioProducto) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
    }

    
    /**
     * @return the codigoProducto
     */
    public Integer getCodigoProducto() {
        return codigoProducto;
    }

    /**
     * @param codigoProducto the codigoProducto to set
     */
    public void setCodigoProducto(Integer codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    /**
     * @return the nombreProducto
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * @param nombreProducto the nombreProducto to set
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    /**
     * @return the stock
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * @return the precioProducto
     */
    public double getPrecioProducto() {
        return precioProducto;
    }

    /**
     * @param precioProducto the precioProducto to set
     */
    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    /**
     * @return the estadoProducto
     */
    public boolean isEstadoProducto() {
        return estadoProducto;
    }

    /**
     * @param estadoProducto the estadoProducto to set
     */
    public void setEstadoProducto(boolean estadoProducto) {
        this.estadoProducto = estadoProducto;
    }
    
    
}
