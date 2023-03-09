package br.com.pinho.cursos.java.oo.solid.d.correto;

public class Machado implements ObjetoCortante{
    @Override
    public void cortar(String algo) {
        System.out.println("Pegar machado");
        System.out.println("Bater o machado na pizza");
    }
}
