package br.com.gestmax.GSE.domain;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Data
public class RateioCustoItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private BigDecimal qtProduto;
    private BigDecimal vlCustomedio;
    private BigDecimal vlRateio;
    private BigDecimal vlCustototal;
    private BigDecimal vlRateiounit;
    private BigDecimal vlMediovenda;
    private BigDecimal vlCalculado;
    private BigDecimal vlBase;
    private BigDecimal pcMargemlucro;
    private BigDecimal vlLucro;
    @ManyToOne
    private RateioCusto rateioCusto;
    @ManyToOne
    private Marca marca;
    @ManyToOne
    private Produto produto;
    @ManyToOne
    private Filial filial;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RateioCustoItem that = (RateioCustoItem) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(qtProduto, that.qtProduto) &&
                Objects.equals(vlCustomedio, that.vlCustomedio) &&
                Objects.equals(vlRateio, that.vlRateio) &&
                Objects.equals(vlCustototal, that.vlCustototal) &&
                Objects.equals(vlRateiounit, that.vlRateiounit) &&
                Objects.equals(vlMediovenda, that.vlMediovenda) &&
                Objects.equals(vlCalculado, that.vlCalculado) &&
                Objects.equals(vlBase, that.vlBase) &&
                Objects.equals(pcMargemlucro, that.pcMargemlucro) &&
                Objects.equals(vlLucro, that.vlLucro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, qtProduto, vlCustomedio, vlRateio, vlCustototal, vlRateiounit, vlMediovenda, vlCalculado, vlBase, pcMargemlucro, vlLucro);
    }


}
