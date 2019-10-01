package br.com.gestmax.GSE.service;

import br.com.gestmax.GSE.domain.GrupoTributacao;
import br.com.gestmax.GSE.dto.GrupoTributacaoDTO;
import br.com.gestmax.GSE.repository.GrupoTributacaoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class GrupoTributacaoService extends BasicService<GrupoTributacao, GrupoTributacaoRepository, GrupoTributacaoDTO> {

    public GrupoTributacaoService() {
        super(GrupoTributacao.class);
    }

    @Override
    public Page<GrupoTributacao> search(String descricao, Integer page, Integer linesPerPage, String orderBy, String direction) {
        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);
        return repository.findDistinctByDsGrupotribContaining(descricao, pageRequest);
    }
}
