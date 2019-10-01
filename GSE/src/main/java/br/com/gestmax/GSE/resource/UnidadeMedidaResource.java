package br.com.gestmax.GSE.resource;

import br.com.gestmax.GSE.domain.UnidadeMedida;
import br.com.gestmax.GSE.dto.UnidadeMedidaDTO;
import br.com.gestmax.GSE.service.UnidadeMedidaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/unidadeMedidas")
public class UnidadeMedidaResource extends BasicResource<UnidadeMedidaService, UnidadeMedidaDTO, UnidadeMedida> {

    public UnidadeMedidaResource() {
        super(UnidadeMedida.class, UnidadeMedidaDTO.class);
    }

}
