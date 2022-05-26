package br.com.pinho.cursos.java.cloud.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

public interface ExemploControllerApi {

    @GetMapping("hello")
    String helloWorld();

    @GetMapping("communicate")
    Map<String, String> communicate();
}
