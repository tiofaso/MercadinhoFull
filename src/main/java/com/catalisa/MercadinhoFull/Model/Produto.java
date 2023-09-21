package com.catalisa.MercadinhoFull.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "tb_produto")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String nomeProduto;

    @Column(length = 250, nullable = false)
    private String descricaoProduto;

    @Column(nullable = false)
    private Long quantidadeProduto;

    @Column(nullable = false)
    private BigDecimal precoProduto;

    @Column(nullable = false)
    private Boolean statusProduto;
}
