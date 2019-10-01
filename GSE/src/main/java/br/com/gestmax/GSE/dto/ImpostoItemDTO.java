package br.com.gestmax.GSE.dto;

import br.com.gestmax.GSE.domain.Estado;
import br.com.gestmax.GSE.domain.Filial;
import br.com.gestmax.GSE.domain.ImpostoItem;
import br.com.gestmax.GSE.domain.Produto;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

@Data
public class ImpostoItemDTO extends BasicDTO<ImpostoItem> {
    private Long id;
    private BigDecimal vlPautaicms;
    private BigDecimal pcMva;
    private BigDecimal pcIpi;
    private BigDecimal vlPautaipi;
    private BigDecimal pcPis;
    private BigDecimal vlPautapis;
    private BigDecimal pcCofins;
    private BigDecimal vlPautacofins;
    private Boolean stLitro;
    private BigDecimal pcIcmsitem;
    private BigDecimal pcIcmsinter;
    private Timestamp dtAtualizacao;
    private Date dtValidaicms;
    private BigDecimal pcEstornoicms;
    private Date dtValidade;
    private String dsObservacao;
    private BigDecimal pcPreco;
    private BigDecimal pcReducaobcst;
    private BigDecimal pcFatorcestabasica;
    private BigDecimal pcMvasimples;
    private BigDecimal vlCfem;
    private BigDecimal pcCfem;
    private Filial filial;
    private Produto produto;
    private Estado estado;

    public ImpostoItemDTO(ImpostoItem domain) {
        super(domain);
    }
}
