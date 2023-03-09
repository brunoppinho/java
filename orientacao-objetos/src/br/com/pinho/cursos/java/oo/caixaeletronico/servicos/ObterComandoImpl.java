package br.com.pinho.cursos.java.oo.caixaeletronico.servicos;

import java.util.Scanner;

public class ObterComandoImpl implements ObtemComando {

    @Override
    public int executar() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o comando desejado: ");
        return entrada.nextInt();
    }
}
