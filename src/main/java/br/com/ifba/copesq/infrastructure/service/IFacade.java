package br.com.ifba.copesq.infrastructure.service;

import br.com.ifba.copesq.projetopesquisa.model.ProjetoPesquisa;
import br.com.ifba.copesq.usuario.model.Usuario;



public interface IFacade {
    
    //------------------- PROJETO PESQUISA -------------------------------//
    public abstract void saveProjetoPesquisa(ProjetoPesquisa projetoPesquisa);

    public void saveUsuario(Usuario usuario);
 }