package br.com.pinho.cursos.java.oo.solid.d.correto;

public class CortadorDePizza implements ObjetoCortante {

    @Override
    public void cortar(String algo) {
        System.out.println("Pegar cortador de pizza");
        System.out.println("Girar a parte cortante sobre a pizza");
        System.out.println("Deslizar ela até o outro lado da pizza");
    }
}
