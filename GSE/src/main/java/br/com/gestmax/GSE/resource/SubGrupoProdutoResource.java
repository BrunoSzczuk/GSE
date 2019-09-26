package br.com.gestmax.GSE.resource;

import br.com.gestmax.GSE.domain.SubGrupoProduto;
import br.com.gestmax.GSE.dto.SubGrupoProdutoDTO;
import br.com.gestmax.GSE.service.SubGrupoProdutoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subGrupoProdutos")
public class SubGrupoProdutoResource extends BasicResource<SubGrupoProdutoService, SubGrupoProdutoDTO, SubGrupoProduto> {

    public SubGrupoProdutoResource() {
        super(SubGrupoProduto.class, SubGrupoProdutoDTO.class);
    }

}
