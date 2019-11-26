package br.com.gestmax.GSE.dto;

import br.com.gestmax.GSE.domain.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Collection;

@Data
@NoArgsConstructor
public class EstadoDTO extends BasicDTO<Estado> {
    private Long id;
    @NotNull(message = "{estado_nome_not_null}")
    @Size(min = 3, max = 60, message = "{estado_nome_size}")
    private String nmEstado;
    @NotNull(message = "{estado_cdibge_not_null}")
    @Size(min = 3, message = "{estado_cdibge_size}")
    private String cdIbge;
    @Size(min = 1, max = 2, message = "{estado_sigla_size}")
    @NotNull(message = "{estado_sigla_not_null}")
    private String sgEstado;
    @NotNull(message = "{estado_pais_not_null}")
    private Pais pais;
    @JsonIgnore
    private Collection<ExcecaoFiscal> excecaoFiscals;
    @JsonIgnore
    private Collection<ImpostoItem> impostoItems;
    @JsonIgnore
    private Collection<Municipio> municipios;
    @JsonIgnore
    private Collection<TabPreco> tabPrecos;

    public EstadoDTO(Estado domain) {
        super(domain);
    }
}
