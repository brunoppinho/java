package br.com.pinho.cursos.java.oo.solid.o.correto;

public class FuncionarioCalculadora extends Funcionario{

    private final CalculaRecebimento calculaRecebimento;
    public FuncionarioCalculadora(double valorHora, double horasMensaisContratuais, double horasMensaisTrabalhadas, CalculaRecebimento calculaRecebimento) {
        super(valorHora, horasMensaisContratuais, horasMensaisTrabalhadas);
        this.calculaRecebimento = calculaRecebimento;
    }


    public double calculaSalario() {
        return calculaRecebimento.calculaSalario(getHorasMensaisContratuais(), getValorHora(),
                getHorasMensaisTrabalhadas());
    }
}
