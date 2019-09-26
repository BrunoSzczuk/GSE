package br.com.gestmax.GSE.service;

import br.com.gestmax.GSE.domain.Empresa;
import br.com.gestmax.GSE.dto.EmpresaDTO;
import br.com.gestmax.GSE.repository.EmpresaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService extends BasicService<Empresa, EmpresaRepository, EmpresaDTO> {

    public EmpresaService() {
        super(Empresa.class);
    }

    @Override
    public Page<Empresa> search(String descricao, Integer page, Integer linesPerPage, String orderBy, String direction) {
        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);
        return repository.findDistinctByNmEmpresaContaining(descricao, pageRequest);
    }
}
