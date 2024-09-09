package br.com.fiap.fintech.modelo;

import java.time.LocalDate;

public class Receita extends Lancamento{

    private CategoriaReceita categoria;

    public Receita(CategoriaReceita categoria, String descricao, Double valor, LocalDate data) {
        super(descricao, valor, data);
        this.categoria = categoria;
    }

    public CategoriaReceita getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Lançamento - Receita: " +
                " Valor: R$ " + getValor() +
                ", Categoria: " + categoria.getNome() +
                ", Descrição: " + getDescricao() +
                ", Data: " + getData();
    }

}
