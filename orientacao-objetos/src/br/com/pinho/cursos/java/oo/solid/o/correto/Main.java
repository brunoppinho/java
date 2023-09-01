package br.com.pinho.cursos.java.oo.solid.o.correto;

public class Main {

    public static void main(String[] args) {
        Funcionario clTista = new Funcionario(10, 200, 300, new CLTista());
        Funcionario pessoaJuridica = new Funcionario(10, 200, 300, new PessoaJuridica());
        Funcionario terceirizado = new Funcionario(10, 200, 300, new Terceirizado());

        System.out.println("O salário de F1 recebido foi de " + clTista.calculaSalario());
        System.out.println("O salário de F2 recebido foi de " + pessoaJuridica.calculaSalario());
        System.out.println("O salário de F3 recebido foi de " + terceirizado.calculaSalario());
    }
}
