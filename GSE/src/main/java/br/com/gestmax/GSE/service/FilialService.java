package br.com.gestmax.GSE.service;

import br.com.gestmax.GSE.domain.Filial;
import br.com.gestmax.GSE.dto.FilialDTO;
import br.com.gestmax.GSE.repository.FilialRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class FilialService extends BasicService<Filial, FilialRepository, FilialDTO> {

    public FilialService() {
        super(Filial.class);
    }

    @Override
    public Page<Filial> search(String descricao, Integer page, Integer linesPerPage, String orderBy, String direction) {
        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);
        return repository.findDistinctByNmRazaoSocialContaining(descricao, pageRequest);
    }
}
