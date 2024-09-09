package br.com.fiap.fintech.modelo;

import java.time.LocalDate;

public abstract class Lancamento {

    private String descricao;
    private Double valor;
    private LocalDate data;

    public Lancamento(String descricao, Double valor, LocalDate data) {
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }

    public LocalDate getData() {
        return data;
    }

}
