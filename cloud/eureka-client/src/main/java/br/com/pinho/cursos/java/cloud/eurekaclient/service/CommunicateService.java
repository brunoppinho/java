package br.com.pinho.cursos.java.cloud.eurekaclient.service;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CommunicateService {

    private final EurekaClient eurekaClient;

    public CommunicateService(EurekaClient eurekaClient) {
        this.eurekaClient = eurekaClient;
    }

    public String execute() {
        InstanceInfo service = eurekaClient
                .getApplication("feign-example")
                .getInstances()
                .get(0);

        String hostName = service.getHostName();
        int port = service.getPort();

        String url = "http://" + hostName + ":" + port + "/hello";

        return new RestTemplate().getForObject(url, String.class);
    }
}
