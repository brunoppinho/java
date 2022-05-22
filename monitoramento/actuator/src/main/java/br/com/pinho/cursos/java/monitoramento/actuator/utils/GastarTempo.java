package br.com.pinho.cursos.java.monitoramento.actuator.utils;

import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

@UtilityClass
@Slf4j
public class GastarTempo {

    public void execute(long tempo) {
        log.info("Iniciando.");
        double l = 0;
        for (int i = 0; i < tempo; i++) {
            l += i / System.currentTimeMillis();
        }
        log.info("Finalizando.");
    }

}
