package br.com.pinho.cursos.java.oo.caixaeletronico.servicos;

public class ListarComandosImpl implements ListarComandos {

    @Override
    public void executar() {
        System.out.println("Digite o comando desejado de acordo com as opções abaixo:");
        System.out.println("0 para encerrar.");
        System.out.println("1 para efetuar um saque.");
        System.out.println("2 para efetuar um depósito.");
        System.out.println("3 para abrir uma conta.");

    }
}
