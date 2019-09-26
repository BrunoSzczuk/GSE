package br.com.gestmax.GSE.domain.enums;

public enum Perfil {

    ADMIN(1, "ROLE_ADMIN"),
    PROFESSOR(2, "ROLE_USUARIO");

    private int cod;
    private String descricao;

     Perfil(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public int getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Perfil toEnum(Integer cod) {
        if (cod == null) {
            return null;
        }
        for (Perfil x : Perfil.values()) {
            if (cod.equals(x.getCod())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Id inválido: " + cod);
    }
    public static Perfil toEnum(String descricao) {
        if (descricao == null) {
            return null;
        }
        for (Perfil x : Perfil.values()) {
            if (descricao.equals(x.getDescricao())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Descricao inválida: " + descricao);
    }

}
