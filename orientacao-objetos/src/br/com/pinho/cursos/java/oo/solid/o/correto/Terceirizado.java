package br.com.pinho.cursos.java.oo.solid.o.correto;

public class Terceirizado extends Funcionario implements CalculaRecebimento {

    public Terceirizado(double valorHora, double horasMensaisContratuais, double horasMensaisTrabalhadas) {
        super(valorHora, horasMensaisContratuais, horasMensaisTrabalhadas);
    }

    @Override
    public double calculaSalario() {
        double salario = 0;
        salario = getHorasMensaisContratuais() * getValorHora();
        return salario;
    }
}
