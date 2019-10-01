package br.com.gestmax.GSE.dto;

import br.com.gestmax.GSE.domain.GrupoTributacao;
import br.com.gestmax.GSE.domain.ExcecaoFiscal;
import lombok.Data;

import java.util.Collection;

@Data
public class GrupoTributacaoDTO extends BasicDTO<GrupoTributacao> {
    private Long id;
    private String dsGrupotrib;
    private Collection<ExcecaoFiscal> execaoFiscals;

    public GrupoTributacaoDTO(GrupoTributacao domain) {
        super(domain);
    }
}
