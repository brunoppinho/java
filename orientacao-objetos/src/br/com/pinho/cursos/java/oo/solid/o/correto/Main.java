package br.com.pinho.cursos.java.oo.solid.o.correto;

public class Main {

    public static void main(String[] args) {
        CLTista funcionario1 = new CLTista(10, 200, 300);
        PessoaJuridica funcionario2 = new PessoaJuridica(10, 200, 300);
        Terceirizado funcionario3 = new Terceirizado(10, 200, 300);

        System.out.println("O salário de F1 recebido foi de " + funcionario1.calculaSalario());
        System.out.println("O salário de F2 recebido foi de " + funcionario2.calculaSalario());
        System.out.println("O salário de F3 recebido foi de " + funcionario3.calculaSalario());
    }
}
