package br.com.gestmax.GSE.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
public class CredenciaisDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String username;
    private String senha;

}
