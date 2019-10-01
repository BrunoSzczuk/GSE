package br.com.gestmax.GSE.dto;

import br.com.gestmax.GSE.domain.GrupoProduto;
import br.com.gestmax.GSE.domain.Filial;
import br.com.gestmax.GSE.domain.SubGrupoProduto;
import lombok.Data;

import java.util.Collection;

@Data
public class GrupoProdutoDTO extends BasicDTO<GrupoProduto> {
    private Long id;
    private String dsGrupo;
    private Boolean stAtivo;
    private String cdGrupo;
    private Filial filial;
    private Collection<SubGrupoProduto> subGrupoProduto;


    public GrupoProdutoDTO(GrupoProduto domain) {
        super(domain);
    }
}
