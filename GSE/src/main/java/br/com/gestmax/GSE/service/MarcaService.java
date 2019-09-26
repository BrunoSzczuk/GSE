package br.com.gestmax.GSE.service;

import br.com.gestmax.GSE.domain.Marca;
import br.com.gestmax.GSE.dto.MarcaDTO;
import br.com.gestmax.GSE.repository.MarcaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class MarcaService extends BasicService<Marca, MarcaRepository, MarcaDTO> {

    public MarcaService() {
        super(Marca.class);
    }

    @Override
    public Page<Marca> search(String descricao, Integer page, Integer linesPerPage, String orderBy, String direction) {
        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);
        return repository.findDistinctByDsMarcaContaining(descricao, pageRequest);
    }
}
