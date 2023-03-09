package br.com.pinho.cursos.java.oo.solid.o.correto;

public class PessoaJuridica extends Funcionario implements CalculaRecebimento {

    public PessoaJuridica(double valorHora, double horasMensaisContratuais, double horasMensaisTrabalhadas) {
        super(valorHora, horasMensaisContratuais, horasMensaisTrabalhadas);
    }

    @Override
    public double calculaSalario() {
        double salario = 0;
        salario = getHorasMensaisTrabalhadas() * getValorHora();
        return salario;
    }
}
