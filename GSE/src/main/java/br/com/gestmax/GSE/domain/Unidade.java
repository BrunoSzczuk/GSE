package br.com.gestmax.GSE.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Unidade {
    @Id
    private Integer id;
    @Column(name = "cd_unidade", nullable = false, length = 6)
    private String cdUnidade;
    @Column(length = 60)
    private String dsUnidade;
    @OneToMany(mappedBy = "unidade")
    private Collection<Produto> produtos;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Unidade unidade = (Unidade) o;
        return Objects.equals(id, unidade.id) &&
                Objects.equals(cdUnidade, unidade.cdUnidade) &&
                Objects.equals(dsUnidade, unidade.dsUnidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cdUnidade, dsUnidade);
    }


}
