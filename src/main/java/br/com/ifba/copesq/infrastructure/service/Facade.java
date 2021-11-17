package br.com.ifba.copesq.infrastructure.service;


import br.com.ifba.copesq.projetopesquisa.model.ProjetoPesquisa;
import br.com.ifba.copesq.projetopesquisa.service.IServiceProjetoPesquisa;
import br.com.ifba.copesq.projetopesquisa.service.ServiceProjetoPesquisa;


public class Facade implements IFacade {
    //------------------- PROJETO PESQUISA -------------------------------//
     
    public IServiceProjetoPesquisa iProjetoPesquisa = new ServiceProjetoPesquisa();
    
    public void saveProjetoPesquisa(ProjetoPesquisa projetoPesquisa){
        iProjetoPesquisa.saveProjetoPesquisa(projetoPesquisa);
    }

    
}