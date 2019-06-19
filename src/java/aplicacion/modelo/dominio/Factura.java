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
    private String apellidoComprador;
    private String nombreComprador;
    private Integer dNIComprador;
    private Set<Detalle> detalles;
    private double total;

    public Factura() {
    }

    public Factura(Integer codigoFactura, Date fechaFactura, Usuario vendedor, String apellidoComprador, String nombreComprador, Integer dNIComprador, Set<Detalle> detalles, double total) {
        this.codigoFactura = codigoFactura;
        this.fechaFactura = fechaFactura;
        this.vendedor = vendedor;
        this.apellidoComprador = apellidoComprador;
        this.nombreComprador = nombreComprador;
        this.dNIComprador = dNIComprador;
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
     * @return the apellidoComprador
     */
    public String getApellidoComprador() {
        return apellidoComprador;
    }

    /**
     * @param apellidoComprador the apellidoComprador to set
     */
    public void setApellidoComprador(String apellidoComprador) {
        this.apellidoComprador = apellidoComprador;
    }

    /**
     * @return the nombreComprador
     */
    public String getNombreComprador() {
        return nombreComprador;
    }

    /**
     * @param nombreComprador the nombreComprador to set
     */
    public void setNombreComprador(String nombreComprador) {
        this.nombreComprador = nombreComprador;
    }

    /**
     * @return the dNIComprador
     */
    public Integer getdNIComprador() {
        return dNIComprador;
    }

    /**
     * @param dNIComprador the dNIComprador to set
     */
    public void setdNIComprador(Integer dNIComprador) {
        this.dNIComprador = dNIComprador;
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
