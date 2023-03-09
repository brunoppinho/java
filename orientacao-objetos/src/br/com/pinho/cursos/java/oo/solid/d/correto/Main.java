package br.com.pinho.cursos.java.oo.solid.d.correto;


public class Main {

    public static void main(String[] args) {
        RoboCortadorDePizza robo = new RoboCortadorDePizza();
        robo.setObjetoCortante(new Machado());
        robo.cortar("Mussarela");

        RoboCortadorDePizza robo2 = new RoboCortadorDePizza();
        robo2.setObjetoCortante(new CortadorDePizza());
        robo2.cortar("Mussarela");
    }
}
