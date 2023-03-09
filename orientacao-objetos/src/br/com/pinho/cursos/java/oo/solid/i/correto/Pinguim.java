package br.com.pinho.cursos.java.oo.solid.i.correto;

public class Pinguim implements Ave {

    @Override
    public void bicar() {
        System.out.println("Bicar");
    }

    @Override
    public void soltarPenas() {
        System.out.println("Soltar penas");
    }
}
