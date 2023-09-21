package com.catalisa.MercadinhoFull.Service;

import com.catalisa.MercadinhoFull.Model.Produto;
import com.catalisa.MercadinhoFull.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    //Método para cadastrar produto
    public Produto cadastraProduto(Produto produto) {
        return produtoRepository.save(produto);

    }

    //Método que lista produtos
    public List<Produto> buscaTodosProdutos() {
        return produtoRepository.findAll();
    }

    //Métoido que lista produto pelo id
    public Optional<Produto> buscaProdutoId(Long id){
        return produtoRepository.findById(id);
    }
}
