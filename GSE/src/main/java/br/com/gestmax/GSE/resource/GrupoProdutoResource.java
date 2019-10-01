package br.com.gestmax.GSE.resource;

import br.com.gestmax.GSE.domain.GrupoProduto;
import br.com.gestmax.GSE.dto.GrupoProdutoDTO;
import br.com.gestmax.GSE.service.GrupoProdutoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grupoProdutos")
public class GrupoProdutoResource extends BasicResource<GrupoProdutoService, GrupoProdutoDTO, GrupoProduto> {

    public GrupoProdutoResource() {
        super(GrupoProduto.class, GrupoProdutoDTO.class);
    }

}
