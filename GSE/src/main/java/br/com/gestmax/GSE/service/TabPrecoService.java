package br.com.gestmax.GSE.service;

import br.com.gestmax.GSE.domain.TabPreco;
import br.com.gestmax.GSE.dto.TabPrecoDTO;
import br.com.gestmax.GSE.repository.TabPrecoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class TabPrecoService extends BasicService<TabPreco, TabPrecoRepository, TabPrecoDTO> {

    public TabPrecoService() {
        super(TabPreco.class);
    }

    @Override
    public Page<TabPreco> search(String descricao, Integer page, Integer linesPerPage, String orderBy, String direction) {
        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);
        return repository.findDistinctByDsTabPrecoContaining(descricao, pageRequest);
    }
}
