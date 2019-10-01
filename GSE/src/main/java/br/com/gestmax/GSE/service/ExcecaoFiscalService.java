package br.com.gestmax.GSE.service;

import br.com.gestmax.GSE.domain.ExcecaoFiscal;
import br.com.gestmax.GSE.dto.ExcecaoFiscalDTO;
import br.com.gestmax.GSE.repository.ExcecaoFiscalRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class ExcecaoFiscalService extends BasicService<ExcecaoFiscal, ExcecaoFiscalRepository, ExcecaoFiscalDTO> {

    public ExcecaoFiscalService() {
        super(ExcecaoFiscal.class);
    }

    @Override
    public Page<ExcecaoFiscal> search(String descricao, Integer page, Integer linesPerPage, String orderBy, String direction) {
        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);
        return repository.findDistinctByTpClienteContaining(descricao, pageRequest);
    }
}
