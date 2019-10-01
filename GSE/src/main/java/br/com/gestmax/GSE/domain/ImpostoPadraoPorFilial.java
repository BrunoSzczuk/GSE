package br.com.gestmax.GSE.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Data
public class ImpostoPadraoPorFilial implements BasicDomain{
    @Id
    private Long id;
    private BigDecimal pcIcmsinterno;
    private BigDecimal pcCsll;
    private BigDecimal pcIr;
    private BigDecimal pcIcmsexterno;
    private BigDecimal pcIcmsbeneficiofiscal;
    @ManyToOne
    private Filial filial;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImpostoPadraoPorFilial that = (ImpostoPadraoPorFilial) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(pcIcmsinterno, that.pcIcmsinterno) &&
                Objects.equals(pcCsll, that.pcCsll) &&
                Objects.equals(pcIr, that.pcIr) &&
                Objects.equals(pcIcmsexterno, that.pcIcmsexterno) &&
                Objects.equals(pcIcmsbeneficiofiscal, that.pcIcmsbeneficiofiscal);
    }


}
