package br.com.ifba.copesq.infrastructure.service;


import br.com.ifba.copesq.projetopesquisa.model.ProjetoPesquisa;
import br.com.ifba.copesq.projetopesquisa.service.IServiceProjetoPesquisa;
import br.com.ifba.copesq.projetopesquisa.service.ServiceProjetoPesquisa;
import br.com.ifba.copesq.usuario.model.Usuario;


public class Facade implements IFacade {
    //------------------- PROJETO PESQUISA -------------------------------//
     
    public IServiceProjetoPesquisa iProjetoPesquisa = new ServiceProjetoPesquisa();
    
    @Override
    public void saveProjetoPesquisa(ProjetoPesquisa projetoPesquisa){
        iProjetoPesquisa.saveProjetoPesquisa(projetoPesquisa);
    }

    @Override
    public void saveUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}