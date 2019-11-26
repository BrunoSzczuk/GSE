package br.com.gestmax.GSE.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class PrivilegioUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Usuario usuario;
    @ManyToOne
    private Privilegio privilegio;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrivilegioUsuario that = (PrivilegioUsuario) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, usuario, privilegio);
    }


}
