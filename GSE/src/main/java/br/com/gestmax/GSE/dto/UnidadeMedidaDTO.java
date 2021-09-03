package br.com.gestmax.GSE.dto;

import br.com.gestmax.GSE.domain.Produto;
import br.com.gestmax.GSE.domain.UnidadeMedida;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@NoArgsConstructor
public class UnidadeMedidaDTO extends BasicDTO<UnidadeMedida> {
    private Long id;
    private String cdUnidadeMedida;
    private String dsUnidadeMedida;
    private Integer qtCasasDecimais;
    @JsonIgnore
    private Collection<Produto> produtos;


    public UnidadeMedidaDTO(UnidadeMedida domain) {
        super(domain);
    }
}
