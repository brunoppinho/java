package br.com.pinho.cursos.java.oo.caixaeletronico.servicos;

import br.com.pinho.cursos.java.oo.caixaeletronico.repository.ContaRepository;

import java.util.Scanner;

public class ExecutarComandoEspecificoImpl implements ExecutarComandoEspecifico {

    private final Saque saque;
    private final AbrirConta abrirConta;
    private final Deposito deposito;
    private final ContaRepository repository;

    public ExecutarComandoEspecificoImpl() {
        this.repository = new ContaRepository();
        this.saque = new SaqueImpl(repository);
        this.abrirConta = new AbrirContaImpl(repository);
        this.deposito = new DepositoImpl(repository);
    }

    @Override
    public boolean executar(int comando) {
        boolean resultado = true;
        Scanner entrada = new Scanner(System.in);
        int numeroDaConta;
        double valor;

        switch (comando) {
            case 0:
                System.out.println("Encerrando o programa");
                resultado = false;
                break;

            case 1:
                System.out.println("Digite o numero da conta: ");
                numeroDaConta = entrada.nextInt();
                System.out.println("Digite o valor desejado para sacar: ");
                valor = entrada.nextDouble();
                saque.execute(valor, numeroDaConta);
                break;

            case 2:
                System.out.println("Digite o numero da conta: ");
                numeroDaConta = entrada.nextInt();
                System.out.println("Digite o valor desejado para depositar: ");
                valor = entrada.nextDouble();
                deposito.execute(valor, numeroDaConta);
                break;

            case 3:
                abrirConta.execute();
                break;

            default:
                System.out.println("Comando inválido!");
                break;
        }

        System.out.println();
        return resultado;
    }
}
