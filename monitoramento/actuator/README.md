# Actuator

Spring Actuator inclui uma série de funcionalidades que te ajudam a monitorar sua aplicação. Com opções ao uso de HTTP e
JXM, o Actuator vai automaticamente gerar métricas de auditoria, saúde e outras métricas.

Para adicionar o actuator basta adicionar a dependência que a aplicação já vai começar a fornecer algumas
funcionalidades habilitadas por padrão.

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-actuator</artifactId>
    </dependency>

Vamos utilizar o modo HTTP do actuator. Todos os endpoints podem ser acessados por **/actuator**. Esse endpoint pode ser
alterado com a linha abaixo no arquivo de propriedades.
> management.endpoints.web.base-path=/manage

# Funcionalidades

A lista de todas as funcionalidades podam ser encontrada
em: https://docs.spring.io/spring-boot/docs/current/actuator-api/htmlsingle/

* /auditevents — Lista todos os eventos de auditoria de segurança como login/logout. Suporta filtros
    * https://www.baeldung.com/spring-boot-authentication-audit
* /beans — Lista todos os beans da aplicação
* /caches — Lista os caches da aplicação
* /conditions — Condições das configurações / auto-configurações de classes.
* /configprops — Lista todos os beans @ConfigurationProperties.
* /env — Retorna as variáveis de ambiente
* /flyway — Detalhes de *migrations* utilizando flyway
* /health — Detalhes da saúde da aplicação
* /heapdump — The heapdump endpoint provides a heap dump from the application’s JVM.
* /info — Informações personalizadas da aplicação
* /liquibase — Igual ao flyway porém utilizando o liquibase
* /logfile — Retorna os logs da aplicação
    * Necessário que o log esteja apontando para um
      arquivo: https://docs.spring.io/spring-boot/docs/current/reference/html/features.html#features.logging.file-output
* /loggers — Verifica e altera os níveis de log da aplicação
* /metrics — Métricas gerais da aplicação. Pode conter métricas personalizadas
* /prometheus — Retorna as métricas do endpoint anterior para ser compatível com o prometheus
* /scheduledtasks — Detalhe das operações agendadas da aplicação
* /sessions lists HTTP sessions given we are using Spring Session.
* /shutdown performs a graceful shutdown of the application.
* /threaddump dumps the thread information of the underlying JVM.

## Health

Health é o medidor responsável por indicar a saúde da aplicação. Nele podemos implementar algumas rotinas para auxiliar
na indicação se a aplicação está funcionando corretamente ou não.

Esse endpoint é muito utilizado em gestores de containers como o Kubernetes, para saber se uma determinada aplicação
está funcionando normalmente ou precisa ser reiniciada, ou ter o fluxo para ela interrompido.

Podemos criar um **org.springframework.boot.actuate.health.HealthIndicator** personalizado que pode monitorar o recurso
que quisermos.

Por padrão o Spring já faz um monitoramento de alguns recursos para saber se a aplicação está saudável.

[Exemplo](/src/main/java/br/com/pinho/cursos/java/monitoramento/actuator/health/ExemploHealthIndicator.java)

É possível também ter outros status além de up e down.

[Exemplo](/src/main/java/br/com/pinho/cursos/java/monitoramento/actuator/health/StatusHealthIndicator.java)

## Info

Podemos personalizar o endpoint info.

Primeiro devemos habilitar a exposição dos itens do info no actuator
> management.info.env.enabled = true

Podemos personalisar isso de forma estática. Alterando o que vai ser exibido diretamente dos arquivos de propriedades.

> info.tag1.tag2=valor
> info.tag1.tag3=valor
> info.tag4=valor

Uma segunda opção é implementar um org.springframework.boot.actuate.info.InfoContributor.

[Exemplo](/src/main/java/br/com/pinho/cursos/java/monitoramento/actuator/info/HorarioInfoContributor.java)

# Spring Boot Admin client

    <dependency>
        <groupId>de.codecentric</groupId>
        <artifactId>spring-boot-admin-starter-client</artifactId>
        <version>2.4.1</version>
    </dependency>

> spring.boot.admin.client.url=http://localhost:9390

# Bibliografia

* https://docs.spring.io/spring-boot/docs/current/actuator-api/htmlsingle/
* https://www.baeldung.com/spring-boot-actuators
* https://www.zup.com.br/blog/spring-actuator
* https://devkico.itexto.com.br/?p=3205
* https://springframework.guru/actuator-in-spring-boot/
* https://howtodoinjava.com/spring-boot/actuator-endpoints-example/