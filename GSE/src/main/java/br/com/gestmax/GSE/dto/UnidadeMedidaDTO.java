package br.com.gestmax.GSE.dto;

import br.com.gestmax.GSE.domain.Produto;
import br.com.gestmax.GSE.domain.UnidadeMedida;
import lombok.Data;

import java.util.Collection;

@Data
public class UnidadeMedidaDTO extends BasicDTO<UnidadeMedida> {
    private Long id;
    private String cdUnidadeMedida;
    private String dsUnidadeMedida;
    private Integer qtCasasDecimais;
    private Collection<Produto> produtos;


    public UnidadeMedidaDTO(UnidadeMedida domain) {
        super(domain);
    }
}
