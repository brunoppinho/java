package br.com.pinho.cursos.java.oo.aula;

import java.util.ArrayList;
import java.util.List;

public class GenericsList {

    public static void main(String[] args) {
        List lista = new ArrayList();
        lista.add("a");
        lista.add(1);

        System.out.println(lista);

        String elemento = (String) lista.get(0);
        Integer elemento2 = (Integer) lista.get(1);

        List<Integer> lista2 = new ArrayList<>();
            lista.add(1);
//        lista2.add("a");
        lista2.add(1);
        System.out.println(lista2);
    }
}
