package br.com.gestmax.GSE.dto;

import br.com.gestmax.GSE.domain.Empresa;
import br.com.gestmax.GSE.domain.Filial;
import br.com.gestmax.GSE.domain.ExcecaoFiscal;
import br.com.gestmax.GSE.domain.Municipio;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Collection;

@Data
@NoArgsConstructor
public class FilialDTO extends BasicDTO<Filial> {
    private Long id;
    @NotNull(message = "{filial_cdFilial_not_null}")
    @Size(min = 1, max = 30)
    private String cdFilial;
    @NotNull(message = "{filial_nmRazaoSocial_not_null}")
    @Size(min = 1, max = 60)
    private String nmRazaoSocial;
    @NotNull(message = "{filial_nmFantasia_not_null}")
    @Size(min = 1, max = 60)
    private String nmFantasia;
    @NotNull(message = "{filial_dsEndereco_not_null}")
    @Size(min = 1, max = 60)
    private String dsEndereco;
    @NotNull(message = "{filial_dsBairro_not_null}")
    @Size(min = 1, max = 60)
    private String dsBairro;
    @Size(max = 9, message = "{filial_nrCep_size}")
    private String nrCep;
    @Size(max = 3, message = "{filial_nrDdd_size}")
    private String nrDdd;
    @Size(max = 20, message = "{filial_nrTelefone_size}")
    private String nrTelefone;
    @Size(max = 17, message = "{filial_nrCnpj_size}")
    private String nrCnpj;
    @Size(max = 20, message = "{filial_nrIe_size}")
    private String nrIe;
    private String cdCliente;
    private String nrLoja;
    @OneToMany(mappedBy = "filial")
    @JsonIgnore
    private Collection<ExcecaoFiscal> execaoFiscais;
    @ManyToOne
    @NotNull(message = "{filial_municipio_not_null")
    private Municipio municipio;
    @ManyToOne
    @NotNull(message = "{filial_empresa_not_null")
    private Empresa empresa;

    public FilialDTO(Filial domain) {
        super(domain);
    }
}
