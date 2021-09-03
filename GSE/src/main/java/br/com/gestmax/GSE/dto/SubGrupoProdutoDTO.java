package br.com.gestmax.GSE.dto;

import br.com.gestmax.GSE.domain.Filial;
import br.com.gestmax.GSE.domain.GrupoProduto;
import br.com.gestmax.GSE.domain.Produto;
import br.com.gestmax.GSE.domain.SubGrupoProduto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@NoArgsConstructor
public class SubGrupoProdutoDTO extends BasicDTO<SubGrupoProduto> {
    private Long id;
    private String cdSubgrupo;
    private String dsSubgrupo;
    @JsonIgnore
    private Collection<Produto> produtos;
    private Filial filial;
    private GrupoProduto grupoProduto;

    public SubGrupoProdutoDTO(SubGrupoProduto domain) {
        super(domain);
    }

}
