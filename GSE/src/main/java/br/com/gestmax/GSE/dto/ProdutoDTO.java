package br.com.gestmax.GSE.dto;

import br.com.gestmax.GSE.domain.*;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;

@Data
public class ProdutoDTO extends BasicDTO {
    private Long id;
    private String cdProduto;
    private String dsProduto;
    private String tpProduto;
    private Boolean stAtivo;
    private Integer qtBaseestrutura;
    private BigDecimal ftConversao;
    private String tpConversao;
    private Timestamp dtAtualizacao;
    private Boolean stLote;
    private BigDecimal psProduto;
    private BigDecimal vlIpipauta;
    private BigDecimal vlPispauta;
    private BigDecimal vlCofpauta;
    private Boolean stBloqueado;
    private String nrNcm;
    private String cdSegum;
    private BigDecimal psBruto;
    private String dsOrigem;
    private BigDecimal qtMultiplicador;
    private String cdEan;
    private Collection<ImpostoItem> impostoItems;
    private UnidadeMedida unidadeMedida;
    private Marca marca;
    private SubGrupoProduto subGrupoProduto;

    public ProdutoDTO(Produto produto) {
        super(produto);
    }
}
