package br.com.gestmax.GSE.dto;

import br.com.gestmax.GSE.domain.Estado;
import br.com.gestmax.GSE.domain.Pais;
import lombok.Data;

import java.util.Collection;

@Data
public class PaisDTO extends BasicDTO<Pais> {
    private Long id;
    private String nmPais;
    private String sgPais;
    private Collection<Estado> estados;

    public PaisDTO(Pais domain) {
        super(domain);
    }
}
