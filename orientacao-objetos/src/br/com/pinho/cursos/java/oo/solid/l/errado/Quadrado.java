package br.com.pinho.cursos.java.oo.solid.l.errado;

public class Quadrado extends Retangulo {

    @Override
    public void setBase(double base) {
        super.setBase(base);
        super.setAltura(base);
    }

    @Override
    public void setAltura(double altura) {
        super.setBase(altura);
        super.setAltura(altura);
    }
}
