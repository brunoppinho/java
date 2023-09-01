package br.com.pinho.cursos.java.oo.solid.o.correto;

public class Main {

    public static void main(String[] args) {
        FuncionarioCalculadora clTista = new FuncionarioCalculadora(10, 200, 300, new CLTista());
        FuncionarioCalculadora pessoaJuridica = new FuncionarioCalculadora(10, 200, 300, new PessoaJuridica());
        FuncionarioCalculadora terceirizado = new FuncionarioCalculadora(10, 200, 300, new Terceirizado());

        System.out.println("O salário de F1 recebido foi de " + clTista.calculaSalario());
        System.out.println("O salário de F2 recebido foi de " + pessoaJuridica.calculaSalario());
        System.out.println("O salário de F3 recebido foi de " + terceirizado.calculaSalario());
    }
}
