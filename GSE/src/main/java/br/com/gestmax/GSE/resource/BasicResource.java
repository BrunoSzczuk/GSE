package br.com.gestmax.GSE.resource;

import br.com.gestmax.GSE.domain.BasicDomain;
import br.com.gestmax.GSE.domain.Empresa;
import br.com.gestmax.GSE.dto.BasicDTO;
import br.com.gestmax.GSE.dto.EmpresaDTO;
import br.com.gestmax.GSE.resource.utils.URL;
import br.com.gestmax.GSE.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;

public abstract class BasicResource<T extends BasicService, E extends BasicDTO, DOMAIN extends BasicDomain> {

    @Autowired
    protected T service;

    protected Class clazzDTO;
    protected Class clazzDomain;

    public BasicResource(Class clazzDomain, Class clazzDTO) {
        this.clazzDTO = clazzDTO;
        this.clazzDomain = clazzDomain;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Page<E>> index(@RequestParam(value = "nome", defaultValue = "") String nome,
                                         @RequestParam(value = "page", defaultValue = "0") Integer page,
                                         @RequestParam(value = "linesPerPage", defaultValue = "12") Integer linesPerPage,
                                         @RequestParam(value = "orderBy", defaultValue = "id") String orderBy,
                                         @RequestParam(value = "direction", defaultValue = "ASC") String direction) {
        return ResponseEntity.ok().body(findPage(URL.decodeParam(nome), page, linesPerPage, orderBy, direction));
    }


    public Page<E> findPage(String descricao,
                            Integer page,
                            Integer linesPerPage,
                            String orderBy,
                            String direction) {

        return service.search(descricao, page, linesPerPage, orderBy, direction).map(obj -> {
            try {
                return clazzDTO.getConstructor(clazzDomain).newInstance(obj);
            } catch (InvocationTargetException | NoSuchMethodException | InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
            return null;
        });

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Void> update(@Valid @RequestBody E objDto, @PathVariable Long id) {
        DOMAIN obj = (DOMAIN) service.fromDTO(objDto);
        obj.setId(id);
        service.update(obj);
        return ResponseEntity.noContent().build();
    }

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody E objDto) {
        DOMAIN obj = (DOMAIN) service.fromDTO(objDto);
        obj = (DOMAIN) service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
}
