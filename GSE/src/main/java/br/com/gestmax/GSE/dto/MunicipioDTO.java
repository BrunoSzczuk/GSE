package br.com.gestmax.GSE.dto;

import br.com.gestmax.GSE.domain.Estado;
import br.com.gestmax.GSE.domain.Filial;
import br.com.gestmax.GSE.domain.Municipio;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Collection;

@Data
@NoArgsConstructor
public class MunicipioDTO extends BasicDTO<Municipio> {
    private Long id;
    @NotNull(message = "{municipio_nmMunicipio_not_null}")
    @Size(min = 1, max = 60, message = "{municipio_nmMunicipio_size}")
    private String nmMunicipio;
    private Integer qtPopulacao;
    @NotNull(message = "{municipio_cdUfibge_not_null}")
    @Size(min = 1, max = 60, message = "{municipio_cdUfibge_size}")
    private String cdUfibge;
    @JsonIgnore
    private Collection<Filial> filials;
    @NotNull(message = "{municipio_estado_not_null}")
    private Estado estado;


    public MunicipioDTO(Municipio domain) {
        super(domain);
    }
}
