package br.com.gestmax.GSE.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Data
public class Marca implements BasicDomain{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 60)
    private String dsMarca;
    @Column(length = 30)
    private String cdMarca;
    @OneToMany(mappedBy = "marca")
    private Collection<Produto> produtos;
    @OneToMany(mappedBy = "marca")
    private Collection<RateioCustoItem> rateioCustoItems;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Marca marca = (Marca) o;
        return Objects.equals(id, marca.id) &&
                Objects.equals(dsMarca, marca.dsMarca) &&
                Objects.equals(cdMarca, marca.cdMarca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dsMarca, cdMarca);
    }

}
