package br.com.pinho.cursos.java.cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
//@EnableWebFluxSecurity
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

//	@Bean
//	public SecurityWebFilterChain securityWebFilterChain(
//			ServerHttpSecurity http) {
//		return http.authorizeExchange()
//				.anyExchange().authenticated()
//				.and().formLogin()
//				.and().build();
//	}

}
