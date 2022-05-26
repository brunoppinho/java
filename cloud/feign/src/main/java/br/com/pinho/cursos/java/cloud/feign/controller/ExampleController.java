package br.com.pinho.cursos.java.cloud.feign.controller;

import br.com.pinho.cursos.java.cloud.feign.gateway.eurekaclient.ExemploControllerApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ExampleController {

    private final ExemploControllerApi exemploControllerApi;

    public ExampleController(ExemploControllerApi communicateService) {
        this.exemploControllerApi = communicateService;
    }

    @GetMapping("hello")
    public String helloWorld() {
        return "Hello World - Feign App";
    }

    @GetMapping("communicate")
    public Map<String, String> communicate() {
        HashMap<String, String> map = new HashMap<>();
        map.put("client", "Hello World - Feign App");
        map.put("server", exemploControllerApi.helloWorld());
        return map;
    }

    @GetMapping("error")
    public String error() {
        throw new RuntimeException("Deu erro aqui!");
    }
}
