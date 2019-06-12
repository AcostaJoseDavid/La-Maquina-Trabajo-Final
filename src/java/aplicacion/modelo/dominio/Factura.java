/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.util.Date;
import java.util.Set;

/**
 *
 * @author Jose
 */
public class Factura {
    private Integer codigoFactura;
    private Date fechaFactura;
    private Usuario vendedor;
    private String comprador;
    private Set<Detalle> detalles;
    private double total;

    public Factura() {
    }

    public Factura(Integer codigoFactura, Date fechaFactura, Usuario vendedor, String comprador, Set<Detalle> detalles, double total) {
        this.codigoFactura = codigoFactura;
        this.fechaFactura = fechaFactura;
        this.vendedor = vendedor;
        this.comprador = comprador;
        this.detalles = detalles;
        this.total = total;
    }
    
    

    /**
     * @return the codigoFactura
     */
    public Integer getCodigoFactura() {
        return codigoFactura;
    }

    /**
     * @param codigoFactura the codigoFactura to set
     */
    public void setCodigoFactura(Integer codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    /**
     * @return the fechaFactura
     */
    public Date getFechaFactura() {
        return fechaFactura;
    }

    /**
     * @param fechaFactura the fechaFactura to set
     */
    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    /**
     * @return the vendedor
     */
    public Usuario getVendedor() {
        return vendedor;
    }

    /**
     * @param vendedor the vendedor to set
     */
    public void setVendedor(Usuario vendedor) {
        this.vendedor = vendedor;
    }

    /**
     * @return the comprador
     */
    public String getComprador() {
        return comprador;
    }

    /**
     * @param comprador the comprador to set
     */
    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    /**
     * @return the detalles
     */
    public Set<Detalle> getDetalles() {
        return detalles;
    }

    /**
     * @param detalles the detalles to set
     */
    public void setDetalles(Set<Detalle> detalles) {
        this.detalles = detalles;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }
    
}
