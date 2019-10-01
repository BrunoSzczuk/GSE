package br.com.gestmax.GSE.repository;

import br.com.gestmax.GSE.domain.UnidadeMedida;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UnidadeMedidaRepository extends JpaRepository<UnidadeMedida, Long> {
    @Transactional(readOnly = true)
    Page<UnidadeMedida> findDistinctByDsUnidadeMedidaContaining(String nome, Pageable pageRequest);
}
