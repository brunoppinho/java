package br.com.pinho.cursos.java.oo.exemplo;

import java.math.BigDecimal;
import java.util.Random;

public class Conta {

    private String numeroConta;
    private String nomeTitular;
    private BigDecimal saldo;
    private String senha;

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
//
//    public void setSenha(String senha) {
//        if (senha == null) {
//            System.out.println("Senha não pode ser vazia.");
//        } else {
//            this.senha = senha;
//        }
//    }
//
//    public boolean validaSenha(String senha) {
//        return this.senha.equals(senha);
//    }
//
//    public Conta() {
//        this.senha = "SENHAPADRAO";
//        this.numeroConta = Integer.toString(new Random().nextInt(100000));
//    }
//
//    public String getNumeroConta() {
//        return numeroConta;
//    }
//
//    public String getNomeTitular() {
//        return nomeTitular;
//    }
//
//    public void setNomeTitular(String nomeTitular) {
//        this.nomeTitular = nomeTitular;
//    }
//
//    public BigDecimal getSaldo() {
//        return saldo;
//    }
//
//    public void setSaldo(BigDecimal saldo) {
//        this.saldo = saldo;
//    }
//
//    public Conta transferir(String senha, String metodo, BigDecimal valor, Conta destino) {
//        if (validaSenha(senha)) {
//            if ("PIX".equalsIgnoreCase(metodo)) {
//                transfereDinheiro(valor, destino);
//                System.out.println("Mensagem de integração com sistema PIX");
//            } else if("TED".equalsIgnoreCase(metodo)) {
//                transfereDinheiro(valor, destino);
//                System.out.println("Mensagem de integração com sistema TED");
//            } else {
//                transfereDinheiro(valor, destino);
//                System.out.println("Mensagem de integração com sistema de transferência interna");
//
//            }
//        } else {
//            System.out.println("Senha inválida. Tente novamente.");
//        }
//        return this;
//    }
//
//    private void transfereDinheiro(BigDecimal valor, Conta destino) {
//        if(valor.compareTo(saldo) > 0) {
//            System.out.println("Saldo insuficiente");
//        } else {
//            saldo = saldo.subtract(valor);
//            saldo = saldo.subtract(BigDecimal.ONE);
//            destino.setSaldo(destino.getSaldo().add(valor));
//        }
//    }
}
