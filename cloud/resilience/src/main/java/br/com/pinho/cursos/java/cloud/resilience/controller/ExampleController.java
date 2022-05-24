package br.com.pinho.cursos.java.cloud.resilience.controller;

import br.com.pinho.cursos.java.cloud.resilience.service.CommunicateService;
import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import io.github.resilience4j.timelimiter.annotation.TimeLimiter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
public class ExampleController {

    private final CommunicateService service;

    public ExampleController(CommunicateService communicateService) {
        this.service = communicateService;
    }

    @GetMapping("hello")
    public String helloWorld() {
        return "Hello World - Feign App";
    }

    @GetMapping("communicate")
    public Map<String, String> communicate() {
        HashMap<String, String> map = new HashMap<>();
        map.put("client", "Hello World - Resilience4J");
        map.put("server", service.hello());
        return map;
    }

    @GetMapping("communicate/error")
//    @Retry(name = "communicate-with-error")
//    @CircuitBreaker(name = "communicate-with-error")
    @RateLimiter(name = "communicate-with-error")
//    @Bulkhead(name = "communicate-with-error")
    public Map<String, String> communicateWithError() {
        log.info("Tentando...");
        HashMap<String, String> map = new HashMap<>();
        map.put("client", "Hello World - Resilience4J");
        map.put("server", service.error());
        return map;

    }

    public Map<String, String> retentativa(Exception ex) {
        log.info("Retentando");
        throw new RuntimeException("Deu ruim de novo!");
    }

    public Map<String, String> fallback(Exception ex) {
        log.info("Circuit Break");
        HashMap<String, String> map = new HashMap<>();
        map.put("client", "Hello World - Resilience4J");
        map.put("server", "Fallback");
        return map;
    }
}
