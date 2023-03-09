package br.com.pinho.cursos.java.oo.caixaeletronico.servicos;

import br.com.pinho.cursos.java.oo.caixaeletronico.modelo.Conta;
import br.com.pinho.cursos.java.oo.caixaeletronico.modelo.ContaChequeEspecial;
import br.com.pinho.cursos.java.oo.caixaeletronico.repository.ContaRepository;

import java.util.Scanner;

public class AbrirContaImpl implements AbrirConta {

    private final ContaRepository repository;

    public AbrirContaImpl(ContaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Conta execute() {
        Scanner entrada = new Scanner(System.in);
        Conta conta;
        System.out.println("Você deseja ter cheque especial? Digite SIM caso queira.");
        String resposta = entrada.nextLine();
        if ("SIM".equalsIgnoreCase(resposta)) {
            conta = new ContaChequeEspecial(100);
            System.out.println("Sua conta será criada com R$ 100,00 de limite para emergências.");
        } else {
            conta = new Conta();
        }
        repository.adiciona(conta);

        System.out.printf("Conta número %d atual é de R$ %.2f %n", conta.getNumeroDaConta(), conta.getSaldo());
        return conta;
    }
}
