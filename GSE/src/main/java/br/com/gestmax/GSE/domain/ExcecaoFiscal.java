package br.com.gestmax.GSE.domain;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Data
public class ExcecaoFiscal {
    @Id
    private Integer id;
    private Integer nrSequencia;
    @Column(length = 100)
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
    @ManyToOne
    private Filial filial;
    @ManyToOne
    private GrupoTributacao grupoTributacao;
    @ManyToOne
    private Estado estado;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExcecaoFiscal that = (ExcecaoFiscal) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(nrSequencia, that.nrSequencia) &&
                Objects.equals(tpCliente, that.tpCliente) &&
                Objects.equals(pcIcmsinterno, that.pcIcmsinterno) &&
                Objects.equals(pcIcmsexterno, that.pcIcmsexterno) &&
                Objects.equals(pcMva, that.pcMva) &&
                Objects.equals(pcIcmsdest, that.pcIcmsdest) &&
                Objects.equals(vlPautaicms, that.vlPautaicms) &&
                Objects.equals(vlPautaipi, that.vlPautaipi) &&
                Objects.equals(vlPautapis, that.vlPautapis) &&
                Objects.equals(vlPautacof, that.vlPautacof) &&
                Objects.equals(vlPautaicmsproprio, that.vlPautaicmsproprio) &&
                Objects.equals(pcAliqipi, that.pcAliqipi) &&
                Objects.equals(pcAliqpis, that.pcAliqpis) &&
                Objects.equals(pcAliqcof, that.pcAliqcof) &&
                Objects.equals(pcRedbaseicms, that.pcRedbaseicms) &&
                Objects.equals(pcRedbaseipi, that.pcRedbaseipi) &&
                Objects.equals(pcRedbasecof, that.pcRedbasecof) &&
                Objects.equals(pcRedbasepis, that.pcRedbasepis) &&
                Objects.equals(stExcluido, that.stExcluido);
    }


}
