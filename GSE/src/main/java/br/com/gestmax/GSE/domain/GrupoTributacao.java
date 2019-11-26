package br.com.gestmax.GSE.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Data
public class GrupoTributacao implements BasicDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 60)
    private String dsGrupotrib;
    @OneToMany(mappedBy = "grupoTributacao")
    private Collection<ExcecaoFiscal> execaoFiscals;

}
