/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.hibernate.dao.IProductoDAO;
import aplicacion.hibernate.dao.imp.ProductoDAOImp;

import aplicacion.modelo.dominio.Producto;

/**
 *
 * @author Jose
 */
public class TestCrearProducto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto unProducto = new Producto();
        unProducto.setNombreProducto("Mesa");
        unProducto.setPrecioProducto(2000);
        unProducto.setStock(200);
        unProducto.setEstadoProducto(Boolean.TRUE);
        
        IProductoDAO productoDAO =new ProductoDAOImp();
        productoDAO.create(unProducto);
    }
    
}
