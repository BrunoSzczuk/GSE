package br.com.gestmax.GSE.service;

import br.com.gestmax.GSE.domain.Pais;
import br.com.gestmax.GSE.dto.PaisDTO;
import br.com.gestmax.GSE.repository.PaisRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class PaisService extends BasicService<Pais, PaisRepository, PaisDTO> {

    public PaisService() {
        super(Pais.class);
    }

    @Override
    @Cacheable(value = "tasks")
    public Page<Pais> search(String descricao, Integer page, Integer linesPerPage, String orderBy, String direction) {
        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);
        return repository.findDistinctByNmPaisContaining(descricao, pageRequest);
    }
}
