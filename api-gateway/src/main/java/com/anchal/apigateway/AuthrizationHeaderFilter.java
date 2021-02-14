package com.anchal.apigateway;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;

@Component
public class AuthrizationHeaderFilter extends AbstractGatewayFilterFactory<AuthrizationHeaderFilter.Config> {

    public static class Config{
        //Put config propties
    }
    @Override
    public GatewayFilter apply(Config config) {

        return null;
    }
}
