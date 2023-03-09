package br.com.pinho.cursos.java.oo.solid.i.errado;

public class Pardal implements Ave {

    @Override
    public void voar() {
        System.out.println("Bateu asas e voou!");
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
