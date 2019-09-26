package br.com.gestmax.GSE.resource;

import br.com.gestmax.GSE.domain.Marca;
import br.com.gestmax.GSE.dto.MarcaDTO;
import br.com.gestmax.GSE.service.MarcaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/marcas")
public class MarcaResource extends BasicResource<MarcaService, MarcaDTO, Marca> {

    public MarcaResource() {
        super(Marca.class, MarcaDTO.class);
    }

}
