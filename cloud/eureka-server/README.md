# Eureka

O **Spring Cloud Netflix Eureka** é um serviço de discovery do lado do cliente. Aonde o cliente não precisa saber o
endereço e a porta do serviço de destino. Isso facilita a utilização de um ambiente distribuído.

# Servidor

Para criarmos um servidor eureka devemos criar um projeto novo e adicionar as dependências.

    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
    </dependency>
    
    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>org.springframework.cloud</groupId>
                <artifactId>spring-cloud-starter-parent</artifactId>
                <version>Greenwich.RELEASE</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>

Também temos que adicionar a anotação em uma classe de configuração.

> @EnableEurekaServer

Por último no arquivo de propriedades devemos colocar as seguintes propriedades.

[application.properties](/src/main/resources/application.properties)

Observar o endereço http://localhost:8761/

# Clientes

Após termos o servidor eureka rodando precisamos cadastrar todos nossos serviços que devem ser gerenciados pelo eureka.
Para isso adicione a seguinte dependência:

    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-netflix-eureka-starter</artifactId>
    </dependency>

Adicione também em uma classe de configuração

> @EnableDiscoveryClient

Também é preciso atualizar o arquivo de propriedades.

[application.properties](../eureka-client/src/main/resources/application.properties)

Após isso a aplicação vai se registrar no Eureka e as aplicações que quiserem poder obter os dados de endereço.

Uma forma para obter o endereço de outras aplicações é como o arquivo abaixo

[Service](../eureka-client/src/main/java/br/com/pinho/cursos/java/cloud/eurekaclient/service/CommunicateService.java)

Podemos fazer isso de uma forma mais simples usando o [Feign](../feign/README.md)

# Bibliografia

* https://www.baeldung.com/spring-cloud-netflix-eureka
* https://www.infoq.com/br/articles/desmistificando-spring-cloud-netflix/
* https://medium.com/@michellibrito/netflix-eureka-comunica%C3%A7%C3%A3o-entre-microservices-383d32d39506