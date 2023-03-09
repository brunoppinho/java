package br.com.pinho.cursos.java.oo.solid.i.errado;

public class Main {

    public static void main(String[] args) {
        Ave ave1 = new Pardal();
        Ave ave2 = new Pinguim();

        ave2.voar();
    }
}
