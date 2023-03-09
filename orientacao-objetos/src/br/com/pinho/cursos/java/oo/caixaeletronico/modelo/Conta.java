package br.com.pinho.cursos.java.oo.caixaeletronico.modelo;

public class Conta {
    private int numeroDaConta = 0;

    protected double saldo = 0;

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void adicionaSaldo(double valor) {
        saldo = saldo + valor;
    }

    public boolean removeSaldo(double valor) {
        if (saldo - valor >= 0) {
            saldo = saldo - valor;
            return true;
        } else {
            return false;
        }
    }
}
