package br.com.pinho.cursos.java.oo.exemplo;

import java.util.List;

public interface Repository<T> {

    T findOne(int id);
    List<T> findAll();
    T create(T objeto);
    void delete(T objeto);
    T update(T objeto);
}
