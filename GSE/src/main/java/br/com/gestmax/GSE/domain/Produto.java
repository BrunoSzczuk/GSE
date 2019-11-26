package br.com.gestmax.GSE.domain;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Data
public class Produto implements BasicDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    @Column(nullable = false, length = 15)
    private String cdProduto;
    @Column(length = 60)
    private String dsProduto;
    @Column(length = 100)
    private String tpProduto;
    private Boolean stAtivo;
    private Integer qtBaseestrutura;
    private BigDecimal ftConversao;
    private String tpConversao;
    private Timestamp dtAtualizacao;
    private Boolean stLote;
    private BigDecimal psProduto;
    private BigDecimal vlIpipauta;
    private BigDecimal vlPispauta;
    private BigDecimal vlCofpauta;
    private Boolean stBloqueado;
    @Column(length = 10)
    private String nrNcm;
    @Column(length = 3)
    private String cdSegum;
    private BigDecimal psBruto;
    @Column(length = 100)
    private String dsOrigem;
    private BigDecimal qtMultiplicador;
    @Column(length = 15)
    private String cdEan;
    @OneToMany(mappedBy = "produto")
    private Collection<ImpostoItem> impostoItems;
    @ManyToOne
    private UnidadeMedida unidadeMedida;
    @ManyToOne
    private Marca marca;
    @ManyToOne
    private SubGrupoProduto subGrupoProduto;
    @OneToMany(mappedBy = "produto")
    private Collection<RateioCustoItem> rateioCustoItems;
    @OneToMany(mappedBy = "produto")
    private Collection<TabPrecoItem> tabPrecoItems;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(id, produto.id) &&
                Objects.equals(cdProduto, produto.cdProduto) &&
                Objects.equals(dsProduto, produto.dsProduto) &&
                Objects.equals(tpProduto, produto.tpProduto) &&
                Objects.equals(stAtivo, produto.stAtivo) &&
                Objects.equals(qtBaseestrutura, produto.qtBaseestrutura) &&
                Objects.equals(ftConversao, produto.ftConversao) &&
                Objects.equals(tpConversao, produto.tpConversao) &&
                Objects.equals(dtAtualizacao, produto.dtAtualizacao) &&
                Objects.equals(stLote, produto.stLote) &&
                Objects.equals(psProduto, produto.psProduto) &&
                Objects.equals(vlIpipauta, produto.vlIpipauta) &&
                Objects.equals(vlPispauta, produto.vlPispauta) &&
                Objects.equals(vlCofpauta, produto.vlCofpauta) &&
                Objects.equals(stBloqueado, produto.stBloqueado) &&
                Objects.equals(nrNcm, produto.nrNcm) &&
                Objects.equals(cdSegum, produto.cdSegum) &&
                Objects.equals(psBruto, produto.psBruto) &&
                Objects.equals(dsOrigem, produto.dsOrigem) &&
                Objects.equals(qtMultiplicador, produto.qtMultiplicador) &&
                Objects.equals(cdEan, produto.cdEan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cdProduto, dsProduto, tpProduto, stAtivo, qtBaseestrutura, ftConversao, tpConversao, dtAtualizacao, stLote, psProduto, vlIpipauta, vlPispauta, vlCofpauta, stBloqueado, nrNcm, cdSegum, psBruto, dsOrigem, qtMultiplicador, cdEan);
    }
}
