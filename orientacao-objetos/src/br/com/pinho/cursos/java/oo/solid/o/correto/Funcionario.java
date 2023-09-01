package br.com.pinho.cursos.java.oo.solid.o.correto;

public class Funcionario {

    private double valorHora;
    private double horasMensaisContratuais;
    private double horasMensaisTrabalhadas;
    private CalculaRecebimento calculaRecebimento;

    public Funcionario(double valorHora, double horasMensaisContratuais, double horasMensaisTrabalhadas, CalculaRecebimento calculaRecebimento) {
        this.valorHora = valorHora;
        this.horasMensaisContratuais = horasMensaisContratuais;
        this.horasMensaisTrabalhadas = horasMensaisTrabalhadas;
        this.calculaRecebimento = calculaRecebimento;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorasMensaisContratuais() {
        return horasMensaisContratuais;
    }

    public void setHorasMensaisContratuais(double horasMensaisContratuais) {
        this.horasMensaisContratuais = horasMensaisContratuais;
    }

    public double getHorasMensaisTrabalhadas() {
        return horasMensaisTrabalhadas;
    }

    public void setHorasMensaisTrabalhadas(double horasMensaisTrabalhadas) {
        this.horasMensaisTrabalhadas = horasMensaisTrabalhadas;
    }

    public double calculaSalario() {
        return calculaRecebimento.calculaSalario(horasMensaisContratuais, valorHora, horasMensaisTrabalhadas);
    }
}
