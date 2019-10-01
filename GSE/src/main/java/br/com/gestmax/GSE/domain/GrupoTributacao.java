package br.com.gestmax.GSE.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Data
public class GrupoTributacao implements BasicDomain{
    @Id
    private Long id;
    private String dsGrupotrib;
    @OneToMany(mappedBy = "grupoTributacao")
    private Collection<ExcecaoFiscal> execaoFiscals;

}
