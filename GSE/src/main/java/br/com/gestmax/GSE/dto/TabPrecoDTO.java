package br.com.gestmax.GSE.dto;

import br.com.gestmax.GSE.domain.*;
import br.com.gestmax.GSE.domain.enums.TipoCliente;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;

@Data
public class TabPrecoDTO extends BasicDTO<TabPreco> {
    private Long id;
    private String cdTabPreco;
    private String dsTabPreco;
    private Date dtVigencia;
    private Date dtVigenciaFim;
    private Integer kmDistancia;
    private BigDecimal pcComissao;
    private BigDecimal pcAcordo;
    private BigDecimal pcJuromes;
    private Integer nrDiaspagto;
    private Timestamp dtUltimaAtualizacao;
    private BigDecimal vlKm;
    private Boolean stAtualizar;
    private Boolean stExcluido;
    private Boolean stAtivo;
    private TipoCliente tpCliente;
    private Boolean stAtualizatotvs;
    private BigDecimal pcFreteTerrceiro;
    private BigDecimal pcPromotor;
    private Filial filial;
    private Estado estado;
    private RateioCusto rateioCusto;
    private Collection<TabPrecoItem> tabPrecoItems;

    public TabPrecoDTO(TabPreco domain) {
        super(domain);
    }
}
