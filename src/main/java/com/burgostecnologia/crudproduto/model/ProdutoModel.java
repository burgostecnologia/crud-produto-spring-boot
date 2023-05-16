package com.burgostecnologia.crudproduto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="TB_PRODUTO")
public class ProdutoModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; 

    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private int quantidade;
    @Column(nullable = false)
    private float valor;
    private String urlProduto;


    // public Long getId() {
    //     return id;
    // }
    // public void setId(Long id) {
    //     this.id = id;
    // }
    // public String getNome() {
    //     return nome;
    // }
    // public void setNome(String nome) {
    //     this.nome = nome;
    // }
    // public int getQuantidade() {
    //     return quantidade;
    // }
    // public void setQuantidade(int quantidade) {
    //     this.quantidade = quantidade;
    // }
    // public float getValor() {
    //     return valor;
    // }
    // public void setValor(float valor) {
    //     this.valor = valor;
    // }
    // public String getUrlProduto() {
    //     return urlProduto;
    // }
    // public void setUrlProduto(String urlProduto) {
    //     this.urlProduto = urlProduto;
    // }

    
}

