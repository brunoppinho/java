package br.com.pinho.cursos.java.oo.caixaeletronico.servicos;

import br.com.pinho.cursos.java.oo.caixaeletronico.modelo.Conta;
import br.com.pinho.cursos.java.oo.caixaeletronico.repository.ContaRepository;

public class SaqueImpl implements Saque {

    private final ContaRepository repository;

    public SaqueImpl(ContaRepository repository) {
        this.repository = repository;
    }

    @Override
    public double execute(double valor, int numeroDaConta) {
        Conta conta = repository.findById(numeroDaConta);
        if (conta == null) {
            System.out.println("Conta inexistente.");
            return 0;
        } else {
            boolean funcionou = conta.removeSaldo(valor);
            if (funcionou) {
                System.out.println("Saque executado com sucesso.");
                System.out.printf("Saldo da conta %d atual é de R$ %.2f %n", conta.getNumeroDaConta(), conta.getSaldo());
                return valor;
            } else {
                System.out.println("Não foi possível sacar o valor desejado.");
                return 0;
            }

        }
    }

}
