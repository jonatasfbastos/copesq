/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.copesq.usuario.service;

import br.com.ifba.copesq.usuario.model.Usuario;

/**
 *
 * @author jaine
 */
public interface IServiceUsuario {
   //Salvar usuario
    public abstract Usuario saveUsuario(Usuario usuario);
}
