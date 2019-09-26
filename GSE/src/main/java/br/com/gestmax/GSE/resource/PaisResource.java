package br.com.gestmax.GSE.resource;

import br.com.gestmax.GSE.domain.Pais;
import br.com.gestmax.GSE.dto.PaisDTO;
import br.com.gestmax.GSE.service.PaisService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paises")
public class PaisResource extends BasicResource<PaisService, PaisDTO, Pais> {

    public PaisResource() {
        super(Pais.class, PaisDTO.class);
    }

}
