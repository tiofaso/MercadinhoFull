package com.catalisa.MercadinhoFull.Controller;

import com.catalisa.MercadinhoFull.Model.Produto;
import com.catalisa.MercadinhoFull.Service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/mercadinhofull")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @PostMapping //Cadastra produto na base
    @ResponseStatus(HttpStatus.CREATED)
    @CrossOrigin(origins = "http://127.0.0.1:5500/")
    public ResponseEntity<Produto> cadastraProduto(@RequestBody Produto produto) {
        produto.setStatusProduto(Boolean.valueOf("true"));
        return ResponseEntity.ok(produtoService.cadastraProduto(produto));
    }

    @GetMapping //Lista todos produtos da base
    @CrossOrigin(origins = "http://127.0.0.1:5500/")
    public List<Produto> listarProdutos() {
        return produtoService.buscaTodosProdutos();
    }

}
