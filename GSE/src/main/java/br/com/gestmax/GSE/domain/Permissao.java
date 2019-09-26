package br.com.gestmax.GSE.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Entity
@Data
public class Permissao {
    @Id
    private Integer id;
    private String nmPermissao;
    @ManyToOne
    private GrupoUsuario grupoUsuario;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Permissao permissao = (Permissao) o;
        return Objects.equals(id, permissao.id) &&
                Objects.equals(nmPermissao, permissao.nmPermissao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nmPermissao);
    }


}
