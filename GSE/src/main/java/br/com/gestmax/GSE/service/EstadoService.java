package br.com.gestmax.GSE.service;

import br.com.gestmax.GSE.domain.Estado;
import br.com.gestmax.GSE.dto.EstadoDTO;
import br.com.gestmax.GSE.repository.EstadoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class EstadoService extends BasicService<Estado, EstadoRepository, EstadoDTO> {

    public EstadoService() {
        super(Estado.class);
    }

    @Override
    public Page<Estado> search(String descricao, Integer page, Integer linesPerPage, String orderBy, String direction) {
        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);
        return repository.findDistinctByNmEstadoContaining(descricao, pageRequest);
    }
}
