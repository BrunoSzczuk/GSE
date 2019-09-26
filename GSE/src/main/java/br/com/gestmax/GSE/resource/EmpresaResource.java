package br.com.gestmax.GSE.resource;

import br.com.gestmax.GSE.domain.Empresa;
import br.com.gestmax.GSE.dto.EmpresaDTO;
import br.com.gestmax.GSE.service.EmpresaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empresas")
public class EmpresaResource extends BasicResource<EmpresaService, EmpresaDTO, Empresa> {

    public EmpresaResource() {
        super(Empresa.class, EmpresaDTO.class);
    }

}
