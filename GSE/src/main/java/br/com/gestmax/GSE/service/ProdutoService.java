package br.com.gestmax.GSE.service;

import br.com.gestmax.GSE.domain.Produto;
import br.com.gestmax.GSE.dto.ProdutoDTO;
import br.com.gestmax.GSE.repository.ProdutoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService extends BasicService<Produto, ProdutoRepository, ProdutoDTO> {

    public ProdutoService() {
        super(Produto.class);
    }

    @Override
    public Page<Produto> search(String descricao, Integer page, Integer linesPerPage, String orderBy, String direction) {
        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);
        return repository.findDistinctByDsProdutoContaining(descricao, pageRequest);
    }
}
