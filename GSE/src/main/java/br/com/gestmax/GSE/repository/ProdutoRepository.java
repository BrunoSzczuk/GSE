package br.com.gestmax.GSE.repository;

import br.com.gestmax.GSE.domain.Produto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    @Transactional(readOnly = true)
    Page<Produto> findDistinctByDsProdutoContaining(String dsProduto, Pageable pageRequest);
}
