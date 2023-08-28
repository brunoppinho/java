package br.com.pinho.cursos.java.oo.exemplo;

import java.math.BigDecimal;

public class MainExemplo {

    public static void main(String[] args) {
        String senhaPadrao = "SENHAPADRAO";
        ContaRepository repository = new ContaRepository();
        Conta origem = new Conta();
        Conta destino = new Conta();
        origem.setSaldo(BigDecimal.TEN);
        destino.setSaldo(BigDecimal.TEN);
        repository.create(origem);
        repository.create(destino);
//        origem.transferir(senhaPadrao, "PIX", BigDecimal.ONE, destino);
        System.out.println("Saldo da conta de origem " + origem.getSaldo());
        System.out.println("Saldo da conta de destino " + destino.getSaldo());
    }


}
