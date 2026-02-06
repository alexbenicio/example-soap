package com.calculadora;

import javax.xml.ws.Endpoint;


public class ExampleSoapApplication {
    public static void main(String[] args) {
        // 1. Criamos a instancia da nossa implementação
        CalculadoraServerImpl calc = new CalculadoraServerImpl();
        
        // 2. Definimos a URL onde o serviço ficará disponível
        String url = "http://localhost:8080/calculadora";
        
        // 3. Publicamos o serviço
        System.out.println("Service rodando em: " + url + "?wsdl");
        Endpoint.publish(url, calc);
    }
}