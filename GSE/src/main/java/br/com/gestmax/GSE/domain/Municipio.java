package br.com.gestmax.GSE.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Data
public class Municipio implements BasicDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nmMunicipio;
    private Integer qtPopulacao;
    private String cdUfibge;
    @OneToMany(mappedBy = "municipio")
    @JsonIgnore
    private Collection<Filial> filials;
    @ManyToOne
    private Estado estado;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Municipio municipio = (Municipio) o;
        return Objects.equals(id, municipio.id) &&
                Objects.equals(nmMunicipio, municipio.nmMunicipio) &&
                Objects.equals(qtPopulacao, municipio.qtPopulacao) &&
                Objects.equals(cdUfibge, municipio.cdUfibge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nmMunicipio, qtPopulacao, cdUfibge);
    }


}
