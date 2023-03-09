package br.com.pinho.cursos.java.oo.solid.s.errado;

import br.com.pinho.cursos.java.oo.caixaeletronico.modelo.Conta;

public class OperacoesBancarias {

    public void efetuaTed(Conta conta, double valor) {
        autorizaTransacao(conta, valor);
        System.out.println("Gera comprovante TED");
    }

    public void efetuaPix(Conta conta, double valor) {
        autorizaTransacao(conta, valor);
        System.out.println("Gera comprovante Pix");
    }

    public void pagarBoleto(Conta conta, double valor) {
        autorizaTransacao(conta, valor);
        System.out.println("Gera comprovante Boleto");

    }

    /*
     * Alterar regra de autorização
     * Horário. Sistema
     */
    private void autorizaTransacao(Conta conta, double valor) {
        System.out.println("Envia solicitação ao BACEN");
        if (valor > conta.getSaldo()) {
            System.out.println("Não autorizado");
        } else {
            conta.removeSaldo(valor);
        }
    }
}
