package com.burgostecnologia.crudproduto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.burgostecnologia.crudproduto.model.ProdutoModel;
import com.burgostecnologia.crudproduto.repository.ProdutoRepositoy;

@RestController
@RequestMapping("/api")
public class ProdutoController {

    @Autowired
    private ProdutoRepositoy produtorepository;

    @GetMapping
    public List<ProdutoModel> listar(){        
        return produtorepository.findAll();
    }

    @GetMapping("/{id}")
    public ProdutoModel produtoPorId(@PathVariable Long id){
        return produtorepository.findById(id).get();
    }

    @PostMapping
    public void salvar(@RequestBody ProdutoModel produto){
        produtorepository.save(produto);
    }

    @PutMapping
    public void alterar(@RequestBody ProdutoModel produto){
        if(produto.getId()>0){
            produtorepository.save(produto);
        }
    }

    @DeleteMapping
    public void deletar(@RequestBody ProdutoModel produto){
        produtorepository.delete(produto);
    }
}
