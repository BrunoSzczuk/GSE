package br.com.gestmax.GSE.resource;

import br.com.gestmax.GSE.domain.ImpostoPadraoPorFilial;
import br.com.gestmax.GSE.dto.ImpostoPadraoPorFilialDTO;
import br.com.gestmax.GSE.service.ImpostoPadraoPorFilialService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/impostoPadraoPorFilials")
public class ImpostoPadraoPorFilialResource extends BasicResource<ImpostoPadraoPorFilialService, ImpostoPadraoPorFilialDTO, ImpostoPadraoPorFilial> {

    public ImpostoPadraoPorFilialResource() {
        super(ImpostoPadraoPorFilial.class, ImpostoPadraoPorFilialDTO.class);
    }

}
