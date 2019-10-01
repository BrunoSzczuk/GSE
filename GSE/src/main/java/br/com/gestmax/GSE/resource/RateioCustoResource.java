package br.com.gestmax.GSE.resource;

import br.com.gestmax.GSE.domain.RateioCusto;
import br.com.gestmax.GSE.dto.RateioCustoDTO;
import br.com.gestmax.GSE.service.RateioCustoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rateioCustos")
public class RateioCustoResource extends BasicResource<RateioCustoService, RateioCustoDTO, RateioCusto> {

    public RateioCustoResource() {
        super(RateioCusto.class, RateioCustoDTO.class);
    }

}
