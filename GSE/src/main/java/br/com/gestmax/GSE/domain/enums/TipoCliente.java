package br.com.gestmax.GSE.domain.enums;

import lombok.Getter;

public enum TipoCliente {
    SOLIDARIO("Solidário"),
    REVENDEDOR("Revendedor"),
    CONSUMIDOR_FINAL("Consumidor Final");
    @Getter
    String nome;

    TipoCliente(String nome) {
        this.nome = nome;
    }
}
