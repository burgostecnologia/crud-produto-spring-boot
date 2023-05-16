package com.burgostecnologia.crudproduto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.burgostecnologia.crudproduto.model.ProdutoModel;

public interface ProdutoRepositoy extends JpaRepository<ProdutoModel,Long> {

}
