package br.com.gestmax.GSE.dto;

import br.com.gestmax.GSE.domain.GrupoProduto;
import br.com.gestmax.GSE.domain.Filial;
import br.com.gestmax.GSE.domain.SubGrupoProduto;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Collection;

@Data
@NoArgsConstructor
public class GrupoProdutoDTO extends BasicDTO<GrupoProduto> {
    private Long id;
    @NotNull(message = "{grupoProduto_dsGrupo_not_null")
    @Size(min = 1, max = 60, message = "{grupoProduto_dsGrupo_size")
    private String dsGrupo;
    private Boolean stAtivo;
    @NotNull(message = "{grupoProduto_cdGrupo_not_null")
    @Size(min = 1, max = 30, message = "{grupoProduto_cdGrupo_size")
    private String cdGrupo;
    @NotNull(message = "{grupoProduto_filial_not_null}")
    private Filial filial;


    public GrupoProdutoDTO(GrupoProduto domain) {
        super(domain);
    }
}
