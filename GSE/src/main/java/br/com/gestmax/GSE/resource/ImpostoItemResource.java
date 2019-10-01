package br.com.gestmax.GSE.resource;

import br.com.gestmax.GSE.domain.ImpostoItem;
import br.com.gestmax.GSE.dto.ImpostoItemDTO;
import br.com.gestmax.GSE.service.ImpostoItemService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/impostoItems")
public class ImpostoItemResource extends BasicResource<ImpostoItemService, ImpostoItemDTO, ImpostoItem> {

    public ImpostoItemResource() {
        super(ImpostoItem.class, ImpostoItemDTO.class);
    }

}
