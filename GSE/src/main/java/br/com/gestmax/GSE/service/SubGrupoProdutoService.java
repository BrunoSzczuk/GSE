package br.com.gestmax.GSE.service;

import br.com.gestmax.GSE.domain.SubGrupoProduto;
import br.com.gestmax.GSE.dto.SubGrupoProdutoDTO;
import br.com.gestmax.GSE.repository.SubGrupoProdutoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class SubGrupoProdutoService extends BasicService<SubGrupoProduto, SubGrupoProdutoRepository, SubGrupoProdutoDTO> {
    public SubGrupoProdutoService() {
        super(SubGrupoProduto.class);
    }

    @Override
    public Page<SubGrupoProduto> search(String descricao, Integer page, Integer linesPerPage, String orderBy, String direction) {
        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);
        return repository.findDistinctByDsSubgrupoContaining(descricao, pageRequest);
    }
}
