package com.catalisa.MercadinhoFull.Repository;

import com.catalisa.MercadinhoFull.Model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
