package br.com.gestmax.GSE.service;

import br.com.gestmax.GSE.domain.UnidadeMedida;
import br.com.gestmax.GSE.dto.UnidadeMedidaDTO;
import br.com.gestmax.GSE.repository.UnidadeMedidaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class UnidadeMedidaService extends BasicService<UnidadeMedida, UnidadeMedidaRepository, UnidadeMedidaDTO> {

    public UnidadeMedidaService() {
        super(UnidadeMedida.class);
    }

    @Override
    public Page<UnidadeMedida> search(String descricao, Integer page, Integer linesPerPage, String orderBy, String direction) {
        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);
        return repository.findDistinctByDsUnidadeMedidaContaining(descricao, pageRequest);
    }
}
