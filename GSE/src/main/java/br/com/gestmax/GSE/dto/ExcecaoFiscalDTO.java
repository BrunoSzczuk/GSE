package br.com.gestmax.GSE.dto;

import br.com.gestmax.GSE.domain.ExcecaoFiscal;
import br.com.gestmax.GSE.domain.Estado;
import br.com.gestmax.GSE.domain.Filial;
import br.com.gestmax.GSE.domain.GrupoTributacao;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class ExcecaoFiscalDTO extends BasicDTO<ExcecaoFiscal> {
    private Long id;
    private Integer nrSequencia;
    private String tpCliente;
    private BigDecimal pcIcmsinterno;
    private BigDecimal pcIcmsexterno;
    private BigDecimal pcMva;
    private BigDecimal pcIcmsdest;
    private BigDecimal vlPautaicms;
    private BigDecimal vlPautaipi;
    private BigDecimal vlPautapis;
    private BigDecimal vlPautacof;
    private BigDecimal vlPautaicmsproprio;
    private BigDecimal pcAliqipi;
    private BigDecimal pcAliqpis;
    private BigDecimal pcAliqcof;
    private BigDecimal pcRedbaseicms;
    private BigDecimal pcRedbaseipi;
    private BigDecimal pcRedbasecof;
    private BigDecimal pcRedbasepis;
    private Boolean stExcluido;
    private Filial filial;
    private GrupoTributacao grupoTributacao;
    private Estado estado;

    public ExcecaoFiscalDTO(ExcecaoFiscal domain) {
        super(domain);
    }
}
