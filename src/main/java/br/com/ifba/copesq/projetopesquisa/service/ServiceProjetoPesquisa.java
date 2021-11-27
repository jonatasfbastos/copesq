/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.copesq.projetopesquisa.service;

import br.com.ifba.copesq.projetopesquisa.dao.DaoProjetoPesquisa;
import br.com.ifba.copesq.projetopesquisa.dao.IDaoProjetoPesquisa;
import br.com.ifba.copesq.projetopesquisa.model.ProjetoPesquisa;

/**
 *
 * @author jonatasfbastos
 */
public class ServiceProjetoPesquisa implements IServiceProjetoPesquisa{
    
    private final IDaoProjetoPesquisa daoProjetoPesquisa = new DaoProjetoPesquisa();


    public void saveProjetoPesquisa(ProjetoPesquisa projetoPesquisa){
        // TODO: Fazer validação dos campos e lançar alguma exceção caso a validação não passe
        daoProjetoPesquisa.save(projetoPesquisa);  
    }
}
