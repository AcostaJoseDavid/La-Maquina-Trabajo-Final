/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.hibernate.dao.IUsuarioDAO;
import aplicacion.hibernate.dao.imp.UsuarioDAOImp;
import aplicacion.modelo.constantes.TipoUsuario;
import aplicacion.modelo.dominio.Usuario;

/**
 *
 * @author Jose
 */
public class TestCreateUsuario {
    public static void main(String[] args) {
        Usuario primerUsuario = new Usuario();
        primerUsuario.setApellidoUsuario("Rios");
        primerUsuario.setContraseñaUsuario("1234");
        primerUsuario.setEstadoUsuario(Boolean.TRUE);
        primerUsuario.setNombreUsuario("Diego");
        primerUsuario.setTipoUsuario(TipoUsuario.ADMIN);
        
        IUsuarioDAO usuarioDAO = new UsuarioDAOImp();
        usuarioDAO.create(primerUsuario);
    }
}
