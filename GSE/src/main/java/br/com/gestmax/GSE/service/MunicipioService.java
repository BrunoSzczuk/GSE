package br.com.gestmax.GSE.service;

import br.com.gestmax.GSE.domain.Municipio;
import br.com.gestmax.GSE.dto.MunicipioDTO;
import br.com.gestmax.GSE.repository.MunicipioRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class MunicipioService extends BasicService<Municipio, MunicipioRepository, MunicipioDTO> {

    public MunicipioService() {
        super(Municipio.class);
    }

    @Override
    public Page<Municipio> search(String descricao, Integer page, Integer linesPerPage, String orderBy, String direction) {
        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);
        return repository.findDistinctByNmMunicipioContaining(descricao, pageRequest);
    }
}
