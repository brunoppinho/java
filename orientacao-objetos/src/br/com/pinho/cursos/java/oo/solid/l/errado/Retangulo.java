package br.com.pinho.cursos.java.oo.solid.l.errado;

public class Retangulo {

    private double base;
    private double altura;

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area() {
        return base * altura;
    }
}
