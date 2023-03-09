package br.com.pinho.cursos.java.oo.caixaeletronico.servicos;

public class ListarComandosColorido implements ListarComandos {

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLACK = "\u001B[30m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_WHITE = "\u001B[37m";

    @Override
    public void executar() {
        System.out.println(ANSI_BLUE + "Digite o comando desejado de acordo com as opções abaixo:" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "0" + ANSI_RED + " para encerrar." + ANSI_RESET);
        System.out.println(ANSI_GREEN + "1" + ANSI_PURPLE + " para efetuar um saque." + ANSI_RESET);
        System.out.println(ANSI_GREEN + "2" + ANSI_CYAN + " para efetuar um depósito." + ANSI_RESET);
        System.out.println(ANSI_GREEN + "3" + ANSI_YELLOW + " para abrir uma conta." + ANSI_RESET);
    }
}
