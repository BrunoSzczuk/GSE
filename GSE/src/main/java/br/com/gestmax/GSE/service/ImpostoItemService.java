package br.com.gestmax.GSE.service;

import br.com.gestmax.GSE.domain.ImpostoItem;
import br.com.gestmax.GSE.dto.ImpostoItemDTO;
import br.com.gestmax.GSE.repository.ImpostoItemRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class ImpostoItemService extends BasicService<ImpostoItem, ImpostoItemRepository, ImpostoItemDTO> {

    public ImpostoItemService() {
        super(ImpostoItem.class);
    }

    @Override
    public Page<ImpostoItem> search(String descricao, Integer page, Integer linesPerPage, String orderBy, String direction) {
        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);
        return repository.findAll(pageRequest);
    }
}
