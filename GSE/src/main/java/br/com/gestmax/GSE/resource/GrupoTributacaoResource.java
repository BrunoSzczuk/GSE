package br.com.gestmax.GSE.resource;

import br.com.gestmax.GSE.domain.GrupoTributacao;
import br.com.gestmax.GSE.dto.GrupoTributacaoDTO;
import br.com.gestmax.GSE.service.GrupoTributacaoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grupoTributacaos")
public class GrupoTributacaoResource extends BasicResource<GrupoTributacaoService, GrupoTributacaoDTO, GrupoTributacao> {

    public GrupoTributacaoResource() {
        super(GrupoTributacao.class, GrupoTributacaoDTO.class);
    }

}
