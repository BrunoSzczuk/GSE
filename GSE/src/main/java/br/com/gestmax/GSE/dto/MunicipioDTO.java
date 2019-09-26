package br.com.gestmax.GSE.dto;

import br.com.gestmax.GSE.domain.Estado;
import br.com.gestmax.GSE.domain.Filial;
import br.com.gestmax.GSE.domain.Municipio;
import lombok.Data;

import java.util.Collection;

@Data
public class MunicipioDTO extends BasicDTO<Municipio> {
    private Long id;
    private String nmMunicipio;
    private Integer qtPopulacao;
    private String cdUfibge;
    private Collection<Filial> filials;
    private Estado estado;


    public MunicipioDTO(Municipio domain) {
        super(domain);
    }
}
