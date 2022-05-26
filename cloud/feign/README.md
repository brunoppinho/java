# Feign

Feign é um cliente Web Server que foi feito com intuito de facilitar a integração entre APIS.

Ele possui uma integração com o Eureka que vai faze-lo ideal para nosso caso de uso.

# Configuração

Para configurar o feign basta adicionar a dependência e a linha em seguida em uma classe de configuração e o Feign
estará pronto para ser usado.

    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-feign</artifactId>
    </dependency>

> @EnableFeignClients

# Prática

[Service](/src/main/java/br/com/pinho/cursos/java/cloud/feign/gateway/eurekaclient/ExemploControllerApi.java)

# Bibliografia

https://spring.io/projects/spring-cloud-openfeign
https://www.baeldung.com/spring-cloud-openfeign