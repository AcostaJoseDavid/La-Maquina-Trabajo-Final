/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao;

import aplicacion.modelo.dominio.Usuario;

/**
 *
 * @author Diego
 */
public interface IUsuarioDAO { //extends IGenericDAO<Object, Object>
    void create(Usuario usuario);
}
