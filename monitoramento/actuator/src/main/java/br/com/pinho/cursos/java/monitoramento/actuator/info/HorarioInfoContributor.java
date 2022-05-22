package br.com.pinho.cursos.java.monitoramento.actuator.info;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

@Component
public class HorarioInfoContributor implements InfoContributor {

    private int contador = 0;

    @Override
    public void contribute(Info.Builder builder) {
        contador++;
        Map<String, String> detalhes = new HashMap<>();

        detalhes.put("Hora", LocalTime.now().toString());
        detalhes.put("Data", LocalDate.now().toString());
        detalhes.put("Quantas vezes info foi acessado", String.valueOf(contador));

        builder.withDetail("Horário", detalhes);
    }
}
