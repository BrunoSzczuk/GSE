package br.com.gestmax.GSE.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Data
public class Empresa implements BasicDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 60)
    private String nmEmpresa;
    private Boolean stAtivo;
    private String cdEmpresa;
    @OneToMany(mappedBy = "empresa")
    @JsonIgnore
    private Collection<Filial> filials;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empresa empresa = (Empresa) o;
        return Objects.equals(id, empresa.id) &&
                Objects.equals(nmEmpresa, empresa.nmEmpresa) &&
                Objects.equals(stAtivo, empresa.stAtivo) &&
                Objects.equals(cdEmpresa, empresa.cdEmpresa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nmEmpresa, stAtivo, cdEmpresa);
    }

}
