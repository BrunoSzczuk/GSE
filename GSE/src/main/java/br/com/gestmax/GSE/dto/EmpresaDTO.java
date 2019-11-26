package br.com.gestmax.GSE.dto;

import br.com.gestmax.GSE.domain.Empresa;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EmpresaDTO extends BasicDTO<Empresa> {
    private Long id;
    private String nmEmpresa;
    private Boolean stAtivo;
    private String cdEmpresa;

    public EmpresaDTO(Empresa domain) {
        super(domain);
    }
}
