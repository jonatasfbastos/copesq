/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.copesq.usuario.model;

import br.com.ifba.copesq.infrastructure.model.PersistenceEntity;
import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author rafael
 */
@Entity
public class Usuario extends PersistenceEntity implements Serializable {

    private String nome;
    private String login;
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
