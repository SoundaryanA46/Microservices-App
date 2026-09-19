package com.microservielearn.depart_service.Config;


import com.microservielearn.depart_service.Client.EmpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.reactive.LoadBalancedExchangeFilterFunction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class webClientconfig {

    @Autowired
    private LoadBalancedExchangeFilterFunction filterFunction;

    @Bean
    public WebClient empWebClient(){
        return WebClient.builder()
                .baseUrl("http://employee-service")
                .filter(filterFunction)
                .build();
    }

    @Bean
    public EmpClient empClient(){
        HttpServiceProxyFactory httpServiceProxyFactory =
                HttpServiceProxyFactory
                        .builder(WebClientAdapter.forClient(empWebClient()))
                        .build();

        return httpServiceProxyFactory.createClient(EmpClient.class);
   }

}
