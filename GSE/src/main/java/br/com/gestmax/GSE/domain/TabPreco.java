package br.com.gestmax.GSE.domain;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Data
public class TabPreco {
    @Id
    private Integer id;
    @Column(name = "cd_tabpreco", nullable = false, length = 5)
    private String cdTabpreco;
    @Column(name = "ds_tabpreco", nullable = true, length = 100)
    private String dsTabpreco;
    private Date dtVigencia;
    private Date dtVigenciafim;
    private Integer kmDistancia;
    private BigDecimal pcComissao;
    private BigDecimal pcAcordo;
    private BigDecimal pcJuromes;
    private Integer nrDiaspagto;
    private Timestamp dtUltimaatualizacao;
    private BigDecimal vlKm;
    private Boolean stAtualizar;
    private Boolean stExcluido;
    private Boolean stAtivo;
    @Column(name = "tp_cliente", nullable = true, length = 100)
    //ENUM
    private String tpCliente;
    private Boolean stAtualizatotvs;
    private BigDecimal pcFreteterceiro;
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
                Objects.equals(cdTabpreco, tabpreco.cdTabpreco) &&
                Objects.equals(dsTabpreco, tabpreco.dsTabpreco) &&
                Objects.equals(dtVigencia, tabpreco.dtVigencia) &&
                Objects.equals(dtVigenciafim, tabpreco.dtVigenciafim) &&
                Objects.equals(kmDistancia, tabpreco.kmDistancia) &&
                Objects.equals(pcComissao, tabpreco.pcComissao) &&
                Objects.equals(pcAcordo, tabpreco.pcAcordo) &&
                Objects.equals(pcJuromes, tabpreco.pcJuromes) &&
                Objects.equals(nrDiaspagto, tabpreco.nrDiaspagto) &&
                Objects.equals(dtUltimaatualizacao, tabpreco.dtUltimaatualizacao) &&
                Objects.equals(vlKm, tabpreco.vlKm) &&
                Objects.equals(stAtualizar, tabpreco.stAtualizar) &&
                Objects.equals(stExcluido, tabpreco.stExcluido) &&
                Objects.equals(stAtivo, tabpreco.stAtivo) &&
                Objects.equals(tpCliente, tabpreco.tpCliente) &&
                Objects.equals(stAtualizatotvs, tabpreco.stAtualizatotvs) &&
                Objects.equals(pcFreteterceiro, tabpreco.pcFreteterceiro) &&
                Objects.equals(pcPromotor, tabpreco.pcPromotor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cdTabpreco, dsTabpreco, dtVigencia, dtVigenciafim, kmDistancia, pcComissao, pcAcordo, pcJuromes, nrDiaspagto, dtUltimaatualizacao, vlKm, stAtualizar, stExcluido, stAtivo, tpCliente, stAtualizatotvs, pcFreteterceiro, pcPromotor);
    }

}
