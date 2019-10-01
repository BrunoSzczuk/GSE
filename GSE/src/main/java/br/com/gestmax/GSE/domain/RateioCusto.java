package br.com.gestmax.GSE.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
@Data
public class RateioCusto implements BasicDomain {
    @Id
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
    @ManyToOne
    private Filial filial;
    @OneToMany(mappedBy = "rateioCusto")
    private Collection<RateioCustoItem> rateioCustoItems;
    @OneToMany(mappedBy = "rateioCusto")
    private Collection<TabPreco> tabPrecos;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RateioCusto that = (RateioCusto) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(dtCompetencia, that.dtCompetencia) &&
                Objects.equals(vlRateio, that.vlRateio) &&
                Objects.equals(pcMargem, that.pcMargem) &&
                Objects.equals(vlKm, that.vlKm) &&
                Objects.equals(pcJuromes, that.pcJuromes) &&
                Objects.equals(dtIniconsulta, that.dtIniconsulta) &&
                Objects.equals(dtFimconsulta, that.dtFimconsulta) &&
                Objects.equals(stAtivo, that.stAtivo) &&
                Objects.equals(dtIniciovigencia, that.dtIniciovigencia) &&
                Objects.equals(dtFimvigencia, that.dtFimvigencia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dtCompetencia, vlRateio, pcMargem, vlKm, pcJuromes, dtIniconsulta, dtFimconsulta, stAtivo, dtIniciovigencia, dtFimvigencia);
    }


}
