package br.com.pinho.cursos.java.monitoramento.actuator.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ExemploHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        Health.Builder status = Health.up();
        if (System.currentTimeMillis() % 2 == 0) {
            status = Health.down().withDetail("motivo 1", "O tempo é par");
        }
        // Adicionando detalhes extras
        Map<String, String> detalhes = new HashMap<>();
        detalhes.put("Exemplo", "Alguma coisa");
        status.withDetails(detalhes);
        return status.build();
    }
}
