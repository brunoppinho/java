package br.com.pinho.cursos.java.oo.caixaeletronico.servicos;

import java.util.Scanner;

public class SelecionaComando {

    private final ListarComandos listarComandos;
    private final ObtemComando obtemComando;
    private final ExecutarComandoEspecifico executarComandoEspecifico;

    public SelecionaComando() {
        listarComandos = new ListarComandosColorido();
        obtemComando = new ObterComandoImpl();
        executarComandoEspecifico = new ExecutarComandoEspecificoImpl();
    }

    public boolean executar() {
//        imprimeListaComandos();
//        int comando = obtemComando();
//        return executaComandoEspecifico(comando);
        listarComandos.executar();
        int comando = obtemComando.executar();
        return executarComandoEspecifico.executar(comando);

    }

    /**
     * Substituida por listarComandos.executar();
     */
    private void imprimeListaComandos() {
        System.out.println("Digite o comando desejado de acordo com as opções abaixo:");
        System.out.println("0 para encerrar.");
        System.out.println("1 para efetuar um saque.");
        System.out.println("2 para efetuar um depósito.");
    }

    /**
     * Substituida por obtemComando.executar();
     */
    private int obtemComando() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o comando desejado: ");
        return entrada.nextInt();
    }

    /**
     * Substituida por executarComandoEspecifico.executar();
     */
    private boolean executaComandoEspecifico(int comando) {
        boolean resultado = true;

        switch (comando) {
            case 0:
                System.out.println("Encerrando o programa");
                resultado = false;
                break;

            case 1:
                System.out.println("Sacando dinheiro");
                break;

            case 2:
                System.out.println("Depositando dinheiro");
                break;

            default:
                System.out.println("Comando inválido!");
                break;
        }

        return resultado;
    }
}
