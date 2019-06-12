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
    private Date fechaFactura;
    private Usuario usuario;
    private Usuario vendedor;
    private Set<Detalle> detalles;
    private String formaPago;
    private double total;
}
