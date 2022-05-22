# Spring Boot Admin

Sprint Boot Admin é uma aplicação Web criada pelo Spring para realizar o monitoramento de outras aplicações que utilizam
o Spring Actuator.

Ela consegue gerenciar várias aplicações simultaneamente, obtendo todos os dados e métricas disponíveis pelo Spring
Actuator.

## Configurando Server

Adicionar a dependência abaixo

    <dependency>
        <groupId>de.codecentric</groupId>
        <artifactId>spring-boot-admin-starter-server</artifactId>
        <version>2.4.1</version>
    </dependency>

Adicionar a anotação em alguma classe de configuração.
> @EnableAdminServer

## Configurando Clientes

Para configurar um cliente para o nosso Spring Boot Admin, basta copiar a dependência abaixo no nosso POM e depois
adicionar no arquivo de propriedades o endereço do nosso Spring Boot Admin.

    <dependency>
        <groupId>de.codecentric</groupId>
        <artifactId>spring-boot-admin-starter-client</artifactId>
        <version>2.4.1</version>
    </dependency>

> spring.boot.admin.client.url=http://localhost:8080

# Notificações

## Mailhog

Servidor de e-mail que vai auxiliar o envio de e-mails.

> docker container run -p 1025:1025 -p 8025:8025 mailhog/mailhog

## Email

Podemos configurar o nosso servidor para enviar uma mensagem de erro cada vez que a aplicação estiver com a saúde
questionável.

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-mail</artifactId>
    </dependency>

> spring.mail.host=smtp.host.com
> spring.mail.username=user
> spring.mail.password=password
> spring.boot.admin.notify.mail.to=admin@example.com

# Bibliografia

* https://www.baeldung.com/spring-boot-admin
* https://medium.com/@gcbrandao/monitore-sua-api-com-spring-boot-admin-e-actuator-40e73a5e50b0
* https://www.javainuse.com/spring/boot-admin
