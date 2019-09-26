package br.com.gestmax.GSE.dto;

import br.com.gestmax.GSE.domain.*;
import lombok.Data;

import java.util.Collection;

@Data
public class EstadoDTO extends BasicDTO<Estado> {
    private Long id;
    private String nmEstado;
    private String cdIbge;
    private String sgEstado;
    private Pais pais;
    private Collection<ExcecaoFiscal> excecaoFiscals;
    private Collection<ImpostoItem> impostoItems;
    private Collection<Municipio> municipios;
    private Collection<TabPreco> tabPrecos;

    public EstadoDTO(Estado domain) {
        super(domain);
    }
}
