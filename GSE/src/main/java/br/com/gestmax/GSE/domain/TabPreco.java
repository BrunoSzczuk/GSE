package br.com.gestmax.GSE.domain;

import br.com.gestmax.GSE.domain.enums.TipoCliente;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Data
public class TabPreco implements BasicDomain {
    @Id
    private Long id;
    @Column(name = "cd_tabpreco", nullable = false, length = 5)
    private String cdTabPreco;
    @Column(name = "ds_tabpreco", nullable = true, length = 100)
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
    @Enumerated(EnumType.STRING)
    private TipoCliente tpCliente;
    private Boolean stAtualizatotvs;
    private BigDecimal pcFreteTerrceiro;
    private BigDecimal pcPromotor;
    @ManyToOne
    private Filial filial;
    @ManyToOne
    private Estado estado;
    @ManyToOne
    private RateioCusto rateioCusto;
    @OneToMany(mappedBy = "tabPreco")
    private Collection<TabPrecoItem> tabPrecoItems;
    @OneToMany(mappedBy = "tabPreco")
    private Collection<TabPrecoUsuario> tabPrecoUsuarios;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TabPreco tabpreco = (TabPreco) o;
        return Objects.equals(id, tabpreco.id) &&
                Objects.equals(cdTabPreco, tabpreco.cdTabPreco) &&
                Objects.equals(dsTabPreco, tabpreco.dsTabPreco) &&
                Objects.equals(dtVigencia, tabpreco.dtVigencia) &&
                Objects.equals(dtVigenciaFim, tabpreco.dtVigenciaFim) &&
                Objects.equals(kmDistancia, tabpreco.kmDistancia) &&
                Objects.equals(pcComissao, tabpreco.pcComissao) &&
                Objects.equals(pcAcordo, tabpreco.pcAcordo) &&
                Objects.equals(pcJuromes, tabpreco.pcJuromes) &&
                Objects.equals(nrDiaspagto, tabpreco.nrDiaspagto) &&
                Objects.equals(dtUltimaAtualizacao, tabpreco.dtUltimaAtualizacao) &&
                Objects.equals(vlKm, tabpreco.vlKm) &&
                Objects.equals(stAtualizar, tabpreco.stAtualizar) &&
                Objects.equals(stExcluido, tabpreco.stExcluido) &&
                Objects.equals(stAtivo, tabpreco.stAtivo) &&
                Objects.equals(tpCliente, tabpreco.tpCliente) &&
                Objects.equals(stAtualizatotvs, tabpreco.stAtualizatotvs) &&
                Objects.equals(pcFreteTerrceiro, tabpreco.pcFreteTerrceiro) &&
                Objects.equals(pcPromotor, tabpreco.pcPromotor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cdTabPreco, dsTabPreco, dtVigencia, dtVigenciaFim, kmDistancia, pcComissao, pcAcordo, pcJuromes, nrDiaspagto, dtUltimaAtualizacao, vlKm, stAtualizar, stExcluido, stAtivo, tpCliente, stAtualizatotvs, pcFreteTerrceiro, pcPromotor);
    }

}
