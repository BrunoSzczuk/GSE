package br.com.gestmax.GSE.resource;

import br.com.gestmax.GSE.domain.ExcecaoFiscal;
import br.com.gestmax.GSE.dto.ExcecaoFiscalDTO;
import br.com.gestmax.GSE.service.ExcecaoFiscalService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/execaoFiscals")
public class ExcecaoFiscalResource extends BasicResource<ExcecaoFiscalService, ExcecaoFiscalDTO, ExcecaoFiscal> {

    public ExcecaoFiscalResource() {
        super(ExcecaoFiscal.class, ExcecaoFiscalDTO.class);
    }

}
