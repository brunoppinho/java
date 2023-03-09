package br.com.pinho.cursos.java.oo.caixaeletronico;

import br.com.pinho.cursos.java.oo.caixaeletronico.servicos.SelecionaComando;

/**
 * Seleciona a operação a ser executada.
 * <p>
 * 1. Imprima no terminal quais são os comandos possíveis
 * <p>
 * 0 Sair
 * 1 Saque
 * 2 Depósito
 * <p>
 * 2. Solicita um comando a ser digitado no terminal pelo cliente
 * Solicita o número da conta e os demais parâmetros para executar a função solicitada
 */
public class CaixaEletronicoApp {

    public static void main(String[] args) {
        System.out.println("Caixa eletrônico ligado!");
        SelecionaComando selecionaComando = new SelecionaComando();

        while (selecionaComando.executar()) {
            System.out.println("Executando um novo comando!");
        }

        System.out.println("Caixa eletrônico desligando!");

    }
}
