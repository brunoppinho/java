package br.com.pinho.cursos.java.cloud.eurekaclient.controller;

import br.com.pinho.cursos.java.cloud.eurekaclient.service.CommunicateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class ExampleController implements ExemploControllerApi {

    private final CommunicateService service;

    public String helloWorld() {
        return "Hello World - Eureka Client App";
    }

    public Map<String, String> communicate() {
        HashMap<String, String> map = new HashMap<>();
        map.put("client", "Hello World - Eureka Client App");
        map.put("server", service.execute());
        return map;
    }
}
