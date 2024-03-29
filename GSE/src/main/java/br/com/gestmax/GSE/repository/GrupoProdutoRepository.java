package br.com.gestmax.GSE.repository;

import br.com.gestmax.GSE.domain.GrupoProduto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface GrupoProdutoRepository extends JpaRepository<GrupoProduto, Long> {
    @Transactional(readOnly = true)
    Page<GrupoProduto> findDistinctByDsGrupoContainingOrCdGrupoContaining(String nome, String nome2, Pageable pageRequest);
}
