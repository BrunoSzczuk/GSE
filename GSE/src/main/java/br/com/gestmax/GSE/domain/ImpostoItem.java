package br.com.gestmax.GSE.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Data
public class ImpostoItem implements BasicDomain{
    @Id
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
    @ManyToOne
    private Filial filial;
    @ManyToOne
    private Produto produto;
    @ManyToOne
    private Estado estado;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImpostoItem that = (ImpostoItem) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(vlPautaicms, that.vlPautaicms) &&
                Objects.equals(pcMva, that.pcMva) &&
                Objects.equals(pcIpi, that.pcIpi) &&
                Objects.equals(vlPautaipi, that.vlPautaipi) &&
                Objects.equals(pcPis, that.pcPis) &&
                Objects.equals(vlPautapis, that.vlPautapis) &&
                Objects.equals(pcCofins, that.pcCofins) &&
                Objects.equals(vlPautacofins, that.vlPautacofins) &&
                Objects.equals(stLitro, that.stLitro) &&
                Objects.equals(pcIcmsitem, that.pcIcmsitem) &&
                Objects.equals(pcIcmsinter, that.pcIcmsinter) &&
                Objects.equals(dtAtualizacao, that.dtAtualizacao) &&
                Objects.equals(dtValidaicms, that.dtValidaicms) &&
                Objects.equals(pcEstornoicms, that.pcEstornoicms) &&
                Objects.equals(dtValidade, that.dtValidade) &&
                Objects.equals(dsObservacao, that.dsObservacao) &&
                Objects.equals(pcPreco, that.pcPreco) &&
                Objects.equals(pcReducaobcst, that.pcReducaobcst) &&
                Objects.equals(pcFatorcestabasica, that.pcFatorcestabasica) &&
                Objects.equals(pcMvasimples, that.pcMvasimples) &&
                Objects.equals(vlCfem, that.vlCfem) &&
                Objects.equals(pcCfem, that.pcCfem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, vlPautaicms, pcMva, pcIpi, vlPautaipi, pcPis, vlPautapis, pcCofins, vlPautacofins, stLitro, pcIcmsitem, pcIcmsinter, dtAtualizacao, dtValidaicms, pcEstornoicms, dtValidade, dsObservacao, pcPreco, pcReducaobcst, pcFatorcestabasica, pcMvasimples, vlCfem, pcCfem);
    }


}
