package br.com.gestmax.GSE.dto;

import br.com.gestmax.GSE.domain.Pais;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
public class PaisDTO extends BasicDTO<Pais> {
    private Long id;
    @NotNull(message = "{pais_nmPais_not_null}")
    @Size(min = 1, max = 60, message = "{pais_nmPais_size}")
    private String nmPais;
    @NotNull(message = "{pais_sgPais_not_null}")
    @Size(min = 1, max = 2, message = "{pais_sgPais_size}")
    private String sgPais;

    public PaisDTO(Pais domain) {
        super(domain);
    }
}
