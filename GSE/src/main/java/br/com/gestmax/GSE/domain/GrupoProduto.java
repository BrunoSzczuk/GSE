package br.com.gestmax.GSE.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.Objects;

@Entity
@Data
public class GrupoProduto implements BasicDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 60)
    private String dsGrupo;
    private Boolean stAtivo;
    @Column(length = 30)
    private String cdGrupo;
    @ManyToOne
    @NotNull
    private Filial filial;
    @OneToMany(mappedBy = "grupoProduto")
    @JsonIgnore
    private Collection<SubGrupoProduto> subGrupoProduto;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GrupoProduto that = (GrupoProduto) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(dsGrupo, that.dsGrupo) &&
                Objects.equals(stAtivo, that.stAtivo) &&
                Objects.equals(cdGrupo, that.cdGrupo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dsGrupo, stAtivo, cdGrupo);
    }
}
