package br.com.gestmax.GSE.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Collection;
import java.util.Objects;

@Entity
@Data
public class Pais implements BasicDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull(message = "{pais_nome_not_null}")
    @Size(min = 2, max = 60, message = "{pais_nome_size}")
    private String nmPais;
    @NotNull(message = "{pais_sigla_not_null}")
    @Size(min = 2, max = 60, message = "{pais_sigla_size}")
    private String sgPais;


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
