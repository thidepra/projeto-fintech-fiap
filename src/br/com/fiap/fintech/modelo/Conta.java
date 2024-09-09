package br.com.fiap.fintech.modelo;

import java.util.List;

public class Conta {

    private double saldo;
    private Usuario usuario;
    private List<Lancamento> lancamentos;
    private boolean contaAtiva;

    public Conta(double saldo, Usuario usuario, List<Lancamento> lancamentos, boolean contaAtiva) {
        this.saldo = saldo;
        this.usuario = usuario;
        this.lancamentos = lancamentos;
        this.contaAtiva = contaAtiva;
    }

    public double getSaldo() {
        return saldo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Lancamento> getLancamentos() {
        return lancamentos;
    }

    public void ehContaAtiva(boolean contaAtiva) {
        if (contaAtiva == true) {
            System.out.println("A conta está ativa!");
        } else {
            System.out.println("A conta está inativa!");
        }
    }

    public void inativarConta() {
        contaAtiva = false;
    }

}
