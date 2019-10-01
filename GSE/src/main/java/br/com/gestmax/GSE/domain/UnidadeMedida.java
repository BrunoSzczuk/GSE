package br.com.gestmax.GSE.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Objects;

@Entity
@Data
public class UnidadeMedida implements BasicDomain {
    @Id
    private Long id;
    @Column(name = "cd_unidademedida", nullable = false, length = 6)
    private String cdUnidadeMedida;
    @Column(length = 60)
    private String dsUnidadeMedida;
    private Integer qtCasasDecimais;
    @OneToMany(mappedBy = "unidadeMedida")
    private Collection<Produto> produtos;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnidadeMedida unidadeMedida = (UnidadeMedida) o;
        return Objects.equals(id, unidadeMedida.id) &&
                Objects.equals(cdUnidadeMedida, unidadeMedida.cdUnidadeMedida) &&
                Objects.equals(dsUnidadeMedida, unidadeMedida.dsUnidadeMedida);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cdUnidadeMedida, dsUnidadeMedida);
    }


}
