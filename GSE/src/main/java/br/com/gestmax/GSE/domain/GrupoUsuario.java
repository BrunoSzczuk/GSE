package br.com.gestmax.GSE.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Data
public class GrupoUsuario implements BasicDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Boolean stAtivo;
    private String dsTipousuario;
    @OneToMany(mappedBy = "grupoUsuario")
    private Collection<Permissao> permissoes;
    @OneToMany(mappedBy = "grupoUsuario")
    private Collection<Usuario> usuarios;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GrupoUsuario that = (GrupoUsuario) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(stAtivo, that.stAtivo) &&
                Objects.equals(dsTipousuario, that.dsTipousuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stAtivo, dsTipousuario);
    }


}
