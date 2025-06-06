/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatec.atendimentolocalhost.model.entities;

import java.io.Serializable;
import java.util.Objects;

/**
 * Classe de entidade para dados de Categoria de Veículo.
 * Não existe necessidade de validações para esta classe, uma vez que todos
 * os dados armazenados dela virão diretamente do Banco de Dados.
 * 
 * @author Fabio
 */
public class CategoriaVeiculo {
    
    private Integer id;
    private String descricao;
    
    public CategoriaVeiculo(){
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CategoriaVeiculo other = (CategoriaVeiculo) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return descricao;
    }        
}
