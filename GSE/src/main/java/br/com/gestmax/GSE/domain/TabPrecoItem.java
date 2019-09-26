package br.com.gestmax.GSE.domain;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Data
public class TabPrecoItem {
    @Id
    private Integer id;
    private Integer nrItem;
    private BigDecimal vlPreco;
    private BigDecimal vlPrecominimo;
    private Date dtVigencia;
    private Timestamp dtUltimaatualizacao;
    private BigDecimal vlNovoprecoreferencia;
    private BigDecimal vlIcmsstprecovenda;
    private BigDecimal vlCustototalrateio;
    private BigDecimal vlPrecobaserateio;
    private BigDecimal vlPrecosugerido;
    private BigDecimal pcMargemfinal;
    private BigDecimal vlLucrofinal;
    private BigDecimal vlLucrodesejado;
    private BigDecimal pcVariacaolucro;
    private BigDecimal vlLucroprecobase;
    private BigDecimal vlBasetotal;
    private BigDecimal vlFrete;
    private BigDecimal pcFrete;
    private BigDecimal pcFretepmz;
    private BigDecimal vlPromotoria;
    private BigDecimal vlTransporteterceiro;
    private BigDecimal vlComissao;
    private BigDecimal vlAcordo;
    private BigDecimal vlJuro;
    private BigDecimal vlTotalproduto;
    private BigDecimal pcIcmsst;
    private BigDecimal pcIcmsinterestadual;
    private BigDecimal vlIcms;
    private BigDecimal pcIcms;
    private BigDecimal vlIcmssugerido;
    private BigDecimal pcIcmssugerido;
    private BigDecimal pcIcmsnormal;
    private BigDecimal vlBaseicmsst;
    private BigDecimal vlIcmsst;
    private BigDecimal pcPis;
    private BigDecimal vlPis;
    private BigDecimal pcPissugerido;
    private BigDecimal vlCofins;
    private BigDecimal pcCofins;
    private BigDecimal pcCofinssugerido;
    private BigDecimal vlIrpj;
    private BigDecimal vlCsll;
    private BigDecimal vlDespcomercial;
    private BigDecimal vlTotalimposto;
    private BigDecimal vlPreconfunit;
    private BigDecimal vlPrecost;
    private BigDecimal vlPrecoipi;
    private BigDecimal vlPrecofinalunit;
    private BigDecimal vlTotalgeranf;
    private BigDecimal pcCsll;
    private BigDecimal pcIr;
    private BigDecimal pcMarkup;
    private BigDecimal vlPissugerido;
    private BigDecimal vlCofinssugerido;
    private BigDecimal pcIcmsestorno;
    private BigDecimal vlCustomediorateio;
    private BigDecimal vlDespesarateio;
    private BigDecimal vlRateiopadrao;
    private BigDecimal vlPrecofinalsimples;
    private BigDecimal pcCfem;
    private BigDecimal vlCfem;
    @ManyToOne
    private Filial filial;
    @ManyToOne
    private TabPreco tabPreco;
    @ManyToOne
    private Produto produto;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TabPrecoItem that = (TabPrecoItem) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(nrItem, that.nrItem) &&
                Objects.equals(vlPreco, that.vlPreco) &&
                Objects.equals(vlPrecominimo, that.vlPrecominimo) &&
                Objects.equals(dtVigencia, that.dtVigencia) &&
                Objects.equals(dtUltimaatualizacao, that.dtUltimaatualizacao) &&
                Objects.equals(vlNovoprecoreferencia, that.vlNovoprecoreferencia) &&
                Objects.equals(vlIcmsstprecovenda, that.vlIcmsstprecovenda) &&
                Objects.equals(vlCustototalrateio, that.vlCustototalrateio) &&
                Objects.equals(vlPrecobaserateio, that.vlPrecobaserateio) &&
                Objects.equals(vlPrecosugerido, that.vlPrecosugerido) &&
                Objects.equals(pcMargemfinal, that.pcMargemfinal) &&
                Objects.equals(vlLucrofinal, that.vlLucrofinal) &&
                Objects.equals(vlLucrodesejado, that.vlLucrodesejado) &&
                Objects.equals(pcVariacaolucro, that.pcVariacaolucro) &&
                Objects.equals(vlLucroprecobase, that.vlLucroprecobase) &&
                Objects.equals(vlBasetotal, that.vlBasetotal) &&
                Objects.equals(vlFrete, that.vlFrete) &&
                Objects.equals(pcFrete, that.pcFrete) &&
                Objects.equals(pcFretepmz, that.pcFretepmz) &&
                Objects.equals(vlPromotoria, that.vlPromotoria) &&
                Objects.equals(vlTransporteterceiro, that.vlTransporteterceiro) &&
                Objects.equals(vlComissao, that.vlComissao) &&
                Objects.equals(vlAcordo, that.vlAcordo) &&
                Objects.equals(vlJuro, that.vlJuro) &&
                Objects.equals(vlTotalproduto, that.vlTotalproduto) &&
                Objects.equals(pcIcmsst, that.pcIcmsst) &&
                Objects.equals(pcIcmsinterestadual, that.pcIcmsinterestadual) &&
                Objects.equals(vlIcms, that.vlIcms) &&
                Objects.equals(pcIcms, that.pcIcms) &&
                Objects.equals(vlIcmssugerido, that.vlIcmssugerido) &&
                Objects.equals(pcIcmssugerido, that.pcIcmssugerido) &&
                Objects.equals(pcIcmsnormal, that.pcIcmsnormal) &&
                Objects.equals(vlBaseicmsst, that.vlBaseicmsst) &&
                Objects.equals(vlIcmsst, that.vlIcmsst) &&
                Objects.equals(pcPis, that.pcPis) &&
                Objects.equals(vlPis, that.vlPis) &&
                Objects.equals(pcPissugerido, that.pcPissugerido) &&
                Objects.equals(vlCofins, that.vlCofins) &&
                Objects.equals(pcCofins, that.pcCofins) &&
                Objects.equals(pcCofinssugerido, that.pcCofinssugerido) &&
                Objects.equals(vlIrpj, that.vlIrpj) &&
                Objects.equals(vlCsll, that.vlCsll) &&
                Objects.equals(vlDespcomercial, that.vlDespcomercial) &&
                Objects.equals(vlTotalimposto, that.vlTotalimposto) &&
                Objects.equals(vlPreconfunit, that.vlPreconfunit) &&
                Objects.equals(vlPrecost, that.vlPrecost) &&
                Objects.equals(vlPrecoipi, that.vlPrecoipi) &&
                Objects.equals(vlPrecofinalunit, that.vlPrecofinalunit) &&
                Objects.equals(vlTotalgeranf, that.vlTotalgeranf) &&
                Objects.equals(pcCsll, that.pcCsll) &&
                Objects.equals(pcIr, that.pcIr) &&
                Objects.equals(pcMarkup, that.pcMarkup) &&
                Objects.equals(vlPissugerido, that.vlPissugerido) &&
                Objects.equals(vlCofinssugerido, that.vlCofinssugerido) &&
                Objects.equals(pcIcmsestorno, that.pcIcmsestorno) &&
                Objects.equals(vlCustomediorateio, that.vlCustomediorateio) &&
                Objects.equals(vlDespesarateio, that.vlDespesarateio) &&
                Objects.equals(vlRateiopadrao, that.vlRateiopadrao) &&
                Objects.equals(vlPrecofinalsimples, that.vlPrecofinalsimples) &&
                Objects.equals(pcCfem, that.pcCfem) &&
                Objects.equals(vlCfem, that.vlCfem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nrItem, vlPreco, vlPrecominimo, dtVigencia, dtUltimaatualizacao, vlNovoprecoreferencia, vlIcmsstprecovenda, vlCustototalrateio, vlPrecobaserateio, vlPrecosugerido, pcMargemfinal, vlLucrofinal, vlLucrodesejado, pcVariacaolucro, vlLucroprecobase, vlBasetotal, vlFrete, pcFrete, pcFretepmz, vlPromotoria, vlTransporteterceiro, vlComissao, vlAcordo, vlJuro, vlTotalproduto, pcIcmsst, pcIcmsinterestadual, vlIcms, pcIcms, vlIcmssugerido, pcIcmssugerido, pcIcmsnormal, vlBaseicmsst, vlIcmsst, pcPis, vlPis, pcPissugerido, vlCofins, pcCofins, pcCofinssugerido, vlIrpj, vlCsll, vlDespcomercial, vlTotalimposto, vlPreconfunit, vlPrecost, vlPrecoipi, vlPrecofinalunit, vlTotalgeranf, pcCsll, pcIr, pcMarkup, vlPissugerido, vlCofinssugerido, pcIcmsestorno, vlCustomediorateio, vlDespesarateio, vlRateiopadrao, vlPrecofinalsimples, pcCfem, vlCfem);
    }


}
