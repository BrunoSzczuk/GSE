package br.com.gestmax.GSE.resource;

import br.com.gestmax.GSE.domain.Produto;
import br.com.gestmax.GSE.dto.ProdutoDTO;
import br.com.gestmax.GSE.service.ProdutoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoResource extends BasicResource<ProdutoService, ProdutoDTO, Produto> {

    public ProdutoResource() {
        super(Produto.class, ProdutoDTO.class);
    }
}
