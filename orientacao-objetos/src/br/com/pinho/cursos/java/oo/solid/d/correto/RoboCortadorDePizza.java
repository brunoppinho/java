package br.com.pinho.cursos.java.oo.solid.d.correto;

public class RoboCortadorDePizza {

    private ObjetoCortante objetoCortante;

    public void setObjetoCortante(ObjetoCortante objetoCortante) {
        this.objetoCortante = objetoCortante;
    }

    void cortar(String saborDaPizza) {
        objetoCortante.cortar(saborDaPizza);
        System.out.println("Repetir isso nos demais pedaços");
    }
}
