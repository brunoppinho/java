package br.com.pinho.cursos.java.monitoramento.actuator.metrics;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class SimpleMetric {

    private final Counter contador;
    private AtomicInteger medidorInteiro;
    private final Random rand = new Random();

    public SimpleMetric(MeterRegistry meterRegistry) {
        this.contador = meterRegistry.counter("contador_simples");
        this.medidorInteiro = meterRegistry.gauge("medidor_simples", new AtomicInteger(0));
    }

    @Scheduled(fixedRate = 1000)
    public void alteraValores() {
        contador.increment();
        medidorInteiro.set(rand.nextInt(100));
//        log.info("Contador: {}, medidor: {}", contador.count(), medidorInteiro);
    }
}
