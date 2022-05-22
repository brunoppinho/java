package br.com.pinho.cursos.java.monitoramento.actuator.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class StatusHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        Health.Builder status = Health.up();

        switch ((int) (System.currentTimeMillis() % 4)) {
            case 0:
                //STATUS 200 OK
                status = Health.up().withDetail("Resto 0", "Nossa aplicação não está saudável");
                break;

            case 1:
                //STATUS 503 OK
                status = Health.outOfService().withDetail("Resto 1", "Aplicação está fora de serviço");
                break;

            case 2:
                status = Health.unknown().withDetail("Resto 2", "Não foi possível saber se ela está funcionando!");
                break;

            case 3:
                //STATUS 200 OK
                //management.endpoint.health.status.http-mapping.WARN=400
                status = Health.status("WARN").withDetail("Resto 3", "Status personalizado" +
                        "funcionando!");
                break;
        }
        return status.build();
    }
}
