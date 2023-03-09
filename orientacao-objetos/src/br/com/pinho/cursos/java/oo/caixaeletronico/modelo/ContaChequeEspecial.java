package br.com.pinho.cursos.java.oo.caixaeletronico.modelo;

public class ContaChequeEspecial extends Conta {

    private double limite = 0;

    public ContaChequeEspecial(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public boolean removeSaldo(double valor) {
        if (saldo + limite - valor >= 0) {
            saldo = saldo - valor;
            return true;
        } else {
            return false;
        }
    }
}
