package br.com.gestmax.GSE.resource;

import br.com.gestmax.GSE.domain.TabPreco;
import br.com.gestmax.GSE.dto.TabPrecoDTO;
import br.com.gestmax.GSE.service.TabPrecoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tabPrecos")
public class TabPrecoResource extends BasicResource<TabPrecoService, TabPrecoDTO, TabPreco> {

    public TabPrecoResource() {
        super(TabPreco.class, TabPrecoDTO.class);
    }

}
