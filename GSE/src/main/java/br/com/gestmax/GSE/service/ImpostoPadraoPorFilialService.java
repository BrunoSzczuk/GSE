package br.com.gestmax.GSE.service;

import br.com.gestmax.GSE.domain.ImpostoPadraoPorFilial;
import br.com.gestmax.GSE.dto.ImpostoPadraoPorFilialDTO;
import br.com.gestmax.GSE.repository.ImpostoPadraoPorFilialRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class ImpostoPadraoPorFilialService extends BasicService<ImpostoPadraoPorFilial, ImpostoPadraoPorFilialRepository, ImpostoPadraoPorFilialDTO> {

    public ImpostoPadraoPorFilialService() {
        super(ImpostoPadraoPorFilial.class);
    }

    @Override
    public Page<ImpostoPadraoPorFilial> search(String descricao, Integer page, Integer linesPerPage, String orderBy, String direction) {
        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);
        return repository.findAll(pageRequest);
    }
}
