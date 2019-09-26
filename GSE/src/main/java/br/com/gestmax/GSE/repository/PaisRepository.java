package br.com.gestmax.GSE.repository;

import br.com.gestmax.GSE.domain.Pais;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Long> {
    @Transactional(readOnly = true)
    Page<Pais> findDistinctByNmPaisContaining(String nome, Pageable pageRequest);
}
