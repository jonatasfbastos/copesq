/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.copesq.projetopesquisa.model;

import br.com.ifba.copesq.infrastructure.model.PersistenceEntity;
import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author jonatasfbastos
 */
@Entity
public class ProjetoPesquisa extends PersistenceEntity implements Serializable{
    private String titulo;
    private String areaConhecimento;
    private String justificativa;
    private String resumo;
    private String objetivoGeral;
    private String metodologia;
    private String fundamentacaoTeorica;
    private String palavrasChaves;
    private String referenciasBibliograficas;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAreaConhecimento() {
        return areaConhecimento;
    }

    public void setAreaConhecimento(String areaConhecimento) {
        this.areaConhecimento = areaConhecimento;
    }

    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getObjetivoGeral() {
        return objetivoGeral;
    }

    public void setObjetivoGeral(String objetivoGeral) {
        this.objetivoGeral = objetivoGeral;
    }

    public String getMetodologia() {
        return metodologia;
    }

    public void setMetodologia(String metodologia) {
        this.metodologia = metodologia;
    }

    public String getFundamentacaoTeorica() {
        return fundamentacaoTeorica;
    }

    public void setFundamentacaoTeorica(String fundamentacaoTeorica) {
        this.fundamentacaoTeorica = fundamentacaoTeorica;
    }

    public String getPalavrasChaves() {
        return palavrasChaves;
    }

    public void setPalavrasChaves(String palavrasChaves) {
        this.palavrasChaves = palavrasChaves;
    }

    public String getReferenciasBibliograficas() {
        return referenciasBibliograficas;
    }

    public void setReferenciasBibliograficas(String referenciasBibliograficas) {
        this.referenciasBibliograficas = referenciasBibliograficas;
    }
}
