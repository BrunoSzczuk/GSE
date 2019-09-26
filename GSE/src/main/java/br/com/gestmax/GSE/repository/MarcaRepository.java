package br.com.gestmax.GSE.repository;

import br.com.gestmax.GSE.domain.Marca;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Long> {
    @Transactional(readOnly = true)
    Page<Marca> findDistinctByDsMarcaContaining(String nome, Pageable pageRequest);
}
