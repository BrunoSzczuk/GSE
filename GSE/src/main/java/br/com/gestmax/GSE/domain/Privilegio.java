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
public class Privilegio {
    @Id
    private Integer id;
    @Column(length = 100)
    private String nmPrivilegio;
    @OneToMany(mappedBy = "privilegio")
    private Collection<PrivilegioUsuario> privilegioUsuarios;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Privilegio that = (Privilegio) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(nmPrivilegio, that.nmPrivilegio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nmPrivilegio);
    }

}
