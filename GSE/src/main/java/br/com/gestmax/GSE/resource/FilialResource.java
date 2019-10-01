package br.com.gestmax.GSE.resource;

import br.com.gestmax.GSE.domain.Filial;
import br.com.gestmax.GSE.dto.FilialDTO;
import br.com.gestmax.GSE.service.FilialService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/filials")
public class FilialResource extends BasicResource<FilialService, FilialDTO, Filial> {

    public FilialResource() {
        super(Filial.class, FilialDTO.class);
    }

}
