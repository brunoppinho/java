package br.com.pinho.cursos.java.oo.solid.i.errado;

public class Pinguim implements Ave {

    @Override
    public void voar() {
        throw new RuntimeException("Pinguim não voa!");
    }

    @Override
    public void bicar() {
        System.out.println("Bicar");
    }

    @Override
    public void soltarPenas() {
        System.out.println("Soltar penas");
    }
}
