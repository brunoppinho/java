package br.com.pinho.cursos.java.cloud.feign.gateway.eurekaclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@FeignClient("eureka-client-example")
public interface ExemploControllerApi {

    @GetMapping("hello")
    String helloWorld();

    @GetMapping("communicate")
    Map<String, String> communicate();
}
