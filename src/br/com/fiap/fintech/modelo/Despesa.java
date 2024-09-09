package br.com.fiap.fintech.modelo;

import java.time.LocalDate;

public class Despesa extends Lancamento {

    private CategoriaDespesa categoria;

    public Despesa(CategoriaDespesa categoria, String descricao, Double valor, LocalDate data) {
        super(descricao, valor, data);
        this.categoria = categoria;
    }

    public CategoriaDespesa getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Lançamento - Despesa: " +
                " Valor: R$ " + getValor() +
                ", Categoria: " + categoria.getNome() +
                ", Descrição: " + getDescricao() +
                ", Data: " + getData();
    }

}
