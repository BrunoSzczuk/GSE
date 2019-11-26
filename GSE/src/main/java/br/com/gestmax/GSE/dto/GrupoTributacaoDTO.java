package br.com.gestmax.GSE.dto;

import br.com.gestmax.GSE.domain.GrupoTributacao;
import br.com.gestmax.GSE.domain.ExcecaoFiscal;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Collection;

@Data
@NoArgsConstructor
public class GrupoTributacaoDTO extends BasicDTO<GrupoTributacao> {
    private Long id;
    @NotNull(message = "{grupoTributacao_dsGrupoTrib_not_null}")
    @Size(min = 1, max = 60, message = "{grupoTributacao_dsGrupoTrib_size}")
    private String dsGrupotrib;
    @JsonIgnore
    private Collection<ExcecaoFiscal> execaoFiscals;

    public GrupoTributacaoDTO(GrupoTributacao domain) {
        super(domain);
    }
}
