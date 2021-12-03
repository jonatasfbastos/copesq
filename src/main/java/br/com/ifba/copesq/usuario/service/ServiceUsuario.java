/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.copesq.usuario.service;

import br.com.ifba.copesq.infrastructure.exception.BusinessException;
import br.com.ifba.copesq.usuario.dao.DaoUsuario;
import br.com.ifba.copesq.usuario.dao.IDaoUsuario;
import br.com.ifba.copesq.usuario.model.Usuario;

/**
 *
 * @author jaine
 */
public class ServiceUsuario implements IServiceUsuario {

    //Mensagem de erro caso o usuario for null
    private final static String USUARIO_NULL = "O Usuario é nulo";

    //Mensagem de erro caso o usuario ja exixta
    private final static String USUARIO_EXIST = "Usuário ja existe";

    private final IDaoUsuario daoUsuario = new DaoUsuario();

    
    //Salva os dados do novo usuario
    @Override
    public Usuario saveUsuario(Usuario usuario) {
        if (usuario == null) {
            //Tratamento de exceção
            throw new BusinessException(USUARIO_NULL);
        } else if (daoUsuario.findById(usuario.getId()) != null) {
            throw new BusinessException(USUARIO_EXIST);
        } else {
            return daoUsuario.save(usuario);
        }
    }
}
