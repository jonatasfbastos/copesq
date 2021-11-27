package br.com.ifba.copesq.infrastructure.service;

import br.com.ifba.copesq.projetopesquisa.model.ProjetoPesquisa;



public interface IFacade {
    
    //------------------- PROJETO PESQUISA -------------------------------//
    public abstract void saveProjetoPesquisa(ProjetoPesquisa projetoPesquisa);
 }