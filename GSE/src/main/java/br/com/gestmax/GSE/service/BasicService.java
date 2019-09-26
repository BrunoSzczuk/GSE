package br.com.gestmax.GSE.service;

import br.com.gestmax.GSE.domain.BasicDomain;
import br.com.gestmax.GSE.dto.BasicDTO;
import br.com.gestmax.GSE.exception.DataIntegrityException;
import br.com.gestmax.GSE.exception.ObjectNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public abstract class BasicService<DOMAIN extends BasicDomain, REPOSITORY extends JpaRepository, DTO extends BasicDTO> {
    @Autowired
    protected REPOSITORY repository;

    private final Class clazz;

    public BasicService(Class clazz) {
        this.clazz = clazz;
    }

    public DOMAIN findById(Long id) {
        DOMAIN obj = (DOMAIN) repository.findById(id).orElse(null);
        if (obj == null) {
            throw new ObjectNotFoundException(
                    "Objeto não encontrado! Id: " + id);
        }
        return obj;
    }

    public DOMAIN insert(DOMAIN obj) {
        return (DOMAIN) repository.save(obj);
    }

    public abstract Page<DOMAIN> search(String descricao, Integer page, Integer linesPerPage, String orderBy, String direction);

    public List<DOMAIN> findAll() {
        return repository.findAll();
    }

    public void delete(Long id) {
        findById(id);
        try {
            repository.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            throw new DataIntegrityException("Não é possível excluir um dado que tenha dados relacionados");
        }
    }

    public DOMAIN fromDTO(DTO objDto) {
        DOMAIN t = null;
        try {
            t = (DOMAIN) clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        BeanUtils.copyProperties(objDto, t);
        return t;
    }

    public DOMAIN update(DOMAIN obj) {
        DOMAIN newObj = findById(obj.getId());
        BeanUtils.copyProperties(obj, newObj);
        return (DOMAIN) repository.save(newObj);
    }
}
