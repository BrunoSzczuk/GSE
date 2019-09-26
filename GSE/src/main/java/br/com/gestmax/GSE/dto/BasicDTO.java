package br.com.gestmax.GSE.dto;

import br.com.gestmax.GSE.domain.BasicDomain;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@NoArgsConstructor
public abstract class BasicDTO<T> implements BasicDomain {

    public BasicDTO(T domain) {
        BeanUtils.copyProperties(domain, this);
    }

    @Override
    public Long getId() {
        return null;
    }

    @Override
    public void setId(Long id) {

    }
}
