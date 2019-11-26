package br.com.gestmax.GSE.dto;

import br.com.gestmax.GSE.domain.Marca;
import br.com.gestmax.GSE.domain.Produto;
import br.com.gestmax.GSE.domain.RateioCustoItem;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Collection;

@Data
@NoArgsConstructor
public class MarcaDTO extends BasicDTO<Marca> {
    private Long id;
    @NotNull(message = "{marca_dsMarca_not_null}")
    @Size(min = 1, max = 60, message = "{marca_dsMarca_size}")
    private String dsMarca;
    @NotNull(message = "{marca_cdMarca_not_null}")
    @Size(min = 1, max = 30, message = "{marca_cdMarca_size}")
    private String cdMarca;
    @JsonIgnore
    private Collection<Produto> produtos;
    @JsonIgnore
    private Collection<RateioCustoItem> rateioCustoItems;

    public MarcaDTO(Marca domain) {
        super(domain);
    }
}
