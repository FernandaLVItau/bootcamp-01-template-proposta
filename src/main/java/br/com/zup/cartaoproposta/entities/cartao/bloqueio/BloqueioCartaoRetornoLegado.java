package br.com.zup.cartaoproposta.entities.cartao.bloqueio;

import java.time.LocalDateTime;

/**
 * Contagem de carga intrínseca da classe: 0
 */

public class BloqueioCartaoRetornoLegado {

    private String id;
    private LocalDateTime bloqueadoEm;
    private String sistemaResponsavel;
    private boolean ativo;

    @Deprecated
    public BloqueioCartaoRetornoLegado(){}

    public BloqueioCartaoRetornoLegado(String id, LocalDateTime bloqueadoEm, String sistemaResponsavel, boolean ativo) {
        this.id = id;
        this.bloqueadoEm = bloqueadoEm;
        this.sistemaResponsavel = sistemaResponsavel;
        this.ativo = ativo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBloqueadoEm(LocalDateTime bloqueadoEm) {
        this.bloqueadoEm = bloqueadoEm;
    }

    public void setSistemaResponsavel(String sistemaResponsavel) {
        this.sistemaResponsavel = sistemaResponsavel;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
