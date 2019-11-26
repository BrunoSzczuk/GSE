package br.com.gestmax.GSE.dto;

import br.com.gestmax.GSE.domain.Filial;
import br.com.gestmax.GSE.domain.ImpostoPadraoPorFilial;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class ImpostoPadraoPorFilialDTO extends BasicDTO<ImpostoPadraoPorFilial> {
    private Long id;
    private BigDecimal pcIcmsinterno;
    private BigDecimal pcCsll;
    private BigDecimal pcIr;
    private BigDecimal pcIcmsexterno;
    private BigDecimal pcIcmsbeneficiofiscal;
    private Filial filial;

    public ImpostoPadraoPorFilialDTO(ImpostoPadraoPorFilial domain) {
        super(domain);
    }
}
