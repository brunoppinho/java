package br.com.pinho.cursos.java.oo.solid.o.correto;

public class CLTista extends Funcionario implements CalculaRecebimento {

    public CLTista(double valorHora, double horasMensaisContratuais, double horasMensaisTrabalhadas) {
        super(valorHora, horasMensaisContratuais, horasMensaisTrabalhadas);
    }

    @Override
    public double calculaSalario() {
        double salario = 0;
        salario = getHorasMensaisContratuais() * getValorHora();
        salario += (getHorasMensaisTrabalhadas() - getHorasMensaisContratuais()) * 1.5 * getValorHora();
        return salario;
    }
}
