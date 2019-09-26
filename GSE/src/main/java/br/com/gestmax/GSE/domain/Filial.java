package br.com.gestmax.GSE.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Data
public class Filial {
    @Id
    private Integer id;
    private String cdFilial;
    private String nmRazaosocial;
    private String nmFantasia;
    private String dsEndereco;
    private String dsBairro;
    private String nrCep;
    private String nrDdd;
    private String nrTelefone;
    private String nrCnpj;
    private String nrIe;
    private String cdCliente;
    private String nrLoja;
    @OneToMany(mappedBy = "filial")
    private Collection<ExcecaoFiscal> execaoFiscais;
    @ManyToOne
    private Municipio municipio;
    @ManyToOne
    private Empresa empresa;
    @OneToMany(mappedBy = "filial")
    private Collection<GrupoProduto> grupoProdutos;
    @OneToMany(mappedBy = "filial")
    private Collection<ImpostoItem> impostoItems;
    @OneToMany(mappedBy = "filial")
    private Collection<ImpostoPadraoPorFilial> impostoPadraoPorFilials;
    @OneToMany(mappedBy = "filial")
    private Collection<RateioCusto> rateioCustos;
    @OneToMany(mappedBy = "filial")
    private Collection<RateioCustoItem> rateioCustoItems;
    @OneToMany(mappedBy = "filial")
    private Collection<SubGrupoProduto> subGrupoProdutos;
    @OneToMany(mappedBy = "filial")
    private Collection<TabPreco> tabPrecos;
    @OneToMany(mappedBy = "filial")
    private Collection<TabPrecoItem> tabPrecoItems;
    @OneToMany(mappedBy = "filial")
    private Collection<UsuarioFilial> usuariofilialsById;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Filial filial = (Filial) o;
        return Objects.equals(id, filial.id) &&
                Objects.equals(cdFilial, filial.cdFilial) &&
                Objects.equals(nmRazaosocial, filial.nmRazaosocial) &&
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
        return Objects.hash(id, cdFilial, nmRazaosocial, nmFantasia, dsEndereco, dsBairro, nrCep, nrDdd, nrTelefone, nrCnpj, nrIe, cdCliente, nrLoja);
    }


}
