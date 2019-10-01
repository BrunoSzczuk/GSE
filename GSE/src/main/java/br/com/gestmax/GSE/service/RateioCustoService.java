package br.com.gestmax.GSE.service;

import br.com.gestmax.GSE.domain.RateioCusto;
import br.com.gestmax.GSE.dto.RateioCustoDTO;
import br.com.gestmax.GSE.repository.RateioCustoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class RateioCustoService extends BasicService<RateioCusto, RateioCustoRepository, RateioCustoDTO> {

    public RateioCustoService() {
        super(RateioCusto.class);
    }

    @Override
    public Page<RateioCusto> search(String descricao, Integer page, Integer linesPerPage, String orderBy, String direction) {
        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);
        return repository.findAll(pageRequest);
    }
}
