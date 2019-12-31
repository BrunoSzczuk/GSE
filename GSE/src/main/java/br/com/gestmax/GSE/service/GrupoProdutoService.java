package br.com.gestmax.GSE.service;

import br.com.gestmax.GSE.domain.GrupoProduto;
import br.com.gestmax.GSE.dto.GrupoProdutoDTO;
import br.com.gestmax.GSE.repository.GrupoProdutoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class GrupoProdutoService extends BasicService<GrupoProduto, GrupoProdutoRepository, GrupoProdutoDTO> {

    public GrupoProdutoService() {
        super(GrupoProduto.class);
    }

    @Override
    public Page<GrupoProduto> search(String descricao, Integer page, Integer linesPerPage, String orderBy, String direction) {
        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);
        return repository.findDistinctByDsGrupoContainingOrCdGrupoContaining(descricao, descricao, pageRequest);
    }
}
