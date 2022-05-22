package br.com.pinho.cursos.java.monitoramento.actuator.controller;

import br.com.pinho.cursos.java.monitoramento.actuator.utils.GastarTempo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExemploController {

    @GetMapping("/sincrono")
    public void sincrono() {
        GastarTempo.execute(1000000000);
    }

    @GetMapping("/assincrono")
    public void assincrono() {
        new Thread(() -> GastarTempo.execute(1000000000)).start();
    }
}
