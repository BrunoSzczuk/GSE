package br.com.gestmax.GSE.dto;

import br.com.gestmax.GSE.domain.Marca;
import br.com.gestmax.GSE.domain.Produto;
import br.com.gestmax.GSE.domain.RateioCustoItem;
import lombok.Data;

import java.util.Collection;

@Data
public class MarcaDTO extends BasicDTO<Marca> {
    private Long id;
    private String dsMarca;
    private String cdMarca;
    private Collection<Produto> produtos;
    private Collection<RateioCustoItem> rateioCustoItems;

    public MarcaDTO(Marca domain){
        super(domain);
    }
}
