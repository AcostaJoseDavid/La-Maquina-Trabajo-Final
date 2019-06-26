/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.hibernate.dao.IDetalleDAO;
import aplicacion.hibernate.dao.imp.DetalleDAOImp;
import aplicacion.modelo.dominio.Detalle;
import aplicacion.modelo.dominio.Producto;

/**
 *
 * @author Jose
 */
public class TestCreateDetalle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Detalle unDetalle= new Detalle();
        unDetalle.setProducto(new Producto("silla", 900));
        unDetalle.setCantidad(4);
        unDetalle.setPrecio(900);
        
        IDetalleDAO detalleDao=new DetalleDAOImp();
        detalleDao.create(unDetalle);
    }
    
}
