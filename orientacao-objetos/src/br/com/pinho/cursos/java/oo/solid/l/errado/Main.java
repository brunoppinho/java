package br.com.pinho.cursos.java.oo.solid.l.errado;

public class Main {

    public static void main(String[] args) {
        Quadrado retangulo = new Quadrado();
//        Retangulo retangulo = new Retangulo();
        retangulo.setBase(2);
        retangulo.setAltura(3);
        System.out.println("A área do retangulo é de " + retangulo.area());
    }
}
