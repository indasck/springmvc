package com.microservice.ApiGateway.client;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class ClientFilter implements GlobalFilter {

    
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        System.out.println("filter()...execute");

        ServerHttpRequest request = exchange.getRequest();
        HttpHeaders headers = request.getHeaders();
        Set<String> keyset = headers.keySet();

        if (!keyset.contains("secret")) {
            System.out.println("Missing 'secret' header.");
            throw new RuntimeException("Missing 'secret' header.");
        }

        List<String> secretValues = headers.get("secret");
        if (secretValues == null || secretValues.isEmpty() || !secretValues.get(0).equals("chenna@123")) {
            System.out.println("Invalid 'secret' header value.");
            throw new RuntimeException("Invalid 'secret' header value.");
        }

        System.out.println("Request passed filter checks.");
        return chain.filter(exchange);
    }
}
