package br.com.gestmax.GSE.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Objects;

@Entity
@Data
public class Pais implements BasicDomain {
    @Id
    private Long id;
    private String nmPais;
    private String sgPais;
    @OneToMany(mappedBy = "pais")
    private Collection<Estado> estados;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pais pais = (Pais) o;
        return Objects.equals(id, pais.id) &&
                Objects.equals(nmPais, pais.nmPais) &&
                Objects.equals(sgPais, pais.sgPais);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nmPais, sgPais);
    }


}
