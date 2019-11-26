package br.com.gestmax.GSE.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Data
public class TabPrecoUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne
    private Usuario usuario;
    @ManyToOne
    private TabPreco tabPreco;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TabPrecoUsuario that = (TabPrecoUsuario) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
