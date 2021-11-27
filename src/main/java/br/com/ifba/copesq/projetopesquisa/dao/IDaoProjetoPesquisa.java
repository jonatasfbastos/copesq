/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.copesq.projetopesquisa.dao;

import br.com.ifba.copesq.projetopesquisa.model.ProjetoPesquisa;
import br.com.ifba.copesq.infrastructure.dao.IBaseDao;

/**
 *
 * @author jonatasfbastos
 */
public interface IDaoProjetoPesquisa extends IBaseDao<ProjetoPesquisa>{

    @Override
    public abstract ProjetoPesquisa save(ProjetoPesquisa projeto);
}
