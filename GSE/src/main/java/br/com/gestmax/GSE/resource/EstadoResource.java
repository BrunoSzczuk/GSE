package br.com.gestmax.GSE.resource;

import br.com.gestmax.GSE.domain.Estado;
import br.com.gestmax.GSE.dto.EstadoDTO;
import br.com.gestmax.GSE.service.EstadoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estados")
public class EstadoResource extends BasicResource<EstadoService, EstadoDTO, Estado> {

    public EstadoResource() {
        super(Estado.class, EstadoDTO.class);
    }

}
