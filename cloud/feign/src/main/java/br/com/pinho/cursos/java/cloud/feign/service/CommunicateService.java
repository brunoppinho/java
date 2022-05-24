package br.com.pinho.cursos.java.cloud.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client-example")
public interface CommunicateService {

    @GetMapping("hello")
    String execute();
}
