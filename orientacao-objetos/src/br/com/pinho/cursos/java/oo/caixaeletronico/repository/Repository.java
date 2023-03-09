package br.com.pinho.cursos.java.oo.caixaeletronico.repository;

import java.util.List;

public interface Repository<T> {

    List<T> findAll();

    T findById(int id);

    void adiciona(T objeto);

}
