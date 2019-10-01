package br.com.gestmax.GSE.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Objects;

@Entity
@Data
public class GrupoProduto implements BasicDomain{
    @Id
    private Long id;
    private String dsGrupo;
    private Boolean stAtivo;
    private String cdGrupo;
    @ManyToOne
    private Filial filial;
    @OneToMany(mappedBy = "grupoProduto")
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
