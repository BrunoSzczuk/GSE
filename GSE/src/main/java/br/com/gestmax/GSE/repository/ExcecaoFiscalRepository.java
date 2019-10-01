package br.com.gestmax.GSE.repository;

import br.com.gestmax.GSE.domain.ExcecaoFiscal;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ExcecaoFiscalRepository extends JpaRepository<ExcecaoFiscal, Long> {
    @Transactional(readOnly = true)
    Page<ExcecaoFiscal> findDistinctByTpClienteContaining(String nome, Pageable pageRequest);
}
