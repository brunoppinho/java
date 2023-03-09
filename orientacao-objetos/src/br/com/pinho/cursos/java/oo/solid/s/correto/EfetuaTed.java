package br.com.pinho.cursos.java.oo.solid.s.correto;

import br.com.pinho.cursos.java.oo.caixaeletronico.modelo.Conta;

public class EfetuaTed {

    public void executa(Conta conta, double valor) {
        solicitaAutorizacaoBacen(conta);
        conta.removeSaldo(valor);
        System.out.println("Gera comprovante TED");
    }

    private void solicitaAutorizacaoBacen(Conta conta) {
        System.out.println("Envia solicitação ao BACEN");
    }
}
