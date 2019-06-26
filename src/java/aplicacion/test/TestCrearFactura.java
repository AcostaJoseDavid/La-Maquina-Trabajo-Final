/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.hibernate.dao.IFacturaDAO;
import aplicacion.hibernate.dao.imp.FacturaDAOImp;
import aplicacion.modelo.dominio.Detalle;
import aplicacion.modelo.dominio.Factura;
import aplicacion.modelo.dominio.Producto;
import aplicacion.modelo.dominio.Usuario;
import java.util.Date;

/**
 *
 * @author Jose
 */
public class TestCrearFactura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Factura unaFactura=new Factura();
        unaFactura.setFechaFactura(new Date());
        unaFactura.setApellidoComprador("Acosta");
        unaFactura.setNombreComprador("Jose David");
        unaFactura.setdNIComprador(37920531);
        unaFactura.setVendedor(new Usuario("Toconas", "vendedor"));
        
        IFacturaDAO facturaDAO = new FacturaDAOImp();
        facturaDAO.create(unaFactura);
    }
    
}
