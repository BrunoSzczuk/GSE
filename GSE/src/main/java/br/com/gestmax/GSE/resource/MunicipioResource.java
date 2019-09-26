package br.com.gestmax.GSE.resource;

import br.com.gestmax.GSE.domain.Municipio;
import br.com.gestmax.GSE.dto.MunicipioDTO;
import br.com.gestmax.GSE.service.MunicipioService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/municipios")
public class MunicipioResource extends BasicResource<MunicipioService, MunicipioDTO, Municipio> {

    public MunicipioResource() {
        super(Municipio.class, MunicipioDTO.class);
    }

}
