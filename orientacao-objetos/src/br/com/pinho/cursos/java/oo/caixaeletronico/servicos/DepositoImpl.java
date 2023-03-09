package br.com.pinho.cursos.java.oo.caixaeletronico.servicos;

import br.com.pinho.cursos.java.oo.caixaeletronico.modelo.Conta;
import br.com.pinho.cursos.java.oo.caixaeletronico.repository.ContaRepository;

public class DepositoImpl implements Deposito {

    private final ContaRepository repository;

    public DepositoImpl(ContaRepository repository) {
        this.repository = repository;
    }

    @Override
    public void execute(double valor, int numeroDaConta) {
        Conta conta = repository.findById(numeroDaConta);
        conta.adicionaSaldo(valor);
        System.out.printf("Saldo da conta %d atual é de R$ %.2f %n", conta.getNumeroDaConta(), conta.getSaldo());
    }
}
