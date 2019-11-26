package br.com.gestmax.GSE.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Data
public class SubGrupoProduto implements BasicDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String cdSubgrupo;
    private String dsSubgrupo;
    @OneToMany(mappedBy = "subGrupoProduto")
    private Collection<Produto> produtos;
    @ManyToOne
    private Filial filial;
    @ManyToOne
    private GrupoProduto grupoProduto;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubGrupoProduto that = (SubGrupoProduto) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(cdSubgrupo, that.cdSubgrupo) &&
                Objects.equals(dsSubgrupo, that.dsSubgrupo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cdSubgrupo, dsSubgrupo);
    }
}
