package br.com.gestmax.GSE.dto;

import br.com.gestmax.GSE.domain.Filial;
import br.com.gestmax.GSE.domain.RateioCusto;
import br.com.gestmax.GSE.domain.RateioCustoItem;
import br.com.gestmax.GSE.domain.TabPreco;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Collection;

@Data
public class RateioCustoDTO extends BasicDTO<RateioCusto> {
    private Long id;
    private Date dtCompetencia;
    private BigDecimal vlRateio;
    private BigDecimal pcMargem;
    private BigDecimal vlKm;
    private BigDecimal pcJuromes;
    private Date dtIniconsulta;
    private Date dtFimconsulta;
    private Boolean stAtivo;
    private Date dtIniciovigencia;
    private Date dtFimvigencia;
    private Filial filial;
    private Collection<RateioCustoItem> rateioCustoItems;
    private Collection<TabPreco> tabPrecos;

    public RateioCustoDTO(RateioCusto domain) {
        super(domain);
    }
}
