package br.com.gestmax.GSE.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Data
public class Estado implements BasicDomain{
    @Id
    private Long id;
    @Column(length = 60)
    private String nmEstado;
    private String cdIbge;

    private String sgEstado;
    @ManyToOne
    private Pais pais;

    @OneToMany(mappedBy = "estado")
    private Collection<ExcecaoFiscal> excecaoFiscals;
    @OneToMany(mappedBy = "estado")
    private Collection<ImpostoItem> impostoItems;
    @OneToMany(mappedBy = "estado")
    private Collection<Municipio> municipios;
    @OneToMany(mappedBy = "estado")
    private Collection<TabPreco> tabPrecos;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estado estado = (Estado) o;
        return Objects.equals(id, estado.id) &&
                Objects.equals(nmEstado, estado.nmEstado) &&
                Objects.equals(cdIbge, estado.cdIbge) &&
                Objects.equals(sgEstado, estado.sgEstado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nmEstado, cdIbge, sgEstado);
    }

}
