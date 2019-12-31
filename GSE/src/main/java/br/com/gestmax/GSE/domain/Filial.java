package br.com.gestmax.GSE.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Data
public class Filial implements BasicDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 30)
    private String cdFilial;
    @Column(length = 60)
    private String nmRazaoSocial;
    @Column(length = 60)
    private String nmFantasia;
    @Column(length = 60)
    private String dsEndereco;
    @Column(length = 60)
    private String dsBairro;
    @Column(length = 9)
    private String nrCep;
    @Column(length = 3)
    private String nrDdd;
    @Column(length = 20)
    private String nrTelefone;
    @Column(length = 14)
    private String nrCnpj;
    @Column(length = 20)
    private String nrIe;
    private String cdCliente;
    private String nrLoja;
    @ManyToOne
    private Municipio municipio;
    @ManyToOne
    private Empresa empresa;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Filial filial = (Filial) o;
        return Objects.equals(id, filial.id) &&
                Objects.equals(cdFilial, filial.cdFilial) &&
                Objects.equals(nmRazaoSocial, filial.nmRazaoSocial) &&
                Objects.equals(nmFantasia, filial.nmFantasia) &&
                Objects.equals(dsEndereco, filial.dsEndereco) &&
                Objects.equals(dsBairro, filial.dsBairro) &&
                Objects.equals(nrCep, filial.nrCep) &&
                Objects.equals(nrDdd, filial.nrDdd) &&
                Objects.equals(nrTelefone, filial.nrTelefone) &&
                Objects.equals(nrCnpj, filial.nrCnpj) &&
                Objects.equals(nrIe, filial.nrIe) &&
                Objects.equals(cdCliente, filial.cdCliente) &&
                Objects.equals(nrLoja, filial.nrLoja);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cdFilial, nmRazaoSocial, nmFantasia, dsEndereco, dsBairro, nrCep, nrDdd, nrTelefone, nrCnpj, nrIe, cdCliente, nrLoja);
    }


}
