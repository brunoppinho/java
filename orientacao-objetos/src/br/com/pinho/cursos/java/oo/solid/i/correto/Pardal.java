package br.com.pinho.cursos.java.oo.solid.i.correto;

public class Pardal implements AveQueVoa {

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
