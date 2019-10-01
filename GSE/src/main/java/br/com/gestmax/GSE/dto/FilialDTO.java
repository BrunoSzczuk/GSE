package br.com.gestmax.GSE.dto;

import br.com.gestmax.GSE.domain.Empresa;
import br.com.gestmax.GSE.domain.Filial;
import br.com.gestmax.GSE.domain.ExcecaoFiscal;
import br.com.gestmax.GSE.domain.Municipio;
import lombok.Data;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Collection;

@Data
public class FilialDTO extends BasicDTO<Filial> {
    private Long id;
    private String cdFilial;
    private String nmRazaoSocial;
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

    public FilialDTO(Filial domain) {
        super(domain);
    }
}
